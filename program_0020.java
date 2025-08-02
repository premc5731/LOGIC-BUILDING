// input 4 4
/*
    // input 4 4
/*
    a a a a
    b b b b
    c c c c
    d d d d

*/



import java.util.Scanner;

class Pattern {
    public void Display(int iRow, int iCol) {
        int i = 0, j = 0;
        char ch1 = 'a';
        char ch2 = 'B';
        for (i = 1,ch1 = 'a',ch2 = 'A'; i <= iRow; i++,ch1++,ch2++) 
        {
            for (j = 1; j <= iCol; j++) 
            {
                if(i % 2 == 0)
                {
                    System.out.print(ch2+"\t");
                    
                }
                else
                {
                    System.out.print(ch1+"\t");
        
                }

            }
            System.out.println("");
        }
    }

}

class program_101
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

