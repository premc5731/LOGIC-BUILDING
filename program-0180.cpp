#include<iostream>
using namespace std;


int main()
{
    int Ret, Size,Cnt;
    int *ptr;

    cout<<"Enter the number of elements";
    cin>>Size;

    ptr = new int[Size];

    // use

    delete []ptr;

    return 0;

}