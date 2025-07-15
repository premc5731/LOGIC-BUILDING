#include<stdio.h>
#include<stdlib.h>

int CountEven(int Arr[], int iSize)
{
    int iCnt = 0,iCounter = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if((Arr[iCnt] % 2) == 0)
        {
            iCounter++;
        }
    }
    return iCounter;
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

    iRet = CountEven(ptr,iLength);
    printf("Number of even numbers : %d \n",iRet);

    // step 3 :- free the memory
    free(ptr);

    return 0;
}