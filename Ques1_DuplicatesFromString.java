package Assignment4;

//1 Q: WAP to remove Duplicates from a String.(Take any String ex with duplicates
//character)
public class Ques1_DuplicatesFromString {
    public static void main(String[] args){

        String str="Hello Programming";
        String emptyString= new String();

        //Iterating the for loop
        for(int i=0;i<str.length();i++){

            char chr=str.charAt(i);
            if(emptyString.indexOf(chr)<0)
            {
                emptyString = emptyString + chr;
            }
        }
        str = emptyString;
        System.out.println(str);
        }
    }

