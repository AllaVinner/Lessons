package lessonb19_Regex;

import java.util.regex.*;

public class RegexDemo {
	//Regularexpresions
	public static void main(String[] args) {
		
		String longString = " Derek Banas CA 12345 PA (412)555-1212 johnsmith@hotmail.com 412-555-1234 412 555-1234 ";
		String strangeString = " 1Z aaa **** *** {{{ {{ { ";
		String myString = "Hej jag gillar cyklar som kan anfalla Alligatorer.";
		
//		[0-9] - Any character you want
//		[^A-G] - Any character, not normal
//		\\s - whitespace
//		\\S - not white space
//		\\w - anny character = [A-Za-z0-9]
// 		\\d - digets
// 		\\D - not digets
// 		{5} - happends five times
//		+ - the thing after most appear at least once
//		.^ * + ? {} [] () | \ need to be \\
//		? thing before dos not need to exist
		
//		{n,m} - n =min, m =max
//		{5,} - 5 min, no max

		
		// Word that is 2 to 20 characters in length
		// [A-Za-z]{2,20} - regular expression
		// \\w{2,20}
		//regexChecker("\\s[A-Za-z]{2,20}\\s", longString);
		
		//Zip code with five digets
		//regexChecker("\\s\\d{5}\\s", longString);
		
		//2 words that start with C or A
		//regexChecker("A[A-Za-z]{2,20}|a[A-Za-z]{2,20}|C[A-Za-z]{2,20}|c[A-Za-z]{2,20}", myString);
	
//		regexChecker("(\\{{1,})", strangeString);
//		regexChecker(".{3}", strangeString);
		
		
		//find E-mail adress
		//regexChecker("[A-Za-z0-9._%-]+@[A-Za-z0-9._%-]+\\.+[A-Za-z]{2,4}", longString);
		
		regexReplace(longString);
		
		
	}

	private static void regexChecker(String theRegex, String str2Check) {
		Pattern checkRegex = Pattern.compile(theRegex);
		Matcher regexMatcher = checkRegex.matcher(str2Check);
		
		while(regexMatcher.find()){
			if(regexMatcher.group().length() != 0){
				System.out.println(regexMatcher.group().trim());
				System.out.println("Start index " + regexMatcher.start());
				System.out.println("End index " + regexMatcher.end());
				
			}
		}
	}
	
	public static void regexReplace(String str2replace) {
		Pattern replace = Pattern.compile("1+2	");
		Matcher regexMatcher = replace.matcher(str2replace.trim());
		
		System.out.println(regexMatcher.replaceAll("jag"));
	}
	
	
}
