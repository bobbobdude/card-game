import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listOfPotentialCardNamesEncoded = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);
        List<Integer> listOfPotentialSuitNamesEncoded = Arrays.asList(1,2,3,4);
        List<cardClass> deckOfCards = new ArrayList<>(52);

        for (int SuitName : listOfPotentialSuitNamesEncoded){
            for (int CardName : listOfPotentialCardNamesEncoded){
               cardClass x = new cardClass(SuitName, CardName);
               deckOfCards.add(x);
            }
        }

        for (cardClass cards : deckOfCards){
            System.out.println(cards.toString());
        }



    }
}