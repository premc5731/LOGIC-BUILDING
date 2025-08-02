#include<iostream>
using namespace std;

int Maximum(int No1, int No2, int No3)
{
    int Ans;
    if(No1 > No2)
    {
        if(No1 > No3)
        {
            Ans = No1;
        }
    }
    else if(No2 > No3)
    {
        Ans = No2;
    }
    else
    {
        Ans = No3;
    }

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

    return Ans;
}

int main()
{
    int Value1, Value2, Value3, Ret;

    cout<<"Enter first value : \n";
    cin>>Value1;
    cout<<"Enter second value : \n";
    cin>>Value2;
    cout<<"Enter third value : \n";
    cin>>Value3;

    Ret = Maximum(Value1, Value2, Value3);
    
    cout<<"Maximum is : "<<Ret;


    return 0;
}