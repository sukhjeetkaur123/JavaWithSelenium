const circle = {
    radius: 1,
    color : 'red',
    add(){
        let a = 10;
        let b =30;
        console.log(a+b);
    }
};

// const another = {};
// for(let key in circle)
// another[key] =  circle[key];
// console.log(another);
// console.log(another.add());



// object . assigen method

// const another2 = Object.assign({},circle);
// console.log(another1);
//  const another2 =


 const another2=  Object.assign({ color1 : 'green'}, circle);
 console.log(another2);


//  spread operaotr with 3 dots

const another3 = { ...circle};
console.log(another3);

