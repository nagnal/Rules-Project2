package com.drools.example.dsl;

public class Message {
    private String message;
    private String originalWord;

	public Message(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public String getOriginalWord() {
		return originalWord;
	}

	public void setOriginalWord(String originalWord) {
		this.originalWord = originalWord;
	}

	@Override
	public String toString() {
		return "Message{" +
				"message='" + message + '\'' +
				", originalWord='" + originalWord + '\'' +
				'}';
	}
}
