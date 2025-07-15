import java.util.Scanner;


class program_216 {
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        int iCnt = 0;

        System.out.println("Enter the elements");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Elements of the array are : ");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println("element "+ (iCnt + 1) +": "+Arr[iCnt]);
        }

        int iCntEven = 0;
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iCntEven++;
            }
        }
        System.out.println("Number of even numbers are : "+iCntEven);

        Arr = null;
        sobj = null;
    }
}

// Arr = null;
// sobj = null;
// we are assiging to null so that garbage collector will come and clean the resources
