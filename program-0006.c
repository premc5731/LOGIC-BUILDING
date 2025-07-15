/////////////////////////////////////////////////////////
//
//  File name   : 2_program_6.c
//  Description : used to display class based on percentege 
//  Author      : prem
//  Date        : 04/05/2025
//
/////////////////////////////////////////////////////////

/*
start
    Accept percentage from user
      if percentage is less than 0 and greater than 100
          display invalid input

      if percentage is greater than 0 and less than 35
        display fail    
      if percentage is greater than 35 and less than 50
        display pass class    
      if percentage is greater than 50 and less than 60
        display second class    
      if percentage is greater than 60 and less than 70
        display first class    
      if percentage is greater than 70 and less than 100
        display first class with distenction
stop        
*/


#include <stdio.h>

void DisplayClass(float fPerc)
{
  if((fPerc < 0.0f) || (fPerc >100.0f))
  {
    printf("Unable to proceed as input is invalid ");
    return;
  }
  if((fPerc >= 0.0f) && (fPerc <35.0f))
  {
    printf("You are fail \n");
  }
  else if((fPerc >= 35.0f) && (fPerc < 50.0f))
  {
    printf("Pass class \n");
  }
  else if((fPerc >= 50.0f) && (fPerc < 60.0f))
  {
    printf("Second class \n");
  }
  else if((fPerc >= 60.0f) && (fPerc < 70.0f))
  {
    printf("First class \n");
  }
  else if((fPerc >= 70.0f) && (fPerc <= 100.0f))
  {
    printf("First Class with Distincition \n");
  }
}
int main()
{
    float fValue = 0.0f;
    printf("Please Enter your percentage \n");
    scanf("%f",&fValue);

    DisplayClass(fValue);

    return 0;
}