#include<iostream>
using namespace std;

template <class T>
T Addition(T No1, T No2)
{
    T Ans = 0;
    Ans = No1 + No2;
    return Ans;
}

int main()
{
    int a = 10, b= 11, Ret1 = 0;
    Ret1 = Addition(a,b);
    cout<<"Addition is : "<<Ret1<<"\n";
    double x = 10.20;
    double y = 23.44, Ret2 = 0;
    Ret2 = Addition(x,y);
    cout<<"Addition is : "<<Ret2;

    return 0; 
}