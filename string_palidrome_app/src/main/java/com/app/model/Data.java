package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Data {
	@Id
	@GeneratedValue
	private int id;
	private String longestPalindrome;
	
	public Data() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLongestPalindrome() {
		return longestPalindrome;
	}

	public void setLongestPalindrome(String longestPalindrome) {
		this.longestPalindrome = longestPalindrome;
	}
	
}
