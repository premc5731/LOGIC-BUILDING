import java.util.Scanner;

class program_53 {
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0,iValue2 = 0,iResult = 0;

        System.out.println("Enter first number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Second number : ");
        iValue2 = sobj.nextInt();

        iResult = iValue1 + iValue2;
        System.out.println("The Addition is : "+ iResult);
        sobj.close();
    }
}
