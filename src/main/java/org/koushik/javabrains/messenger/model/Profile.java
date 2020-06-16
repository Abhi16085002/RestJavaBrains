package org.koushik.javabrains.messenger.model;

import java.util.Date;

public class Profile {
	
	private long id;
	private String firstName;
	private String lastName;
	private String profileName;
	private Date created;
	
	
	public Profile() {
		
	}
	
	public Profile(long id, String firstName, String lastName, String profileName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.profileName = profileName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	
	
	

}
