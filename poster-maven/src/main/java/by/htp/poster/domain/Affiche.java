package by.htp.poster.domain;

import java.util.HashSet;
import java.util.Set;

public class Affiche {

	private Set<Event> events;
	private final String city;

	public Affiche(String city) {
		events = new HashSet<Event>();
		this.city = city;

	}

	public Set<Event> getEvents() {
		return events;
	}

	public void setEvents(Set<Event> events) {
		this.events = events;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Affiche [events=" + events + ", city=" + city + "]";
	}

	public boolean addEvent(Event event) {
		if (event != null) {
			events.add(event);
			return true;
		} else
			return false;
	}
}
