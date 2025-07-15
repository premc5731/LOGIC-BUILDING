#include<stdio.h>
#include<stdlib.h> // malloc , free

int Minimum(int Arr[],int iSize)
{
    int iCnt = 0,iMin = 0;

    if((Arr == NULL) || (iSize <= 0))
    {
        printf("Invalid input \n");
        return -1;
    }
    
    iMin = Arr[0];
    
    for(iCnt = 1; iCnt < iSize; iCnt++) 
    {
        if(Arr[iCnt] < iMin) // here it wont handle negative values since iMin = 0
        {
            iMin = Arr[iCnt];
        }
    }

    return iMin;
}

int main()
{
    int *iPtr = NULL;
    int iLength = 0,iCnt = 0,iRet = 0;

    printf("Enter the number of elemnts : \n");
    scanf("%d",&iLength);

    iPtr = (int*)malloc(iLength * sizeof(int));

    if(NULL == iPtr) // ********** 
    {
        printf("unable to allocate memory\n");
        return -1;
    }

    printf("Enter the elements \n");

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        printf("\nEnter the number %d : ",iCnt+1);
        scanf("%d",&iPtr[iCnt]);
    }

    iRet = Maximum(iPtr, iLength);

    printf("Minimum element is : %d\n",iRet);

    free(iPtr);

    return 0;
}