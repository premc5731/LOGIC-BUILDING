import java.util.Scanner;

class Digits
{
    public int CountDigits(int iNo)
    {
        int iCnt = 0;

        while(iNo != 0)
        {
            iCnt++;
            iNo = iNo / 10;
        }
         return iCnt;
    }
}


class program_65
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a number : ");
        iValue = sobj.nextInt();

        Digits dobj = new Digits();
        iRet = dobj.CountDigits(iValue);
        System.out.println("The number of digits are : "+iRet);

        sobj.close();
    }
}