import java.util.Scanner;

class Digits
{
    public int CountFrequency(int iNo)
    {
        int iCnt = 0;
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit == 5)
            {
                iCnt++;
            }
            iNo = iNo / 10;
        }
         return iCnt;
    }
}


class program_69
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a number : ");
        iValue = sobj.nextInt();

        Digits dobj = new Digits();
        iRet = dobj.CountFrequency(iValue);
        System.out.println("The frequency of 5 is : "+iRet);

        sobj.close();
    }
}