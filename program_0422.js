
function CheckPerfect(ino) 
{
    let Sum = 0

    for (let i = 1; i <= (ino/2); i++) 
    {
        if(ino % i == 0)
        {
            Sum = Sum + i;
        }
    }

    return (Sum == ino)
}

bRet = false

Value1 = 28

bRet = CheckPerfect(Value1)

if(bRet == true)
{
    console.log(Value1+" is a perfect number");
}
else
{
    console.log(Value1+" is not perfect number"); 
}

