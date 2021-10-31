package com.company.deckOfCards;

public class DeckOfCards {
    public static void main(String[] args) {
        //LIFO last in, first out - stack
        //FIFO first in, first out - queue
        //deck
        //System.out.print("\u001B[31m");
       // System.out.print("\u2666");
        Deck deck = new Deck();
        deck.printDeck(deck.getInitDeck());
    }
}


class Deck{
    public static final String[] suits = {"Diamonds", "Hearts", "Spades", "Clubs"};
    public static final String[] ranges = {"6","7","8","9","10","Jack","Queen","King","Ace"};
    public static final String[] signs = {"\u2666","\u2665","\u2660","\u2663" };
    private final String ANSI_RESET = "\u001B[0m";
    private final String ANSI_RED = "\u001B[31m";
    private int[] initDeck;
    private int[] currDeck;
    private int countRanges = ranges.length;

    public Deck(){
        int count = suits.length*ranges.length;
        initDeck = new int[count];
        for (int i=0; i<count; i++)
            initDeck[i] = i;
        currDeck = new int[count];
        System.arraycopy( initDeck, 0, currDeck, 0, count);
    }

    public void printDeck(int[] deck){
        System.out.print(ANSI_RESET);
        System.out.print(deck.length+": ");
        for (int i=0; i<deck.length; i++){
            int indSuit = deck[i]/countRanges;
            int indRange = deck[i]%countRanges;
            if (indSuit<2){
                System.out.print(ANSI_RED);
            }
            else System.out.print(ANSI_RESET);
            System.out.printf("%s%s ", signs[indSuit], ranges[indRange]);
        }
        System.out.print("\n");
    }

    public int[] getInitDeck() {
        return initDeck;
    }

    public int[] giveOut(int count){
        //Take a new deck
        int[] deck = new int[count];
        System.arraycopy(currDeck,0,deck,0,count); //count = deck.length
        int[] newDeck = new int[currDeck.length-count];
        System.arraycopy(currDeck,count,newDeck,0,currDeck.length-count);
        this.currDeck = newDeck;
        return deck;
    }
}

