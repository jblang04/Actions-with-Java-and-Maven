/**
 * 
 */
package org.bennettweb.rps.game;

import org.bennettweb.rps.player.Player;

/**
 * The game of rock, paper, scissors which is composed of two {@link Player}s
 * and multiple rounds.
 * 
 * @author Steve
 */
public interface Game {

	/**
	 * Adds a new player to the game.
	 * 
	 * @param player
	 *            The {@link Player} to add.
	 * @throws GameException
	 */
	void addPlayer(Player player) throws GameException;

	/**
	 * Set the number of rounds to play.
	 * 
	 * @param numberOfRounds
	 */
	void setNumberOfRound(int numberOfRounds);

	/**
	 * Play the game.
	 */
	void play() throws GameException;
}
