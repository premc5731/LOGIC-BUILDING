import java.util.Scanner;

class Digits
{
    public int Reverse(int iNo)
    {
        int iDigit = 0,iRev = 0;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRev = iRev * 10 + iDigit;
            iNo = iNo / 10;
        }
         return iRev;
    }
}


class program_73
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a number : ");
        iValue = sobj.nextInt();

        Digits dobj = new Digits();
        iRet = dobj.Reverse(iValue);
        System.out.println("The recerse number is : "+iRet);

        sobj.close();
    }
}