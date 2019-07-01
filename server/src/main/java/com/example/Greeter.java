package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }
  
  /**
   * @param someone name of a person
   * @return greeting String
   */

  //TODO: Add javadoc comment
  public final String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
