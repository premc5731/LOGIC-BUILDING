import java.util.*;

public class program_0497
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = sobj.nextLine();

        int count[] = new int[26];

        char arr[] = str.toCharArray();

        for(int i = 0; i < arr.length; i++)
        {
            count[arr[i] - 'a']++; 
        }

        for(int i = 0; i < 26; i++)
        {
            if(count[i] != 0)
            {
                System.out.println("frequency of "+(char)(i + 'a') +" is : "+count[i]);
            }
        }
    }
    
}
