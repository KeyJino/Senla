package utility;

public class IdGenerator {
    private static int id = 0;

    public static int setID(){
       return id += 1;
    }
}
