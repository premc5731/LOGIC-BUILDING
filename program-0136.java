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

    public String UpdateString()
    {
        int iCnt = 0;

        char Arr[] = str.toCharArray();

        for (iCnt = 0; iCnt < Arr.length; iCnt++) 
        {
            if ((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z')) 
            {
                Arr[iCnt] = '#';
            }
        }

        String ret = new String(Arr);

        return ret;

    }
}

class program_214 {
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int iRet = 0;

        System.out.println("Please enter string : ");
        String data = sobj.nextLine();

        MarvellousString mobj = new MarvellousString(data);

        String sRet = null;

        sRet = mobj.UpdateString();

        System.out.println("Updated String is : " + sRet);

        sobj.close();

    }
}
