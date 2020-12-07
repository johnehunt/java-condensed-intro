package com.jjh.domain;

public interface Organizer {
	int MAX = 100;
	int MIN = 0;
	
	void add(String appointment, String date);
	String get(String date);
	boolean remove(String date);
}
