#include<iostream>
using namespace std;

double Maximum(double No1, double No2, double No3)
{
    double Ans;
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
    double Value1, Value2, Value3, Ret;

    Ret = Maximum(10.22,23.56,12.56);
    cout<<"Maximum is : "<<Ret<<"\n";

    Ret = Maximum(19.22,45.56,67.56);
    cout<<"Maximum is : "<<Ret<<"\n";


    return 0;
}