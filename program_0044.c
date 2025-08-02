#include<stdio.h>
#include<stdlib.h>

int main()
{
    int iLength = 0,iCnt = 0;
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

    printf("Entered elements are : \n");

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        printf("%d \n",ptr[iCnt]);
    }

    // step 2 :- use the memory
    // use 

    // step 3 :- free the memory
    free(ptr);

    return 0;
}