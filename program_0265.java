import java.util.Scanner;

class program_53 {
    public static void main(String A[])
    {
        Scanner sobj = null;
        int iValue1 = 0,iValue2 = 0,iResult = 0;

        sobj = new Scanner(System.in);

        System.out.print("Enter first number : ");
        iValue1 = sobj.nextInt();

        System.out.print("Enter Second number : ");
        iValue2 = sobj.nextInt();

        iResult = iValue1 + iValue2;
        System.out.print("The Addition is : "+ iResult);
        sobj.close();
    }
}
