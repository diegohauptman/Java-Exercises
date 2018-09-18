import java.util.ArrayList;
import java.util.Collections;

/**
 * Six different random numbers between 1 to 49 ascending order.
 * @author D. Hauptman
 */
public class Lotery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> sixRandomNumbersList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int randomNumber = (int) (Math.random() * 50) + 1;
            sixRandomNumbersList.add(randomNumber);
        }
        Collections.sort(sixRandomNumbersList);

        for (int i : sixRandomNumbersList) {
            System.out.println(i);
        }
        System.out.println(sixRandomNumbersList);
    }
}
