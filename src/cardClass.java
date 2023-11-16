import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class cardClass {

    
    final static Map<Integer, String> mapOfCardNumsToStrings;
    final static Map<Integer, String> mapOfSuitNumsToStrings;

    static{
        HashMap<Integer, String> tempMapOfCardNumsToStrings = new HashMap<>();
        HashMap<Integer, String> tempMapOfSuitNumsToStrings = new HashMap<>();

        tempMapOfCardNumsToStrings.put(1, "A");
        tempMapOfCardNumsToStrings.put(2, "2");
        tempMapOfCardNumsToStrings.put(3, "3");
        tempMapOfCardNumsToStrings.put(4, "4");
        tempMapOfCardNumsToStrings.put(5, "5");
        tempMapOfCardNumsToStrings.put(6, "6");
        tempMapOfCardNumsToStrings.put(7, "7");
        tempMapOfCardNumsToStrings.put(8, "8");
        tempMapOfCardNumsToStrings.put(9, "9");
        tempMapOfCardNumsToStrings.put(10, "10");
        tempMapOfCardNumsToStrings.put(11, "J");
        tempMapOfCardNumsToStrings.put(12, "Q");
        tempMapOfCardNumsToStrings.put(13, "K");

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

        String cardNumForSwitch = mapOfCardNumsToStrings.get(this.cardNumberEncoded);
        int lengthAsInt = cardNumForSwitch.length();

        //Cant figure out switch statement at the moment so will use big else if block instead

        if (lengthAsInt == 1 && this.cardSuitEncoded == 1){

            String cardForm =
                    "|'''''''''|\n" +
                    "|        " + cardNumForSwitch +  "|\n" +
                    "|  /---\\  |\n" +
                    "|  \\---/  |\n" +
                    "|" + cardNumForSwitch + "        |\n" +
                    "|.........|";

            return cardForm;

        }

        else if (lengthAsInt == 1 && this.cardSuitEncoded == 2){
            //Each line of the cardForm String represents a line of the card

            String cardForm =
                    "|'''''''''|\n" +
                    "|        " + cardNumForSwitch +  "|\n" +
                    "|  \\---/  |\n" +
                    "|   \\_/   |\n" +
                    "|" + cardNumForSwitch + "        |\n" +
                    "|.........|";
            return cardForm;
        }

        else if (lengthAsInt == 1 && this.cardSuitEncoded == 3) {

            String cardForm =
                    "|'''''''''|\n" +
                    "|        " + cardNumForSwitch +  "|\n" +
                    "|  /\\_/\\  |\n" +
                    "|   \\_/   |\n" +
                    "|" + cardNumForSwitch + "        |\n" +
                    "|.........|";
            return cardForm;
        }

        else if (lengthAsInt == 1 && this.cardSuitEncoded == 4) {

            String cardForm =
                    "|'''''''''|\n" +
                    "|        " + cardNumForSwitch +  "|\n" +
                    "|  /___\\  |\n" +
                    "|   | |   |\n" +
                    "|" + cardNumForSwitch + "        |\n" +
                    "|.........|";
            return cardForm;
        }

        else if (lengthAsInt == 2 && this.cardSuitEncoded == 1){

            String cardForm =
                    "|'''''''''|\n" +
                    "|       " + cardNumForSwitch +  "|\n" +
                    "|  /---\\  |\n" +
                    "|  \\---/  |\n" +
                    "|" + cardNumForSwitch + "       |\n" +
                    "|.........|";
            return cardForm;
        }

        else if (lengthAsInt == 2 && this.cardSuitEncoded == 2){

            String cardForm =
                    "|'''''''''|\n" +
                    "|       " + cardNumForSwitch +  "|\n" +
                    "|  \\---/  |\n" +
                    "|   \\_/   |\n" +
                    "|" + cardNumForSwitch + "       |\n" +
                    "|.........|";
            return cardForm;
        }

        else if (lengthAsInt == 2 && this.cardSuitEncoded == 3){

            String cardForm =
                    "|'''''''''|\n" +
                    "|       " + cardNumForSwitch +  "|\n" +
                    "|  /\\_/\\  |\n" +
                    "|   \\_/   |\n" +
                    "|" + cardNumForSwitch + "       |\n" +
                    "|.........|";
            return cardForm;
        }

        else if (lengthAsInt == 2 && this.cardSuitEncoded == 4){

            String cardForm =
                    "|'''''''''|\n" +
                    "|       " + cardNumForSwitch +  "|\n" +
                    "|  /___\\  |\n" +
                    "|   | |   |\n" +
                    "|" + cardNumForSwitch + "       |\n" +
                    "|.........|";
            return cardForm;
        }
        return "Should not be getting to this return statement (invalid length of string or not catching all combos of cards and suits)";
    }

}
