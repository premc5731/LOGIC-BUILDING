#include<stdio.h>
#include<stdlib.h>

int SumOdd(int Arr[], int iSize)
{
    int iCnt = 0,iCounter = 0,iSum;

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if((Arr[iCnt] % 2) != 0)
        {
            iSum = iSum + Arr[iCnt];
        }
    }
    return iSum;
}

int main()
{
    int iLength = 0,iCnt = 0,iRet = 0;
    int *ptr = NULL;

    printf("Enter the numbers of elements : \n");
    scanf("%d",&iLength);

    //step 1 :- allocate the memory  
    ptr = (int*)malloc(iLength * sizeof(int));

    if(ptr == NULL)
    {
        printf("Unable to allocate memory \n");
        return -1;
    }

    printf("Enter the elements : \n");

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&ptr[iCnt]);
    }

    // step 2 :- use the memory

    iRet = SumOdd(ptr,iLength);
    printf("Summation of Odd numbers : %d \n",iRet);

    // step 3 :- free the memory
    free(ptr);

    return 0;
}