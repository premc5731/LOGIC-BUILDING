import java.util.Scanner;

class Number 
{
    public boolean CheckEven(int iNo)
    {
        boolean bFlag = false;

        if((iNo % 2) == 0)
        {
            bFlag = true;
        }
        else
        {
            bFlag = false;
        }
        return bFlag;
    }
}

class program_59 
{
    public static void main(String A[]) {
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();
        bRet = nobj.CheckEven(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" is Even");
        }
        else
        {
            System.out.println(iValue+" is odd");
        }
        sobj.close();
        }
}