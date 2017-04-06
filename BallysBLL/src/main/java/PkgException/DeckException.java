package PkgException;

import pkgPokerBLL.Deck;

public class DeckException extends Exception{
	
	private Deck deck;
	
	public DeckException(Deck d){
		System.out.println("Drawing from empty deck");
	}

}