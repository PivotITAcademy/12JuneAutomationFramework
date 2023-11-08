package com.naveenautomation.browsers;

public enum Browser {

	CHROME("Chrome"), 
	EDGE("Edge"), 
	SAMSUNG_BROWSER("Samsung Browser"),
	FIREFOX("Firefox"),
	IE("Internet Explorer"),
	SAFARI("Safari");

	String browser;

	private Browser(String browser) {
		this.browser = browser;
	}

}
