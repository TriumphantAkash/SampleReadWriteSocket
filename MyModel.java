package sampleSocketConnection;

import java.io.Serializable;

public class MyModel implements Serializable{

	private int number;
	private String pattern;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
	
}
