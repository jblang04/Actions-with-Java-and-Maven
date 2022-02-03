/**
 * 
 */
package org.bennettweb.rps.player;

import java.io.IOException;

import org.bennettweb.rps.hand.Hand;
import org.bennettweb.rps.hand.HandChoiceException;
import org.bennettweb.rps.hand.HandFactory;

/**
 * The implementation of a player which takes input from a real user of the
 * application. Reads values to play from the command line.
 * 
 * @author Steve
 */
public class CommandLineHumanPlayer implements Player {

	protected Hand chosenHand;

	protected HandFactory handFactory;

	protected CommandLineIO commandLineIO;

	private String name;

	public CommandLineHumanPlayer() {
		handFactory = new HandFactory();
		commandLineIO = new CommandLineIO();
		name = "player1";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.bennettweb.rps.player.Player#initialise()
	 */
	public void initialise() {
		commandLineIO.printAskForName();
		try {
			this.name = commandLineIO.readLine();
		} catch (IOException e) {
			commandLineIO
					.print("I didn't catch that, so I'm going to call you player1");
			this.name = "player1";
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.bennettweb.rps.player.Player#choose()
	 */
	public void choose() throws PlayerException {
		this.chosenHand = null;

		while (this.chosenHand == null) {
			commandLineIO.printChoices(handFactory.choices());
			try {
				String choice = commandLineIO.readLine();
				this.chosenHand = handFactory.createHand(choice);
			} catch (HandChoiceException e) {
				commandLineIO.printHelpMessage(handFactory.choices());
				continue;
			} catch (IOException e) {
				throw new PlayerException("Failed to read choice", e);
			}
		}
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
