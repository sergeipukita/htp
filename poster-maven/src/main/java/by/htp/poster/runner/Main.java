package by.htp.poster.runner;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Locale;
//import java.util.Properties;
//import java.util.ResourceBundle;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;






import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import by.htp.poster.dao.xml.AfficheXMLHendler;
import by.htp.poster.domain.*;
import by.htp.poster.logic.AfficheViewer;
import by.htp.poster.logic.impl.ConsoleAfficheViewer;

//public class Main {

//	private final static Logger Log = LogManager.getLogger();

	/*
	 * public static void main(String[] args) {
	 * 
	 * Event movie = new Movie("White Shark", new Date(), "15:45", "Мир", new
	 * BigDecimal(5.5), Genre.HORROR, 18); Event opera = new Opera("Opera", new
	 * Date(), "19:45", "Тетр оперы и балета", new BigDecimal(25.5), new Singer(
	 * "Johnson")); Event exhibition = new Exhibition("Exhibition#1", new
	 * Date(), "12:50", "Холл Дворца республики", new BigDecimal(4.0), "BY",
	 * "А.Г."); Affiche affiche = new Affiche("Минск"); affiche.addEvent(movie);
	 * affiche.addEvent(opera); affiche.addEvent(exhibition);
	 * 
	 * AfficheViewer viewer = new ConsoleAfficheViewer();
	 * viewer.loadAffiche(affiche);
	 * 
	 * System.out.println(affiche);
	 * 
	 * }
	 */

	/*public static void main(String[] args) {
		Properties property = new Properties();
		try {
			property.load(new FileInputStream("resources/config.properties"));
			System.out.println(property.getProperty("name"));
			ResourceBundle bundleRU = ResourceBundle.getBundle("config",
					new Locale("ru_RU"));
			ResourceBundle bundleEN = ResourceBundle.getBundle("config",
					Locale.ENGLISH);
			System.out.println(bundleRU.getString("file"));
			System.out.println(bundleEN.getString("name"));
		} catch (Exception e) {
			
			Log.error("Some error1");
			Log.info("Some error2");
			Log.debug("Some error3");
			Log.error("Some error4");
			// e.printStackTrace();
		}

	}*/

/*	public static void main(String[] args) throws SAXException, IOException {
		
		XMLReader reader = XMLReaderFactory.createXMLReader();
		
		InputSource source = new InputSource("files/affiche.xml");
		AfficheXMLHendler handler = new AfficheXMLHendler();
		reader.setContentHandler(handler);
		
		reader.parse(source);
		
		
	}

}*/
