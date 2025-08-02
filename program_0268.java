

import java.util.Scanner;

class Arithemetic 
{
    public int Addition(int iNo1, int iNo2) {
        int iAns = 0;
        iAns = iNo1 + iNo2;
        return iAns;
    }
}

class program_57 
{

    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0, iRet = 0;

        System.out.print("Enter first number : ");
        iValue1 = sobj.nextInt();

        System.out.print("Enter second number : ");
        iValue2 = sobj.nextInt();

        Arithemetic aobj = new Arithemetic();
        iRet = aobj.Addition(iValue1, iValue2);

        System.out.println("Addition is : " + iRet);

        sobj.close();

    }

}