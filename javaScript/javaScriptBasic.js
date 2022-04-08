//Data types
let name= 'sukhjeet';
let age= 23;
console.log(name +' ' + age);
let color = 'red';
console.log(2+2);

// range 

let range = 3;
range = 5;
console.log(range);

// const
// const ranges = 3;
// ranges = 5;
// console.log(ranges);

// const dayOfWeek = 7;
// console.log(dayOfWeek);

// let salary = 12.2;
// let flag = true;
// let isActive = false;
// let price;
// let model = null;
// let wheel = undefined;

// dynamic typing

// objects

let user = {
  name : "sukh",
  age : 20,
  nhh : 20
};
 console.log(user);
 console.log(user.name + '  ' + user.age + ' '+ user.n);

//  using bracket notation :
user['name'] = 'Marry';
console.log(user.name);

// array:
// list of object
let language = ['java','javascript'];
console.log(language);
console.log(language.length);
// add to aaray
language[2] = 'ruby';
console.log(language);
console.log(language.length);
console.log(language[3]);

// function 0 parameter

 function getName(){ 
    console.log('this is my first program');
}
// call of function
getName();

// parameter function

function greet(name, age){
    console.log('helo' + ' ' + name + ' ' + age);

}
greet('sukh' ,22);


// return a function

function add(num1, num2)
{
    return num1+num2;
}

add(12+12);
let sum = add(10,20);
console.log(sum);
console.log(add(20,20));

function squraeRoot(number){
    let res = number * number;
    return res;
}
console.log(squraeRoot(2));

console.log(squraeRoot(5));