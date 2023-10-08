package Assignment4;

//Question 8: WAP to find the maximum occurring character in a String
public class Question8_MaximumOccuringCharacters {


    static final int ASCII_SIZE = 156;
    static char maxOccuringCharacter(String str)
    {
        int count[] = new int[ASCII_SIZE];

        int len = str.length();
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;

        int max = -1;
        char charResult = ' ';

        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                charResult = str.charAt(i);
            }
        }

        return charResult;
    }

    public static void main(String[] args)
    {
        String st = "DhavalMahendar Engineer";
        System.out.println("Max occurring character is "
                + maxOccuringCharacter(st));
    }


}