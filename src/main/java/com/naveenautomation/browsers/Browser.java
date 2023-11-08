package com.naveenautomation.browsers;

public enum Browser {

	CHROME("Chrome"), 
	EDGE("Edge"), 
	FIREFOX("Firefox"), 
	OPERA("Opera"),
	SAFARI("Safari");

	String browser;

	private Browser(String browser) {
		this.browser = browser;
	}

}
