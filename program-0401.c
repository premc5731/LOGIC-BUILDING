#include<stdio.h>

int Factorial()
{
    static int i = 1;
    static int iFact = 1;

    if(i <= 5)
    {
        iFact = iFact * i;
        i++;
        Factorial();
    }

    return iFact;
}

int main()
{
    int iRet = 0;
    iRet = Factorial();
    printf("Factorial is : %d",iRet);
    return 0;
}