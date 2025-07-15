#include<iostream>
using namespace std;

template <class T>

void Display(T Arr[],int iLength)
{
    int iCnt;
    cout<<"Elements of the array are \n";

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        cout<<Arr[iCnt]<<"\n";
    }

    cout<<"\n";
}
int main()
{
    int Ret, iSize,iCnt;
    float *ptr;

    cout<<"Enter the number of elements \n";
    cin>>iSize;

    ptr = new float[iSize];

    cout<<"Enter the elements \n";

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        cin>>ptr[iCnt];
    }

    Display(ptr,iSize);

    delete []ptr;

}