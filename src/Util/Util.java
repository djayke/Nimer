package Util;

public class Util {

    public static boolean IsDigit(String text)
    {
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                return false;
            }
        }
        return true;
    }

}
