/**
 * 
 */
package org.bennettweb.rps.hand;

/**
 * An implementation of the Rock Hand.
 * 
 * @author Steve
 */
public class RockHand extends AbstractHand {
	
	private static final String NAME = "rock";

	public RockHand() {
		this.addToBeatableHands(ScissorsHand.class);
	}
	
	public String getName() {
		return NAME;
	}
}
