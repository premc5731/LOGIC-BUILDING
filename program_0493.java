import java.util.*;

public class program_0493
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = sobj.nextLine();

        int count[] = {0,0,0};

        char arr[] = str.toCharArray();

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 'a')
            {
                count[arr[i] - 'a']++;
            }
            else if(arr[i] == 'b')
            {
                count[arr[i] - 'a']++;
            }
            else if(arr[i] == 'c')
            {
                count[arr[i] - 'a']++;
            }
        }

        System.out.println("frequency of a is : "+count[0]);
        System.out.println("frequency of b is : "+count[1]);
        System.out.println("frequency of c is : "+count[2]);
    }
    
}
