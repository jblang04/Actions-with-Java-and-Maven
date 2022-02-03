package org.bennettweb.rps.hand;

/**
 * The hand that a player can play in the game.
 * 
 * @author Steve
 */
public interface Hand {

	/**
	 * used as the result of the comparison. Either indicates that this hand
	 * wins, loses or draws.
	 */
	enum HandCompareResult {
		Win, Lose, Draw;
	}

	/**
	 * @param otherHand
	 * @return The result of comparing the two hands. This hand is the context
	 *         of the result. Eg Win means this hand wins.
	 */
	HandCompareResult beats(Hand otherHand);

	/**
	 * @return This hands name.
	 */
	String getName();
}
