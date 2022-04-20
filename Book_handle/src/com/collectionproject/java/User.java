package com.collectionproject.java;

public class User {
	
	int userId;
	String username;
	String emailId;
	String password;
	Book newBooks;
	Book favorite;
	Book completed;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Book getNewBooks() {
		return newBooks;
	}
	public void setNewBooks(Book newBooks) {
		this.newBooks = newBooks;
	}
	public Book getFavorite() {
		return favorite;
	}
	public void setFavorite(Book favorite) {
		this.favorite = favorite;
	}
	public Book getCompleted() {
		return completed;
	}
	public void setCompleted(Book completed) {
		this.completed = completed;
	}
	

}
