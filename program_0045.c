#include<stdio.h>
#include<stdlib.h>

void Display(int Arr[], int iSize)
{
    int iCnt = 0;
    printf("Entered elements are : \n");

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("%d \n",Arr[iCnt]);
    }

}

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

    Display(ptr,iLength);
    
    // step 2 :- use the memory
    // use 

    // step 3 :- free the memory
    free(ptr);

    return 0;
}