package Assignment4;



//Question 4:WAP to count the number of consonants, vowels, special characters in a String
public class Ques4_NoOfConstantsvowelsSpecialCharacter {

    public static void main(String[] args) {

        String string = "Hello Myself Dhaval Mahendar";

        int consonants = 0;
        int vowels = 0;
        int specialCharacters = 0;

        string = string.toLowerCase();

        for (int i = 0; i < string.length(); i++) {

            char character = string.charAt(i);

            if (character >= 'a' && character <= 'z') {

                if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (character >= 0 && character <= 9) {
                break;

            } else {
                specialCharacters++;
            }

        }

        System.out.println("The vowels Counts are:" + vowels);
        System.out.println("The consonants Counts are:" + consonants);
        System.out.println("The Special Characters count are:" + specialCharacters);

    }
}
