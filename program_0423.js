
function CountDigits(ino) 
{
    let Count = 0

    while(ino != 0)
    {
        Count++;
        
        ino = Math.floor(ino / 10)
        console.log(ino);
        
    }

    return Count
}

Value1 = 123

iRet = CountDigits(Value1)

console.log("Number of Digits are : "+iRet);
