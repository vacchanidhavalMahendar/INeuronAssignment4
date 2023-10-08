package Assignment4;

//6Q: WAP to implement Pangram Checking with least inbuilt methods being used.
public class Ques6_PanagramChecking {
    public static void main(String[] args) {

        boolean flag = false;
        String str1 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";

        str1 = str1.replace(" ","");
        char[] ch = str1.toCharArray();

        int[] ar = new int[26];

        for(int i=0;i<ch.length;i++)
        {
            int index = ch[i] - 65;
            ar[index]++;
        }
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==0)
            {
                System.out.println("It is not pangram");
                flag = true;
                break;
            }
        }
        if(flag == false)
        {System.out.println("It is an pangram");}
    }
}