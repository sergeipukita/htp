package by.htp.poster.dao.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import by.htp.poster.domain.Event;
import by.htp.poster.domain.Exhibition;
import by.htp.poster.domain.Movie;
import by.htp.poster.domain.Opera;

public class AfficheXMLHendler extends DefaultHandler {
	
	private String value;

	@Override
	public void startDocument() throws SAXException {
		System.out.println("Start document");

		// super.startDocument();
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("End document");

		// super.endDocument();
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		System.out.println(qName);
		attributes.getValue(qName);
		Event event;
		if((qName.equals("event")) && (qName != null)){
			String type = attributes.getValue(qName);
			switch (type) {
			case "Movie":
				event = new Movie();
		
				break;
			case "Opera":
				event = new Opera();
						
			case "Exhibition":
				event = new Exhibition();
				break;
			default:
			}
			
		}
	}

		// super.startElement(uri, localName, qName, attributes);
	

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		System.out.println(qName);

		// super.endElement(uri, localName, qName);
	}

}
