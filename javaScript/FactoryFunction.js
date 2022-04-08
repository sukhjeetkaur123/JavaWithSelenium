// factory function : it produces object
// pass the camel case notation

function createCircle(radius){
   
    const circle = {
        
        radius:1,
        draw(){
            console.log('this is draw  function');
        }
    }
    return circle;
   
}

function createCircle(radius){
    //  return
    //   const circle = {
        return{
        radius:1,
        draw(){
            console.log('this is draw  function');
        }
    }
   
}
 
const c1 = createCircle(1);
console.log(c1.radius);
c1.draw();

const c2 = createCircle(1);
console.log(c2.radius);


for(let i =0; i<=10; i++)
console.log(i + '*' + '2' + '=' +i*2);


// constructor function
// pass pascal notation : OneTwoThree


function Circle(radius){
    this.radius = radius;
    this.draw = function(){
        console.log('draw', radius)
    }
}
// how to call constructor function with: use new keyword 
const a = new Circle(100);
console.log(a);
console.log(a.radius);
a.draw();
