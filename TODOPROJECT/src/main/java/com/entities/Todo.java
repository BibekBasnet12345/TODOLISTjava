package com.entities;

import java.util.*;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Todo")
public class Todo {
	@Id
  private int id;
  private String title;
  @Column(length = 1500)
  private String  content;
  private  Date  added_date ;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Date getAdded_Date() {
	return  added_date;
}
public void setAdded_Date(Date added_Date) {
	this.added_date = added_Date;
}
public Todo( String title, String content, java.util.Date date) {
	super();
	this.id  = new Random().nextInt(10000);
	this.title = title;
	this.content = content;
	this.added_date =  date;
}
public Todo() {
	super();
	// TODO Auto-generated constructor stub
}
  
  
}
