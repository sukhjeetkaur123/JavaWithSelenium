// for
// while
// do while
// infinite loop
for(let i =0; i<=10 ; i++){
       console.log(i);
       if(i%2 == 0) console.log('hi this is java script');
    
}

// while
let i =1; 
while(i<=10){ 
    console.log(i);
    i++;
}

let p =20;
do{
    console.log(p)
    p++
}
while(p<=30);


// for -- in:
// for object;

const person = {
    name : 'sukhjeet',
    age : 3
};

for(let key in person)
console.log(key, person[key]);


// array
const color = ['red','yellow','green'];
for(let key in color)
console.log(key, color[key]);

for(let key of color)
console.log(key);