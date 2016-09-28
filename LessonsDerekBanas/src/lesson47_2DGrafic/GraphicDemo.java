package lesson47_2DGrafic;

import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.geom.*;
import java.security.spec.EllipticCurve;
@SuppressWarnings("Serial")

public class GraphicDemo extends JFrame{

	public static void main(String[] args) {
		
		new GraphicDemo();
	}
	
	public GraphicDemo(){
		this.setSize(500,500);
		this.setTitle("Draw Shapes");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(new DrawStuff(), BorderLayout.CENTER);
		this.setVisible(true);
		
	}
	
	private class	DrawStuff extends JComponent{
		public void paint(Graphics g){
			Graphics2D graph2 = (Graphics2D)g;
			graph2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			
			Shape drawLine = new Line2D.Float(20, 90, 55, 250);
			Shape drawArc2D0 = new Arc2D.Double(5, 150, 100, 100, 45, 180, Arc2D.OPEN);
			Shape drawArc2D1 = new Arc2D.Double(5, 200, 100, 100, 45, 45, Arc2D.CHORD);
			Shape drawArc2D2 = new Arc2D.Double(5, 250, 100, 100, 45, 45, Arc2D.PIE);
			
			graph2.setPaint(Color.BLACK);
			graph2.draw(drawLine);
			graph2.draw(drawArc2D0);
			graph2.draw(drawArc2D1);
			graph2.draw(drawArc2D2);
			
			Shape drawElise = new Ellipse2D.Float(200, 10, 100, 400);
			
			graph2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.40F));
			graph2.fill(drawElise);
			
			graph2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1F));
			
			GradientPaint theGradient = new GradientPaint(0,0, Color.BLACK, 0,60,  new Color(0xf6ffff));
			graph2.setPaint(theGradient);
			
			graph2.fill(new Rectangle2D.Float(0, 0, 100, 150));
			
			GradientPaint theGradient2 = new GradientPaint(0,0, Color.BLACK, 60,20,  new Color(0xf6ffff), true);
			graph2.setPaint(theGradient2);
			graph2.fill(drawElise);
			
		}
	}
}
