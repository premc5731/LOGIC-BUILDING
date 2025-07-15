#include<stdio.h>

void Display(int iEnd)
{
    int iCnt = 0;
    for(iCnt = 1; iCnt <= iEnd ; iCnt++)
    {
        printf("51\n");
    }
}

int main()
{
    int iValue = 0;
    printf("Enter the no of time loop should execute\n");
    scanf("%d",&iValue);
    Display(iValue);
    return 0;
}