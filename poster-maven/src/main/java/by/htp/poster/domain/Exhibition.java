package by.htp.poster.domain;

import java.math.BigDecimal;
import java.util.Date;

import by.htp.poster.domain.Event;

public class Exhibition extends Event {

	private String theme;
	private String author;

	public Exhibition() {
	}

	public Exhibition(String title, Date date, String time, String place,
			BigDecimal price) {
		super(title, date, time, place, price);
		// TODO Auto-generated constructor stub
	}

	public Exhibition(String theme, String author) {
		super();
		this.theme = theme;
		this.author = author;
	}

	public Exhibition(String title, Date date, String time, String place,
			BigDecimal price, String theme, String author) {
		super(title, date, time, place, price);
		this.theme = theme;
		this.author = author;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((theme == null) ? 0 : theme.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exhibition other = (Exhibition) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (theme == null) {
			if (other.theme != null)
				return false;
		} else if (!theme.equals(other.theme))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Exhibition [" + super.toString()+ ", theme=" + theme + ", author=" + author + "]";
	}

}
