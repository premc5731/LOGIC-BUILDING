#include<stdio.h>

void DisplayFactors(int iNo)
{
    int iCnt = 0;
    printf("Factors of %d are : \n",iNo);
    for(iCnt = 1; iCnt < iNo; iCnt++)
    {
        if((iNo % iCnt) == 0)
        {
            printf("%d \n",iCnt);
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