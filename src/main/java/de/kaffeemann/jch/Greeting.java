package de.kaffeemann.jch;

public class Greeting {
    
    private final String language;
	private final String content;

	public Greeting(String language, String content) {
		this.language = language;
		this.content = content;
	}

	public String getLanguage() {
		return language;
	}

	public String getContent() {
		return content;
	}
}
