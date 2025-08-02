#include<stdio.h>


int Summation(int ptr[], int iSize)
{
    int iSum = 0,iCnt = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        iSum = iSum + ptr[iCnt];
    }

    return iSum;
}
int main()
{
    int iCnt = 0,iRet = 0;
    int Arr[5];

    printf("Enter the elements : \n");
    
    for(iCnt = 0; iCnt < 5; iCnt++)
    {
        scanf("%d",&Arr[iCnt]);
    }

    iRet = Summation(Arr,5);
    printf("Summation of array is : %d",iRet);
    
    return 0;
}