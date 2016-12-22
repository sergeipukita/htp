package by.htp.poster.domain;

import java.math.BigDecimal;
import java.util.Date;

import by.htp.poster.domain.Event;

;

public class Movie extends Event {

	private Genre genre;
	private double rating;

	

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(String title, Date date, String time, String place,
			BigDecimal price) {
		super(title, date, time, place, price);
		// TODO Auto-generated constructor stub
	}
	

	public Movie(String title, Date date, String time, String place,
			BigDecimal price, Genre genre, double rating) {
		super(title, date, time, place, price);
		this.genre = genre;
		this.rating = rating;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		long temp;
		temp = Double.doubleToLongBits(rating);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Movie other = (Movie) obj;
		if (genre != other.genre)
			return false;
		if (Double.doubleToLongBits(rating) != Double
				.doubleToLongBits(other.rating))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Movie [" + super.toString()+ ", genre=" + genre + ", rating=" + rating + "]";
	}
	

}
