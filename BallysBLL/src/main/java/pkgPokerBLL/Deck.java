package pkgPokerBLL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

import PkgException.DeckException;
import pkgPokerEnum.eRank;
import pkgPokerEnum.eSuit;

public class Deck {

	private UUID DeckID;
	private ArrayList<Card> DeckCards = new ArrayList<Card>();
	private int iCardNbr;

	public Deck() {

		super();
		iCardNbr = 0;
		for (eSuit suit : eSuit.values()) {
			for (eRank rank : eRank.values()) {
				if ((suit != eSuit.JOKER) && (rank != eRank.JOKER)) {
					DeckCards.add(new Card(rank, suit, ++iCardNbr));
				}
			}
		}
		Collections.shuffle(DeckCards);
	}

	public Deck(int nbrOfJokers) {
		this();
		for(int i = 0; i < nbrOfJokers; i++){
			DeckCards.add(new Card(eRank.JOKER, eSuit.JOKER, ++iCardNbr));
		}
		Collections.shuffle(DeckCards);
	}
	
	public ArrayList<Card> removeCards(){
		DeckCards.clear();
		return DeckCards;
	}

	public Card DrawCard() throws DeckException {

		if (DeckCards.size() == 0) {
			throw new DeckException(this);
		} 
		else
			return DeckCards.remove(0);
	}

	public ArrayList<Card> getCards() {
		return DeckCards;
	}
}