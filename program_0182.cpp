#include<iostream>
using namespace std;

int Display(int Arr[],int Length)
{
    int iCnt;
    cout<<"Elements of the array are \n";

    for(iCnt = 0; iCnt < Length; iCnt++)
    {
        cout<<Arr[iCnt];
    }

    cout<<"\n";
}
int main()
{
    int Ret, Size,iCnt;
    int *ptr;

    cout<<"Enter the number of elements";
    cin>>Size;

    ptr = new int[Size];

    cout<<"Enter the elements \n";

    for(iCnt = 0; iCnt < Size; iCnt++)
    {
        cin>>ptr[0];
    }

    Display(ptr,Size);

    delete []ptr;

}