const num = [3,4];
console.log(num.length);
console.log(num[0]);


// add an element at end of array :
num.push(5,6);
console.log(num);

// add a element at beginning of array:
num.unshift(1,2);
console.log(num);

// add a element at middle
num.splice(2,0,'a','b');
console.log(num);

// how to print value by array
for(const key in num)
console.log(num[key]);