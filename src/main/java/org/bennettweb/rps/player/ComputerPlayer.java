/**
 * 
 */
package org.bennettweb.rps.player;

import java.util.Random;

import org.bennettweb.rps.hand.Hand;
import org.bennettweb.rps.hand.HandFactory;

/**
 * An implementation of a player where the computer controls the actions. Uses a
 * random number generator to pick a hand to play.
 * 
 * @author Steve
 */
public class ComputerPlayer implements Player {

	private Random rand;

	protected Hand chosenHand;

	protected HandFactory handFactory;

	private String name;

	/**
	 * Creates a new computer player with the given name.
	 * 
	 * @param name
	 *            Name of the player.
	 */
	public ComputerPlayer(String name) {
		rand = new Random();
		handFactory = new HandFactory();
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.bennettweb.rps.player.Player#initialise()
	 */
	public void initialise() {
		// do nothing
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.bennettweb.rps.player.Player#choose()
	 */
	public void choose() {
		this.chosenHand = handFactory.choices().get(
				rand.nextInt(handFactory.choices().size()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.bennettweb.rps.player.Player#draw()
	 */
	public Hand draw() {
		return this.chosenHand;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.bennettweb.rps.player.Player#getName()
	 */
	public String getName() {
		return this.name;
	}

}
