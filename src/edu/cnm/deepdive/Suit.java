package edu.cnm.deepdive;
/**
 *  This enum implements suits of a standard playing cards. Each enumerated value
 *  uses the standard symbol for that suit (taken from Unicode), as itss string
 *  representation
 *
 * @author Ethan Lyons
 * @version 1.0
 */
public enum Suit {
  CLUBS("\u2663"),
  DIAMONDS("\u2662"),
  HEARTS("\u2661"),
  SPADES("\u2660");

  private final String symbol;

  private Suit(String symbol) {
    this.symbol = symbol;
  }

  @Override
  public String toString()  {
      return symbol;
  }

}