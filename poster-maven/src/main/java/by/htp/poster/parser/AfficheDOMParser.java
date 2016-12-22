package by.htp.poster.parser;

import java.beans.EventSetDescriptor;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import by.htp.poster.domain.Event;
import by.htp.poster.domain.Exhibition;
import by.htp.poster.domain.Movie;
import by.htp.poster.domain.Opera;

public class AfficheDOMParser {
	
	public static void main(String[] args) {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		
		Document document;
		Element afficheRoot;
		NodeList eventsNode = null;
		
		try {
			builder = factory.newDocumentBuilder();
			document = builder.parse(new InputSource("files/affiche.xml"));
			
			afficheRoot = document.getDocumentElement(); //root element
			
			String att = afficheRoot.getAttribute("city");
			System.out.println(att);
			
			eventsNode = afficheRoot.getElementsByTagName("events"); //get all events ad Nodes (tags)
			
			for (int i = 0; i < eventsNode.getLength(); i++) {
				
				Element events = (Element) eventsNode.item(i); //get concrete event tag as Element from events tag
				NodeList allEvents = events.getChildNodes(); //get all event tags
				
				for (int j = 0; j < allEvents.getLength(); j++) {
					Node eventNode = allEvents.item(j);
					
					Element eventElement;
					
					if (eventNode.getNodeType() == 1) {
						eventElement = (Element) eventNode;
						Event eventEntity = buildEvent(eventElement, eventNode.getNodeName());
						System.out.println(eventEntity);
					}
				}
			}
			
		} catch (SAXException | ParserConfigurationException | ParseException | IOException e) {
		
			
			}
		
		
		}
	
	public static Event buildEvent(Element element, String nodeName) throws ParseException {
		Event event = null;
		System.out.println("nodeName: " + nodeName);
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		switch (nodeName) {
		case "movie":
			Movie movie = new Movie();
			movie.setTitle(getSingleElementContent(element, "title"));
			movie.setPlace(getSingleElementContent(element, "place"));
			movie.setPrice(new BigDecimal(getSingleElementContent(element, "price")));
			movie.setDate(df.parse(getSingleElementContent(element, "date")));
			movie.setTime(getSingleElementContent(element, "time"));
			event = movie;
			break;
		case "opera":
			Opera opera = new Opera();
			opera.setTitle(getSingleElementContent(element, "title"));
			opera.setPlace(getSingleElementContent(element, "place"));
			opera.setPrice(new BigDecimal(getSingleElementContent(element,"price")));
			opera.setDate(df.parse(getSingleElementContent(element, "date")));
			opera.setTime(getSingleElementContent(element, "time"));
			event = opera;
			break;
		case "exsibition":
			Exhibition exsibition = new Exhibition();
			exsibition.setTitle(getSingleElementContent(element, "title"));
			exsibition.setPlace(getSingleElementContent(element, "place"));
			exsibition.setPrice(new BigDecimal(getSingleElementContent(element,"price")));
			exsibition.setDate(df.parse(getSingleElementContent(element, "date")));
			exsibition.setTime(getSingleElementContent(element, "time"));
			event = exsibition;
			break;
		}
		return event;
		
	}
	
	private static String getSingleElementContent(Element element, String tagName) {
		
		NodeList list = element.getElementsByTagName(tagName);
		Element el = (Element) list.item(0);
		
		String content = el.getTextContent().trim();
		return content;
				
		
	}
		
	}


