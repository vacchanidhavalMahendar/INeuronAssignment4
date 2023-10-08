package Assignment4;
//Question 3::WAP to check if “2552” is palindrome or not.

public class Ques3_PalindromeOrNot {
    public static void main(String[] args) {

        String str= "2552";
        String empString="";

        //For loop
        //Initialization,Condition,Increment
        for(int i=str.length()-1;i>=0;i--){
            
            empString =empString+str.charAt(i);
        }

        System.out.println(empString);

    if(str.equals(empString)){
        System.out.println("It is the actual palindrome");

    }
    else{
        System.out.println("It is not palindrome");
    }
    }

}
