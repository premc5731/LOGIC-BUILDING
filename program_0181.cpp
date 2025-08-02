#include<iostream>
using namespace std;

int Maximum(int Arr[],int Size)
{
    int Max,iCnt;
    Max = Arr[0];

    for(iCnt = 1; iCnt < Size; iCnt++)
    {
        if (Arr[iCnt] > Max)
        {
            Max = Arr[iCnt];
        }
    }
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

    cout<<"Elements of the array are \n";

    for(iCnt = 0; iCnt < Size; iCnt++)
    {
        cout<<ptr[iCnt];
    }

    cout<<"\n";
    
    Ret = Maximum(ptr,Size);

    cout<<"Maximum is : "<<Ret<<"\n";

    delete []ptr;

}