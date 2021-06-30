package com.master.product;

public class InvalidNumberException extends RuntimeException {

	private static final long serialVersionUID = -86614350324254231L;

	public InvalidNumberException() {
		super("Invalid number: this attribute can't be letter");
	}

	public InvalidNumberException(String message) {
		super(message);
	}
}