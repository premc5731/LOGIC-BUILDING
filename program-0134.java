import java.util.Scanner;

class MarvellousString 
{
    public String str;

    public MarvellousString(String a)
    {
        this.str = a;
    }

    public int CountSmall() 
    {
        int iCnt = 0, iCount = 0;

        char Arr[] = str.toCharArray();

        for (iCnt = 0; iCnt < Arr.length; iCnt++) 
        {
            if ((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z')) {
                iCount++;
            }
        }
        return iCount;
    }
}

class program_212 {
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
