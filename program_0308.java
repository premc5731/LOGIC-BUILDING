// input 4 4
/*
    // input 4 4
/*
    A B C D
    A B C D
    A B C D
    A B C D

*/



import java.util.Scanner;

class Pattern {
    public void Display(int iRow, int iCol) {
        int i = 0, j = 0;
        char ch = 'A';
        for (ch = 'A',i = 1; i <= iRow; i++,ch++) {
            for (j = 1; j <= iCol; j++) 
            {
                System.out.print(ch+"\t");
            }
            System.out.println("");
        }
    }

}

class program_98
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

