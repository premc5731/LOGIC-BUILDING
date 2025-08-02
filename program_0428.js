
function Addition(no1, no2)
{
    return no1 + no2
}

function Demo()
{
    return Addition
}

let Ret = Demo()

let ans = 0
ans = Ret(10,11)
console.log(ans);
