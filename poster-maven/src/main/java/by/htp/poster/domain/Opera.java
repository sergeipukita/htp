package by.htp.poster.domain;

import java.math.BigDecimal;
import java.util.Date;

import by.htp.poster.domain.Event;

;

public class Opera extends Event {

	private Singer singer;

	public Opera() {
	}

	public Opera(String title, Date date, String time, String place,
			BigDecimal price) {
		super(title, date, time, place, price);
		// TODO Auto-generated constructor stub
	}

	public Opera(Singer singer) {
		super();
		this.singer = singer;
	}

	public Opera(String title, Date date, String time, String place,
			BigDecimal price, Singer singer) {
		super(title, date, time, place, price);
		this.singer = singer;
	}

	public Singer getSinger() {
		return singer;
	}

	public void setSinger(Singer singer) {
		this.singer = singer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((singer == null) ? 0 : singer.hashCode());
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
		Opera other = (Opera) obj;
		if (singer == null) {
			if (other.singer != null)
				return false;
		} else if (!singer.equals(other.singer))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Opera [" + super.toString()+ ", singer=" + singer + "]";
	}

}
