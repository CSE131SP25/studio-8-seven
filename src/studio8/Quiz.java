package studio8;

import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class Quiz {
	
	private Question[] questions;
	/**
	 * Constructor
	 * @param questions
	 */
	public Quiz(Question[] questions) {
		this.questions = questions;
	}
	
	/**
	 * Prompts the user to answer, then returns a String containing their answer.
	 * @param in
	 * @return String answer
	 */
	private String getUserAnswer(Scanner in) {
		System.out.print("Please enter your answer: ");
		String out = in.next();
		return out;
	}
	
	/**
	 * Gets the number of points possible in the quiz.
	 * @return int number of total points
	 */
	public int getTotalPoints() {
		int sum = 0;
		for (Question q: questions) {
			sum += q.getPoints();
		}
		return sum;
	}
	
	/**
	 * Asks the user all question in the quiz, then prints out 
	 * the amount of points the user earned. This print statement
	 * should include "You earned ____ points"
	 * 
	 * @param in Scanner object to feed into getUserAnswer
	 */
	public void takeQuiz(Scanner in) {
		int points = 0;
		for(Question q: questions) {
			q.displayPrompt();
			String givenAnswer = this.getUserAnswer(in);
			points += q.checkAnswer(givenAnswer);
		}
		System.out.println("You earned " + points + " points");
	}
	
	
	public static void main(String[] args) {
		// TODO: Make your own Quiz!
	}
}
