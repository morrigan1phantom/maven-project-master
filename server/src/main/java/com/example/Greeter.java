package com.example;

/**
 * This is a class.
 */
public class Greeter {
	
	String myText = "How are you now man?";

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  //TODO: Add javadoc comment
  public String greet(String someone) {
    return String.format("Hello, %s!", someone + ". " + myText+ "...");
  }
}
