package PkgException;

import java.util.ArrayList;

import pkgPokerBLL.Hand;

public class HandException extends Exception{
	
	private int numCards;
	private Hand hand;
	private ArrayList<Hand> HandList;
	
	public HandException(){
		
	}
	
	public HandException(int numCards){
		System.out.println("Cards in hand not equal to 5");
	}


	public HandException(ArrayList<Hand> HandList){
		System.out.println("Hands tied");
	}
}