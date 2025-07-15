// input : 4
// output : * * * *

/*
Algorithm
    start
        Accept the frequency
            Display * on screen
        continue
    stop
*/


// Time complexity O(N)
// N is natural number
// where N >= 0 and N<= infinity
#include<stdio.h>

void Display(int iNo)
{
    int iCnt = 0;
    for(iCnt = 1; iCnt <= iNo;iCnt++)
    {
        printf("* \t");
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