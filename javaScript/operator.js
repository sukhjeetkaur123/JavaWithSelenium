//  operator
// Arithmatic operator
// ternary operator
// comparision
// logical


let x = 10;
let b = 20;
console.log(x + b);
console.log(x - b);
console.log(x * b);
console.log(x / b);
console.log(x / b);
console.log(2 ** 3);

let p = 1;
let q = p++;
console.log(p);
console.log(q);
// ternery operator

let points = 101;
let type = points > 100 ? 'gold' : 'silver';
console.log(type);

// logival operator

let highIncome = true;
let goodCreditCard = true;
let eligibility = highIncome && goodCreditCard;
console.log(eligibility);


// or operator not operator

let isActive = true;
console.log(!isActive);
console.log(!(10>5));
console.log(!(10<5));

// logical operator
console.log(false || 'sukhjet');
console.log(false || 0);
console.log(true || 0);
console.log(true || 0 || 2);
console.log(false || 'undefined');


// real time ex
let userColor = 'red';
let defaultColor = 'blue';
let currentColor1 = userColor || defaultColor;
console.log(currentColor1);
let userColor1 = 'undefined';
let defaultColor1 = 'blue';
let currentColor2 = userColor1 || defaultColor1;
console.log(currentColor2);
let userColor12 = null;
let defaultColor12 = 'blue';
let currentColor3 = userColor12 || defaultColor12;
console.log(currentColor3);


// bitwise operator

console.log(1 | 2);
console.log(1 & 2);

// swap 2 number

let a = 10;
let c = 20;
let d = a;
a=c;
c=d;
console.log("a-->" + a);
console.log("a-->" + c);



