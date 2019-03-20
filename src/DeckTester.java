/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        String aS[] = {"Pig", "Chonk", "Cow", "Pennebacker"};
        String aR[] = {"Big", "Huge", "Jake", "Eek"};
        int aV[] = {1, 2, 3, 4};

        Deck cholonk = new Deck(aR, aS, aV);
        System.out.println(cholonk.toString());
    }
}