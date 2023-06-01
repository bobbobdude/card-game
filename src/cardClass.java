import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class cardClass {

    final static Map<Integer, String> mapOfCardNumsToStrings;
    final static Map<Integer, String> mapOfSuitNumsToStrings;

    static{
        HashMap<Integer, String> tempMapOfCardNumsToStrings = new HashMap<>();
        HashMap<Integer, String> tempMapOfSuitNumsToStrings = new HashMap<>();

        tempMapOfCardNumsToStrings.put(1, "1");
        tempMapOfCardNumsToStrings.put(2, "2");
        tempMapOfCardNumsToStrings.put(3, "3");
        tempMapOfCardNumsToStrings.put(4, "4");
        tempMapOfCardNumsToStrings.put(5, "5");
        tempMapOfCardNumsToStrings.put(6, "6");
        tempMapOfCardNumsToStrings.put(7, "7");
        tempMapOfCardNumsToStrings.put(8, "8");
        tempMapOfCardNumsToStrings.put(9, "9");
        tempMapOfCardNumsToStrings.put(10, "10");
        tempMapOfCardNumsToStrings.put(11, "Jack");
        tempMapOfCardNumsToStrings.put(12, "Queen");
        tempMapOfCardNumsToStrings.put(13, "King");

        tempMapOfSuitNumsToStrings.put(1, "Clubs");
        tempMapOfSuitNumsToStrings.put(2, "Diamonds");
        tempMapOfSuitNumsToStrings.put(3, "Hearts");
        tempMapOfSuitNumsToStrings.put(4, "Spades");

        mapOfCardNumsToStrings = Collections.unmodifiableMap(tempMapOfCardNumsToStrings);
        mapOfSuitNumsToStrings = Collections.unmodifiableMap(tempMapOfSuitNumsToStrings);
    }
    /*
    In cardNumberEncoded 1,2,3,4,5,6,7,8,9,10,11,12,13 represents
    Ace,2,3,4,5,6,7,8,9,10,Jack,Queen,King

    In cardSuitEncoded 1,2,3,4 represents:
    Clubs, Diamonds, Hearts, Spades
    */
    private final int cardSuitEncoded;
    private final int cardNumberEncoded;

    public int getCardNumberEncoded() {
        return cardNumberEncoded;
    }

    public int getCardSuitEncoded() {
        return cardSuitEncoded;
    }

    public cardClass(int cardSuitEncoded, int cardNumberEncoded){
            this.cardSuitEncoded = cardSuitEncoded;
            this.cardNumberEncoded = cardNumberEncoded;
    }

    @Override
    public String toString(){
        return mapOfCardNumsToStrings.get(this.cardNumberEncoded) + " Of " + mapOfSuitNumsToStrings.get(this.cardSuitEncoded);
    }

}
