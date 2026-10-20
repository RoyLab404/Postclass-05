package e3.chapter3;

import java.util.Comparator;

public class Card implements Comparable<Card> {

	private Rank aRank;
	private Suit aSuit;

	/**
	 * Creates a new card object.
	 * 
	 * @param pRank The rank of the card.
	 * @param pSuit The suit of the card.
	 * @pre pRank != null
	 * @pre pSuit != null
	 */
	public Card(Rank pRank, Suit pSuit) {
		assert pRank != null && pSuit != null;
		aRank = pRank;
		aSuit = pSuit;
	}

	/**
	 * @return The rank of the card.
	 */
	public Rank rank() {
		return aRank;
	}

	/**
	 * @return The suit of the card.
	 */
	public Suit suit() {
		return aSuit;
	}

	@Override
	public int compareTo(Card pCard) {
		return aRank.compareTo(pCard.aRank);
	}

	/**
	 * Sample static factory method to create a comparator capable of comparing
	 * cards by rank.
	 * 
	 * @return The created comparator.
	 */
	public static Comparator<Card> createByRankComparator() {
		return new Comparator<Card>() {
			public int compare(Card pCard1, Card pCard2) {
				return pCard1.aRank.compareTo(pCard2.aRank);
			}
		};
	}
	
	@Override
	public String toString() {
		return String.format("%s of %s", aRank, aSuit);
	}
}