// input : 4
// output : 4 * 3 * 2 * 1 * 0

// Time complexity O(N)
// N is natural number
// where N >= 0 and N<= infinity
#include<stdio.h>

void Display(int iNo)
{
    int iCnt = 0;
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    for(iCnt = iNo; iCnt >= 1;iCnt--)
    {
        printf("%d \t*\t",iCnt);
    }

}
int main()
{
    int iValue = 0;

    printf("Enter frequency : ");
    scanf("%d",&iValue);
    Display(iValue);

    return 0;
}