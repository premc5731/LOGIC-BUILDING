#include<stdio.h>
#include<stdlib.h> // malloc , free
#include<stdbool.h>


bool Search(int Arr[],int iSize, int iNo)
{
    int iCnt = 0;
    bool bFlag = false;

    if((Arr == NULL) || (iSize <= 0))
    {
        return false;
    }
    
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] == iNo)
        {
            bFlag = true;
            break;
        }
    }

    return bFlag;
}

int main()
{
    int *iPtr = NULL;
    int iValue = 0,iLength = 0,iCnt = 0;
    bool bRet = false;

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

    bRet = Search(iPtr, iLength, iValue);
    if(bRet == true)
    {
        printf("%d is present in the array \n",iValue);
    }
    else
    {
        printf("%d is not present in the array \n",iValue);
    }

    free(iPtr);

    return 0;
}