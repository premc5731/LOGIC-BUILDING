import java.util.*;

class Marvellous
{
    public static boolean CheckAnagram(String str1, String str2)
    {
        char Arr[] = str1.toCharArray();
        char Brr[] = str2.toCharArray();

        int Count1[] = new int[26];
        int Count2[] = new int[26];

        int i = 0;
        boolean flag = true;

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <='z')
            {
                Count1[Arr[i] - 'a']++; 
            }
        }

        for(i = 0; i < Brr.length; i++)
        {
            if(Brr[i] >= 'a' && Brr[i] <='z')
            {
                Count2[Brr[i] - 'a']++; 
            }
        }

        for(i = 0; i < 26; i++)
        {
            if(Count1[i] != Count2[i])
            {
                flag = false;
                break;
            }
        }

        return flag;
    }
}
public class program_0499
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first string");
        String str1 = sobj.nextLine();

        System.out.println("Enter the second string");
        String str2 = sobj.nextLine();

        boolean bret = false;

        bret = Marvellous.CheckAnagram(str1, str2);

        if(bret)
        {
            System.out.println("Strings are anagram");
        }
        else
        {
            System.out.println("Strings are not anagram");
        }
    }
    
}
