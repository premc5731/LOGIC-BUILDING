#include<iostream>
using namespace std;

template <class T>
T Maximum(T No1, T No2, T No3)
{
    T Ans;

    // if(No1 > No2 && No1 > No3)
    // {
    //     Ans = No1;
    // }
    // else if(No2 > No1 && No2 > No3)
    // {
    //     Ans = No2;
    // }
    // else
    // {
    //     Ans = No3;
    // }

    Ans = (No1 > No2)?((No1 > No3)? No1 : No3): (No2 > No3)?No2 : No3;


    return Ans;
}

int main()
{


    cout<<"Maximum is : "<<Maximum(10,23,12)<<"\n";
    cout<<"Maximum is : "<<Maximum(19.1f,45.34f,67.56f)<<"\n";
    cout<<"Maximum is : "<<Maximum(21.12,57.34,34.56)<<"\n";

    return 0;
}