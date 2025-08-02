// input 4 4
/*
    1 * 3 * 
    1 * 3 *
    1 * 3 *
    1 * 3 * 

*/ 

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0,j = 0;
        for(i = 1; i<=iRow;i++)
        {
            for(j = 1;j<=iCol;j++)
            {
                if(j % 2 == 0)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print(j+"\t");
                }
                
            }
            System.out.println("");
        }
    }

}

class program_95
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0,iValue2 = 0;

        System.out.println("Enter number of rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);

        sobj.close();

    }
}