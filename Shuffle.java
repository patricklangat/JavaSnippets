import java.util.Arrays;
import java.util.Random;

public class StringShuffler {

    public static String shuffleString(String input) {
         Convert the string to a character array
        char[] charArray = input.toCharArray();

         Shuffle the array
        shuffleArray(charArray);

         Convert the shuffled array back to a string
        return new String(charArray);
    }

    private static void shuffleArray(char[] array) {
        int n = array.length;
        Random random = new Random();

        for (int i = n - 1; i  0; i--) {
             Generate a random index j such that 0 = j = i
            int j = random.nextInt(i + 1);

             Swap array[i] and array[j]
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static void main(String[] args) {
        String originalString = HelloWorld;
        String shuffledString = shuffleString(originalString);

        System.out.println(Original String  + originalString);
        System.out.println(Shuffled String  + shuffledString);
    }
}
