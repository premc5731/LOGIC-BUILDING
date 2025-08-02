// input 4 4
/*
    // input 4 4
/*
*
*       *
*       *       *
*       *       *       *

*/



import java.util.Scanner;

class Pattern {
    public void Display(int iRow, int iCol) 
    {
        if (iRow != iCol)
        {
            System.out.println("Invalid input");
            return;
        }
        int i = 0, j = 0;
        for (i = 1; i <= iRow; i++) 
        {
            for (j = 1; j <= iCol; j++) 
            {
                if(i >= j)
                {
                    System.out.print("*\t");
                }
            }
            System.out.println("");
        }
    }

}

class program_110
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0,iValue2 = 0;

        System.out.print("Enter number of rows : ");
        iValue1 = sobj.nextInt();

        System.out.print("Enter second number : ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);

        sobj.close();

    }
}

