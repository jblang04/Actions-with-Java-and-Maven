/**
 * 
 */
package org.bennettweb.rps.player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.bennettweb.rps.hand.Hand;

/**
 * Helper class for communicating via command line. 
 * @author Steve
 */
class CommandLineIO {

	public void printChoices(List<Hand> choices) {
		StringBuffer message = new StringBuffer("Please choose [");
		for (Hand h : choices) {
			message.append(h.getName() + " ");
		}
		message.append("]");
		System.out.println(message);
	}

	public void printHelpMessage(List<Hand> choices) {
		System.out.println("I didn't recognise that choice. Please try again.");
		printChoices(choices);
	}

	public String readLine() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		return reader.readLine();
	}

	public void printAskForName() {
		System.out.println("So, what's your name?");
	}

	public void print(String message) {
		System.out.println(message);
	}

}
