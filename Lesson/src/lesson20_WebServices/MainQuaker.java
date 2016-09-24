package lesson20_WebServices;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class MainQuaker {

	public static void main(String[] args) {
		
		ArrayList<Quake> earthquakes = getQuake("http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/2.5_week.atom");
		
		System.out.println("Todays earthquakes with rich 2.5 or higher:");
		SimpleDateFormat df = new SimpleDateFormat("HH:MM");
		System.out.printf("%s\t%-25s\t%20s\t%s\n", "WHEN", "Lat / Long", "Magnitude", "Details");
		
		for(Quake q : earthquakes){
			System.out.printf("%s\t%-30s\t%.1f\t%-120s\n", df.format(q.getDate()),q.getLocation(), q.getmagnitude(), q.getDetails() ); 
		}
	}	
	
	public static ArrayList<Quake> getQuake(String url){
		ArrayList<Quake> quakes = new ArrayList<>();
		
		try{
			URL eqCenterUrl = new URL(url);
			URLConnection connection = eqCenterUrl.openConnection();
			HttpURLConnection httpConnection = (HttpURLConnection) connection;
			int responseCode = httpConnection.getResponseCode();
			
			if(responseCode == HttpURLConnection.HTTP_OK){
				InputStream in = httpConnection.getInputStream();
				
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
				DocumentBuilder db = dbf.newDocumentBuilder();
				
				Document dom = db.parse(in);
				Element docElement = dom.getDocumentElement();
				NodeList nl = docElement.getElementsByTagName("entry");
				
				if(nl != null && nl.getLength() > 0){
					for(int i=0; i < nl.getLength(); i++){
						Element entry = (Element) nl.item(i);
						Element title  = (Element) entry.getElementsByTagName("title").item(0);
						Element g = (Element) entry.getElementsByTagName("georss:point").item(0);
						Element when = (Element) entry.getElementsByTagName("updated").item(0);
						Element link = (Element) entry.getElementsByTagName("link").item(0);
						String details = title.getFirstChild().getNodeValue();
						String hostname = "http//:http://earthquake.usgs.gov";
						String linkString = hostname + link.getAttribute("href");
						
						String point = g.getFirstChild().getNodeValue();
						String dt = when.getFirstChild().getNodeValue();
						SimpleDateFormat sdformat = new SimpleDateFormat("yyy-mm-dd'T'hh:mm:ss.SSS'Z'");
						Date qdate = new GregorianCalendar(0, 0 , 0).getTime();
						qdate = sdformat.parse(dt);
						
						String[] locationPair = point.split(" ");
						String location = "lat: " + locationPair[0]+ " Long: " + locationPair[1];
						
						String magnitudeString = details.split(" ")[1];
						double magnitude = Double.parseDouble(magnitudeString);
						
						//details = details.split(" ")[1].trim();
						
						Quake q = new Quake(qdate, details, location, magnitude, linkString);
					
						quakes.add(q);
						
					}
				}
				
				
				
				
				
			}
		
		} catch (MalformedURLException ex){
			System.out.printf("Error: %s", ex);
		}catch (IOException ex){
			System.out.printf("Error: %s", ex);
		} catch (ParserConfigurationException ex) {
			System.out.printf("Error: %s", ex);
		} catch (SAXException ex) {
			System.out.printf("Error: %s", ex);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return quakes;
	}
		


}
