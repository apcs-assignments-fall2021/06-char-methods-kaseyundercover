public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        int minlower = 97;
        if (ch < minlower && ch>64) {
             char x =(char)(ch + 32);
            return x;
        } else {
            return ch;
        }
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not a lowercase letter,
    // it is returned unchanged.
    public static char toUpper(char ch) {
        int minlower=97;


        if (ch>=minlower){
         char y=(char)(ch-32);
        return y;}

        else if (ch>=65){
            return ch;}


        return ch;}


    // The method is given a String as input and returns a
    // new String where all of the numbers have been removed
    // from the original String.
    public static String removeNumbers(String str) {
String result = " ";
        for (char i=58; i<str.length(); i ++) {
        if (i > 58){
            result=result+i;
            }
        }

    return result;
    }
    // Write some code to test your methods!
    public static void main(String[] args) {
        System.out.println(toLower('B'));
        System.out.println(toUpper('B'));
        System.out.println(removeNumbers("I have 2 shoes11111"));

    }
}
