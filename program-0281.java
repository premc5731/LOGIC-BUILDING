import java.util.Scanner;

class Digits
{
    public void DisplayEven(int iNo)
    {
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2) == 0)
            {
                System.out.println(iDigit);
            }
            iNo = iNo / 10;
        }
    }
}


class program_70
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a number : ");
        iValue = sobj.nextInt();

        Digits dobj = new Digits();
        dobj.DisplayEven(iValue);

        sobj.close();
    }
}