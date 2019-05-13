package test;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class I18NTest {
	private static final ResourceBundle bundle = ResourceBundle.getBundle("I18N", Locale.US);  
	private static final ResourceBundle bundle2 = ResourceBundle.getBundle("I18N", Locale.CHINA);
	
	public static void main(String [] args) { 
		Locale frenchLocale = new Locale("da","DK");

	    System.out.println("\nfr Locale Properties:\n");
	    System.out.println(frenchLocale.getDisplayCountry());  
	    System.out.println(frenchLocale.getDisplayLanguage());  
	    System.out.println(frenchLocale.getDisplayName());  
	    System.out.println(frenchLocale.getISO3Country());  
	    System.out.println(frenchLocale.getISO3Language());  
	    System.out.println(frenchLocale.getLanguage());  
	    System.out.println(frenchLocale.getCountry());  
	      
		Object[] params = {"hello"};
	    System.out.println("Message in "+Locale.US +": " + MessageFormat.format(bundle.getString("message"), params));  

	    System.out.println("Message in "+Locale.CHINA +": " + MessageFormat.format(bundle2.getString("message"), params));
	      
	    Locale enLocale = new Locale("en", "US");  
	    Locale daLocale = new Locale("da", "DK");

	    NumberFormat numberFormat = NumberFormat.getCurrencyInstance(daLocale);

	    System.out.println(numberFormat.format(100.76));

	    numberFormat = NumberFormat.getInstance(enLocale);
	    numberFormat = NumberFormat.getCurrencyInstance(enLocale);

	    System.out.println(numberFormat.format(100.76));
	}
}
