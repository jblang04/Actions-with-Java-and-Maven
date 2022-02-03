/**
 * 
 */
package org.bennettweb.rps.game;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.bennettweb.rps.player.Player;

/**
 * Reports out to the console, storing the amount of games won.
 * 
 * @author Steve
 */
public class SysoutResultReporter implements ResultReporter {

	private Map<Player, Integer> winRecord;

	public SysoutResultReporter() {
		winRecord = new HashMap<Player, Integer>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.bennettweb.rps.game.ResultReporter#report(int,
	 * org.bennettweb.rps.player.Player)
	 */
	public void report(int round, Player winner) {
		if (winner == null) {
			System.out.println("Round " + round + " was a draw.");
		} else {
			System.out.println("Round " + round + " was won by player "
					+ winner.getName());
			if (winRecord.containsKey(winner)) {
				winRecord.put(winner, winRecord.get(winner) + 1);
			} else {
				winRecord.put(winner, 1);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.bennettweb.rps.game.ResultReporter#summarize()
	 */
	public void summarize() {
		for (Entry<Player, Integer> e : winRecord.entrySet()) {
			System.out.println("Player " + e.getKey().getName() + " won "
					+ e.getValue() + " times");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.bennettweb.rps.game.ResultReporter#reportChoices(java.util.List)
	 */
	public void reportChoices(List<Player> players) {
		for (Player p : players) {
			System.out.println("Player " + p.getName() + " chose "
					+ p.draw().getName());
		}
	}

}
