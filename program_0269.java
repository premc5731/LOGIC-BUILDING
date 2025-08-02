
import java.util.Scanner;

class Arithemetic 
{
    public int iNo1;
    public int iNo2;

    public Arithemetic(int A, int B)
    {
        this.iNo1 = A;
        this.iNo2 = B;
    }

    public int Addition()
    {
        int iAns = 0;
        iAns = this.iNo1 + this.iNo2;
        return iAns;
    }
}

class program_58 
{

    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0, iRet = 0;

        System.out.print("Enter first number : ");
        iValue1 = sobj.nextInt();

        System.out.print("Enter second number : ");
        iValue2 = sobj.nextInt();

        Arithemetic aobj = new Arithemetic(iValue1,iValue2);
        iRet = aobj.Addition();

        System.out.println("Addition is : " + iRet);

        sobj.close();

    }

}