#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

bool Search(int Arr[], int iSize)
{
    int iCnt = 0;
    bool bFlag = false;

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] == 11)
        {
            bFlag = true;
            break;
        }
    }
    return bFlag;
}

int main()
{
    int iLength = 0,iCnt = 0;
    bool bRet = false;
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

    bRet  = Search(ptr,iLength);

    if(bRet == true)
    {
        printf("11 is present in the array \n");
    }
    else
    {
        printf("11 is not present in the array \n");
    }

    // step 3 :- free the memory
    free(ptr);

    return 0;
}