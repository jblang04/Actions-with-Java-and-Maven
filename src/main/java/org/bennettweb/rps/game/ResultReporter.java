/**
 * 
 */
package org.bennettweb.rps.game;

import java.util.List;

import org.bennettweb.rps.player.Player;

/**
 * Used to report the result of a game or hand.
 * 
 * @author Steve Bennett
 */
public interface ResultReporter {

	/**
	 * Shows all the choices made by the players.
	 * 
	 * @param players
	 *            A list of players
	 */
	void reportChoices(List<Player> players);

	/**
	 * Reports on a round.
	 * 
	 * @param round
	 *            the round number to report
	 * @param Player
	 *            The winner of the round, or null if its a draw
	 */
	void report(int round, Player result);

	/**
	 * Produces a summary of the reports we know about
	 */
	void summarize();
}
