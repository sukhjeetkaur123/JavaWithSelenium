function getRandomNumber(min, max){
    return Math.random() * (max - min) + min;
}

let res = getRandomNumber(1,5);
console.log(res);

function getOwnGenerateRandomNumver(a,b){
    return Math.random() *(b) + a;
}
let output= getOwnGenerateRandomNumver(2,4)
console.log(output);

let withoutDecimal = getRandomNumber(1,5)
console.log(Math.floor(withoutDecimal));