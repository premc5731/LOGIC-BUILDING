// input : 4
// output : -4 -3 -2 -1 0 1 2 3 4

// Time complexity O(2N)
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
    for(iCnt = -iNo; iCnt <= iNo;iCnt++)  // 2N
    {
        printf("%d \t",iCnt);
    }
    printf("\n");

}
int main()
{
    int iValue = 0;

    printf("Enter frequency : ");
    scanf("%d",&iValue);
    Display(iValue);

    return 0;
}

// if we want to combine then there must be condition 3 and 4 should be same 