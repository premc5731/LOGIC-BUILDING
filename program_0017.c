#include<stdio.h>

void Display(int iEnd)
{
    int iCnt = 0;
    for(iCnt = iEnd; iCnt > 0 ; iCnt--)
    {
        printf("%d\n",iCnt);
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

