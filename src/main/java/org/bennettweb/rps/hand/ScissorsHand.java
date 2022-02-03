/**
 * 
 */
package org.bennettweb.rps.hand;

/**
 * An implementation of the Scissors Hand.
 * 
 * @author Steve
 */
public class ScissorsHand extends AbstractHand {
	
	private static final String NAME = "scissors";

	public ScissorsHand() {
		this.addToBeatableHands(PaperHand.class);
	}
	
	public String getName() {
		return NAME;
	}
}
