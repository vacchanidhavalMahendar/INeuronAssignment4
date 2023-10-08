package Assignment4;

//Question 5:: WAP to implement Anagram Checking least inbuilt methods being used.

import java.util.Arrays;

public class Ques5_AnagraMChecking {
    public static void main(String[] args) {
        String str1="pROgramming";
        String str2="programming LAnguagE";

        str1=str1.replace("."," ");
        str2=str2.replace(" ","");

        for(int i=0;i<str1.length();i++)
            if((str1.charAt(i)>=65)&&(str1.charAt(i)<=90))
                str1=(str1.replace(str1.charAt(i),(char)(str1.charAt(i)+32)));

        for(int i=0;i<str2.length();i++)
            if((str2.charAt(i)>=65)&&(str2.charAt(i)<=90))
                str2=(str2.replace(str2.charAt(i),(char)(str2.charAt(i)+32)));

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();


        for(int i=0;i<char1.length;i++)
        {
            for(int j=1;j<char1.length-i;j++)
            {
                if(char1[j]<char1[j-1])
                {
                    char tempVar = char1[j];
                    char1[j] = char1[j-1];
                    char1[j-1] = tempVar;
                }
            }
        }

        for(int i=0;i<char2.length;i++)
        {
            for(int j=1;j<char2.length-i;j++)
            {
                if(char2[j]<char2[j-1])
                {
                    char tempVar = char2[j];
                    char2[j] = char2[j-1];
                    char2[j-1] = tempVar;
                }
            }
        }

        if(Arrays.equals(char1,char2))
        {
            System.out.println("It is an  Anagram");
        }
        else
        {
            System.out.println("It is not an Anagram");
        }

    }
}

