#include<stdio.h>


void Display(int ptr[], int iSize) // call by address
{
    int iCnt = 0;
    printf("elements of the array are : \n");

    for(iCnt = 0; iCnt < iSize ; iCnt++)
    {
        printf("%d\n",ptr[iCnt]);
    }
}
int main()
{
    int iCnt = 0;
    int Arr[5];

    printf("Enter the elements : \n");
    
    for(iCnt = 0; iCnt < 5; iCnt++)
    {
        scanf("%d",&Arr[iCnt]);
    }

    Display(Arr,5);
    
    return 0;
}