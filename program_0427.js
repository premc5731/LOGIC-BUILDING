
function Calculator(fun1, fun2)
{
    console.log(fun1(11,10))
    console.log(fun2(11,10))
}

function Addition(no1, no2)
{
    return no1 + no2
}

function Substraction(no1, no2)
{
    return no1 - no2
}

Calculator(Addition, Substraction)

