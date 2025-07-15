#include<stdio.h>
#include<stdlib.h> // malloc , free

int Frequency(int Arr[],int iSize, int iNo)
{
    int iCnt = 0,iCount = 0;

    if((Arr == NULL) || (iSize <= 0))
    {
        return -1;
    }
    
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] == iNo)
        {
            iCount++;
        }
    }

    return iCount;
}

int main()
{
    int *iPtr = NULL;
    int iValue = 0,iLength = 0,iCnt = 0,iRet = 0;

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

    printf("\nEnter the element to search : \n");
    scanf("%d",&iValue);

    iRet = Frequency(iPtr, iLength, iValue);
    if(iRet == -1)
    {
        printf("There is issue in the input \n");
    }
    else
    {
        printf("%d appears %d times in the array \n",iValue,iRet);
    }

    free(iPtr);

    return 0;
}