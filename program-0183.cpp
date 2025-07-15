#include<iostream>
using namespace std;

void Display(float Arr[],int Length)
{
    int iCnt;
    cout<<"Elements of the array are \n";

    for(iCnt = 0; iCnt < Length; iCnt++)
    {
        cout<<Arr[iCnt]<<"\n";
    }

    cout<<"\n";
}
int main()
{
    int Ret, Size,iCnt;
    float *ptr;

    cout<<"Enter the number of elements \n";
    cin>>Size;

    ptr = new float[Size];

    cout<<"Enter the elements \n";

    for(iCnt = 0; iCnt < Size; iCnt++)
    {
        cin>>ptr[iCnt];
    }

    Display(ptr,Size);

    delete []ptr;

}