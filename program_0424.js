
function CountDigits(ino) 
{
    let Sum = 0
    let digit = 0

    while(ino != 0)
    {
        digit = ino % 10
        Sum = Sum + digit
        ino = Math.floor(ino / 10)
    }

    return Sum
}

Value1 = 123

iRet = CountDigits(Value1)

console.log("sum of Digits is : "+iRet);
