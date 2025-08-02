
import java.util.Scanner;
import MarvellousLB.MarvellousString;

class program_213 {
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int iRet = 0;

        System.out.println("Please enter string : ");
        String data = sobj.nextLine();

        MarvellousString mobj = new MarvellousString(data);

        iRet = mobj.CountSmall();

        System.out.println("Number of small characters are : " + iRet);

        sobj.close();

    }
}
