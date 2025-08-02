import java.util.Scanner;


// Time complexity (N/2)
class Number 
{
    public void NonFactors(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if((iNo % iCnt) != 0)
            {
                System.out.println(iCnt);
            }
        }
        for(iCnt = (iNo/2)+1 ; iCnt <= iNo; iCnt++)
        {
            if((iNo % iCnt) != 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class program_62 
{
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();
        nobj.NonFactors(iValue);
        sobj.close();
        }
}