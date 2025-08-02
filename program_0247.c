#include<stdio.h>

void DisplayFactors(int iNo)
{
    int iCnt = 0;
    if(iNo < 0)  // updater
    {
        iNo = -iNo;
    }
    for(iCnt = 1; iCnt < iNo; iCnt++)
    {
        if((iNo % iCnt) == 0)
        {
            printf(" Factor is : %d \n",iCnt);
        }
        else
        {
             printf(" Nonfactor is : %d \n",iCnt);

        }
    }
}

int main()
{
    int iValue = 0;
    printf("Enter a number to find factors : ");
    scanf("%d",&iValue);
    DisplayFactors(iValue);
    return 0;
}