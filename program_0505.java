import java.util.*;

public class program_0505
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        str = str.replaceAll(" ", "");
        System.out.println(str);

        HashMap<Character,Integer> hobj = new HashMap<Character,Integer>();

        char Arr[] = str.toCharArray();
        int frequency = 0;

        for(char ch : Arr)
        {
            if(hobj.containsKey(ch)) // character is already present
            {
                frequency = hobj.get(ch);
                hobj.put(ch, frequency+1);
            }
            else // character occurred first time
            {
                hobj.put(ch,1);
            }
        }

        System.out.println("Unique characters are : ");
        for(char ch : hobj.keySet())
        {
            System.out.println(ch);
        }

    }
}
