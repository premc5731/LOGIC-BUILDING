#include<stdio.h>

void Display(int iEnd)
{
    int iCnt = 0;
    for(iCnt = 1; iCnt <= iEnd ; iCnt++)
    {
        printf("Hello\n");
    }
}

int main()
{
    int iValue = 0;
    printf("Enter the frequnecy\n");
    scanf("%d",&iValue);
    Display(iValue);
    return 0;
}