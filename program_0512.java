
// accept string form user and count no of words
// _ _ _ _India_ _ _is_ _my_ _country_ _ _
// after trim :-> India_ _ _is_ _my_ _country
import java.util.*;

public class program_0512 {
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sobj.nextLine();

        str = str.trim();

        char arr[] = str.toCharArray();
        char Brr[] = new char[arr.length];

        int iCount = 0, i = 0, j = 0;
        boolean bflag = false;

        for (i = 0; i < arr.length; i++) 
        {
            if (arr[i] != ' ') 
            {
                Brr[j] = arr[i];
                j++;
                bflag = false;
            } 
            else if (arr[i] == ' ') 
            {
                if (bflag == false) {
                    Brr[j] = ' ';
                    j++;
                    bflag = true;
                    iCount++;
                }
            }
        }

        
        System.out.println("Number of words : " + (iCount + 1));

    }

}
