/**
 * 
 */
package org.bennettweb.rps.game;

import java.util.List;

import org.bennettweb.rps.hand.Hand;
import org.bennettweb.rps.hand.Hand.HandCompareResult;
import org.bennettweb.rps.player.Player;

/**
 * A two player engine. Used by the two player game.
 * 
 * @author Steve
 */
public class TwoPlayerEngine {
	
	private static final int NUMBER_OF_PLAYERS = 2;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.bennettweb.rps.game.Engine#determineWinner(Map)
	 */
	public Player determineWinner(List<Player> players) {
		if (players == null || players.size() != NUMBER_OF_PLAYERS) {
			throw new IllegalArgumentException("You need to have two players to use this engine.");
		}
		
		Hand player1Hand = players.get(0).draw();
		Hand player2Hand = players.get(1).draw();

		HandCompareResult result = player1Hand.beats(player2Hand);
		
		switch (result) {
		case Win:
			return players.get(0);
		case Lose:
			return players.get(1);
		default:
			return null;
		}
	}

}
