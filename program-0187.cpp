#include<iostream>
using namespace std;

float Summation(float Arr[],int iLength)
{
    int iCnt;
    int Sum = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        Sum = Sum + Arr[iCnt];
    }

    cout<<"\n";

    return Sum;
}
int main()
{ 
    int iSize,iCnt;
    float *ptr;

    cout<<"Enter the number of elements \n";
    cin>>iSize;

    ptr = new float[iSize];

    cout<<"Enter the elements \n";

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        cin>>ptr[iCnt];
    }

    cout<<"Summation is :"<<Summation(ptr,iSize)<<"\n";

    delete []ptr;

}