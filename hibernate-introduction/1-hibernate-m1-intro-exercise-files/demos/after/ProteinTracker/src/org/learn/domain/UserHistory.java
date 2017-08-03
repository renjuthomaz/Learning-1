package org.learn.domain;

import java.util.Date;

public class UserHistory {
	private int id;
	private Date tripTime;
	private String tripMode;
	private User user;

	UserHistory() {
		super();
	}

	public UserHistory(Date tripTime, String tripMode) {
		super();
		this.tripTime = tripTime;
		this.tripMode = tripMode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getTripTime() {
		return tripTime;
	}

	public void setTripTime(Date tripTime) {
		this.tripTime = tripTime;
	}

	public String getTripMode() {
		return tripMode;
	}

	public void setTripMode(String tripMode) {
		this.tripMode = tripMode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	// Needed if the mapping type is a value type.
	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + ((tripMode == null) ? 0 : tripMode.hashCode());
	 * result = prime * result + ((tripTime == null) ? 0 : tripTime.hashCode());
	 * return result; }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return
	 * true; if (obj == null) return false; if (getClass() != obj.getClass())
	 * return false; UserHistory other = (UserHistory) obj; if (tripMode ==
	 * null) { if (other.tripMode != null) return false; } else if
	 * (!tripMode.equals(other.tripMode)) return false; if (tripTime == null) {
	 * if (other.tripTime != null) return false; } else if
	 * (!tripTime.equals(other.tripTime)) return false; return true; }
	 */

}
