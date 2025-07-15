/////////////////////////////////////////////////////////
//
//  File name   : program_2.c
//  Description : used to calculate percentage 
//  Author      : prem
//  Date        : 28/04/2025
//
/////////////////////////////////////////////////////////

#include<stdio.h>

float CalculatePercentage(int iTotalMarks, int iObtainedMarks)
{
    float fPercentageValue = 0.0f;
    fPercentageValue = ((float)iObtainedMarks / (float)iTotalMarks) * 100;
    return fPercentageValue;
}

int main()
{
    int iTotal = 0;
    int iObtained = 0;
    float fPercentage = 0.0f;

    printf("Enter the Total marks : ");
    scanf("%d",&iTotal);

    printf("Enter the Obtained marks : ");
    scanf("%d",&iObtained);

    // Percentage = ((float)Obtained / (float)Total) * 100;
    fPercentage = CalculatePercentage(iTotal, iObtained);

    printf("Percentage is : %.2f%%  \n",fPercentage);

    return 0;
}