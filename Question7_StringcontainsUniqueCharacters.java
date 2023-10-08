package Assignment4;
//Question 7:WAP to find if String contains all unique characters

public class Question7_StringcontainsUniqueCharacters {

    boolean uniqueCharacters(String st)
    {
        for (int i = 0; i < st.length(); i++)
        {
            for (int j = i + 1; j < st.length(); j++)
            {
                if (st.charAt(i) == st.charAt(j))
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        String str = "Dhaval Mahendar";


        Question7_StringcontainsUniqueCharacters obj = new Question7_StringcontainsUniqueCharacters();
        if(obj.uniqueCharacters(str))
            System.out.println("The given string has the all the  unique characters");
        else
            System.out.println("The given string has  the duplicate characters");
    }

}

