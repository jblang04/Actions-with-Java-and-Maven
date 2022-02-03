/**
 * 
 */
package org.bennettweb.rps.player;

import org.bennettweb.rps.hand.Hand;

/**
 * A player of Rock, Paper, Scissors. A player is not intended to be thread-safe
 * and can therefore only play one game at a time.
 * 
 * @author Steve
 */
public interface Player {
	
	/**
	 * Called to initialise a player
	 */
	void initialise();

	/**
	 * Called to initiate the choosing of a hand for this player.
	 */
	void choose() throws PlayerException;

	/**
	 * Shows the players hand.
	 */
	Hand draw();
	
	/**
	 * @return The players name
	 */
	String getName();
}
