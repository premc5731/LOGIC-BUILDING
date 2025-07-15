#include<stdio.h>
#include<stdlib.h> // malloc , free

int Maximum(int Arr[],int iSize)
{
    int iCnt = 0,iMax = 0;

    if((Arr == NULL) || (iSize <= 0))
    {
        printf("Invalid input \n");
        return -1;
    }
    
    iMax = Arr[0];
    
    for(iCnt = 1; iCnt < iSize; iCnt++) 
    {
        if(Arr[iCnt] > iMax) // here it wont handle negative values since imax = 0
        {
            iMax = Arr[iCnt];
        }
    }

    return iMax;
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

    printf("Maximum element is : %d\n",iRet);

    free(iPtr);

    return 0;
}