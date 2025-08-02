import java.util.Scanner;


class NNumberX
{
    public int Arr[];

    public NNumberX(int iSize)
    {
        Arr = new int[iSize];
    }


    public int CountEven()
    {
        int iCntEven = 0,iCnt = 0;
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iCntEven++;
            }
        }

        return iCntEven;
    }
}
class program_218 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int iCnt = 0,iRet = 0;

        System.out.println("Enter number of elements : ");
        int iSize = sobj.nextInt();

        NNumberX nobj = new NNumberX(iSize);


        System.out.println("Enter the elements");

        for(iCnt = 0; iCnt < nobj.Arr.length; iCnt++)
        {
            nobj.Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Elements of the array are : ");
        for(iCnt = 0; iCnt < nobj.Arr.length; iCnt++)
        {
            System.out.println("element "+ (iCnt + 1) +": "+nobj.Arr[iCnt]);
        }


        iRet = nobj.CountEven();

        System.out.println("Number of even numbers are : "+iRet);
        
        sobj = null;
    }
}

// Arr = null;
// sobj = null;
// we are assiging to null so that garbage collector will come and clean the resources
