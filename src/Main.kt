fun main() {
    print(knapsackLight(10,5,6,4,8))
}

fun knapsackLight(value1: Int, weight1: Int, value2: Int, weight2: Int, maxW: Int):Int {
    var theResult=0
    if(weight1+weight2<=maxW)
        theResult=value1+value2
    else if(value1>=value2 && weight1<=maxW)
        theResult=value1
    else if(value2>value1&&weight2<=maxW)
        theResult=value2
    else if(weight2>maxW && weight1<=maxW)
        theResult=value1
    else
        theResult=0

    return theResult
}