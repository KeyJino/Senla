
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strArray = {"Nossa", "nossa",
                            "Assim", "voce", "me", "mata",
                            "Ai", "se", "eu", "te", "pego",
                            "Ai", "ai", "se", "eu", "te", "pego",

                            "Delicia", "Delicia",
                            "Assim", "voce", "me", "mata",
                            "Ai", "se", "eu", "te", "pego",
                            "Ai", "ai", "se", "eu", "te", "pego"};

        // Classification through the Array class
        Arrays.sort(strArray);
        for (int i = 0; i < strArray.length; i++)
            System.out.print(strArray[i] + " ");
    }
}
