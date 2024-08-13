#!/bin/python3

from decimal import Decimal, getcontext 

#
# Complete the 'plusMinus' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def plusMinus(arr):
    plus = 0.0
    minus = 0.0
    zero = 0.0
    av =0.0
    getcontext().prec = 6

    for i in arr:
        if(i<0):
            minus += 1
        elif(i>0):
            plus += 1
        else:
            zero += 1
    
    leng = len(arr)
 
    g = Decimal('1.000000')
    av = plus/leng
    print(Decimal(av).quantize(g))
    av = minus/leng 
    print(Decimal(av).quantize(g))
    av = zero/leng
    print(Decimal(av).quantize(g))

if __name__ == '__main__': 
    
    arr = [1,2,3,0,0,-9,-8,4]
    plusMinus(arr)
