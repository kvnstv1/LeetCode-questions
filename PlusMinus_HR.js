'use strict';

// process.stdin.resume();
// process.stdin.setEncoding('utf-8');


/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

function plusMinus(arr) {
    
    let plus = 0.0;
    let minus = 0.0;
    let zero = 0.0;

    for(let i of arr){
        if(i<0){
            minus++;
        }
        else if(i>0){
            plus++;
        }else zero++;

    }// End of for each loop

    let av = 0;
    let len = arr.length;

    av = plus/len;
    console.log(av.toFixed(6));
    av=minus/len;
    console.log(av.toFixed(6));
    av = zero/len;
    console.log(av.toFixed(6));

    return;

}

function main() {
    
    let arr = [1,2,0,-1,-2,-3,4,0,9,-5];
    plusMinus(arr);
}


main();