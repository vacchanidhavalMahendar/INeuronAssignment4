package Assignment4;

//2 Question:WAP to print Duplicates characters from the String.
public class Ques2_Print_Duplicate_CharactersFromString {
    public static void main(String[] args) {
        String  string= "hello Programming";
        int count;


        char str[] = string.toCharArray();
        System.out.println("Duplicate characters of a string");
        for (int i = 0; i < str.length; i++) {
            count = 1;
            for (int j = i + 1; j < str.length; j++) {
                if (str[i] == str[j] && str[i] != ' ') {
                    count++;
                    str[j] = '0';
                }
            }
            if (count > 1 && str[i] != '0') {
                System.out.print(str[i]);
            }
        }
    }
}




