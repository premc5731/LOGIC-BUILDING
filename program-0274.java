import java.util.Scanner;


// Time complexity (N/2)
class Number 
{
    public int SumNonFactors(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;
        for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if((iNo % iCnt) != 0)
            {
                iSum = iSum + iCnt;           
            }
        }
        for(iCnt = (iNo/2)+1 ; iCnt <= iNo; iCnt++)
        {
            if((iNo % iCnt) != 0)
            {
                iSum = iSum + iCnt;            
            }
        }
        return iSum;
    }
}

class program_63 
{
    public static void main(String A[]) {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();
        iRet = nobj.SumNonFactors(iValue);
        System.out.println("The summation of non factors is : "+iRet);
        sobj.close();
        }
}