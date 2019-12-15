package com.acme.utils;

public class MyDate {
private byte day;
private byte month;
private short year;

public MyDate(){
	this(1,1,1970);
}

public MyDate(int m, int d, int y) {
	setDate(m,d,y);
}

public String toString() {
	return month + "/" + day + "/" + year;
}

private boolean valid(int day, int month, int year) {
	if(day < 1  || day > 31 || month < 1 || month > 12) {
		System.out.println("Sorry, " + day + "/" + month + "/" + year + " is not a valid date.");
		return false;
	}
	switch (month) {
	case 4: case 6: case 9: case 11: return (day <= 30);
	case 2: return day <= 28 || (day <= 29 && year % 4 == 0);
	}
	return true;
	}


public int getDay() {
	return day;
}

public int getMonth() {
	return month;
}

public int getYear() {
	return year;
}

public void setDay(int day) {
	if (valid(day, month, year)) {
	this.day = (byte)day;
}}

public void setMonth(int month) {
	if (valid(day, month, year)) {
	this.month = (byte)month;
}}

public void setYear(int year) {
	if (valid(day, month, year)) {
	this.year = (short)year;
}}

public void setDate(int m, int d, int y) {
	if (valid(d, m, y)) {
	day = (byte)d;
	month = (byte)m;
	year = (short)y;
}}



public static void leapYears() {
	for (int i = 1752; i <= 2020; i = i + 4) {
		if ((i % 100 != 0) || (i % 400 == 0)) {
			System.out.println("The year " + i + " is a leap year.");
		}
	}
}
}



