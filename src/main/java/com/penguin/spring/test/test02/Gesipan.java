package com.penguin.spring.test.test02;

public class Gesipan {

	//title, user, content 
	private String title;
	private String user;
	private String content;
	
	public Gesipan(String title, String user, String content) {
		this.title = title;
		this.user = user;
		this.content = content;	
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	@Override
	public String toString () {
		return "(title : " + this.title + " user : " + this.user + " content : " + this.content + ")";
	}
	
	
	
	
	
	
	
	
}
