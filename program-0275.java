import java.util.Scanner;

class Number 
{
    public void SumFactors(int iNo)
    {
        int iCnt = 0;
        int iSum1 = 0;
        int iSum2 = 0;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSum1 = iSum1 + iCnt;
            }
            else
            {
                iSum2 = iSum2 + iCnt;
            }
        }

        System.out.println("The summation of factors : "+iSum1);
        System.out.println("The summation of non factors : "+iSum2);
       
    }
}

class program_64 
{
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();
        nobj.SumFactors(iValue);
        sobj.close();
        }
}