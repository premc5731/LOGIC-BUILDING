#include<stdio.h>


void Display(int * ptr, int size) // call by address
{
    printf("elements of the array are : \n");
    printf("%d\n",*ptr);
    ptr++;
    printf("%d\n",*ptr);
    ptr++;
    printf("%d\n",*ptr);
    ptr++;
    printf("%d\n",*ptr);
    ptr++;
    printf("%d\n",*ptr);
    ptr++;
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