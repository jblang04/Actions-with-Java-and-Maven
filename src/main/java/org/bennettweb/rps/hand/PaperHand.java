package org.bennettweb.rps.hand;



/**
 * An implementation of the Paper hand.
 * 
 * @author Steve
 */
public class PaperHand extends AbstractHand {
	
	private static final String NAME = "paper";

	public PaperHand() {
		this.addToBeatableHands(RockHand.class);
	}
	
	public String getName() {
		return NAME;
	}
	
}
