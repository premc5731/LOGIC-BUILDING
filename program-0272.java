import java.util.Scanner;

class Number 
{
    public int SumFactors(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;
        for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        return iSum;
    }
}

class program_61 
{
    public static void main(String A[]) {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();
        iRet = nobj.SumFactors(iValue);
        System.out.println("The summation is : "+iRet);

        sobj.close();
        }
}