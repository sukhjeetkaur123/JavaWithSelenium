// value type
// number , String , boolean, symbol, undefined, null
// reference type:
// object , Function,Array


let x = 10;
let y = x;
x =20;
console.log(x);
console.log(y);

let p = { value:100};
let f = p;
console.log(f);
console.log(p);
p.value=200;
console.log(p);
console.log(f);
f.value =300;
console.log(f);
console.log(p);