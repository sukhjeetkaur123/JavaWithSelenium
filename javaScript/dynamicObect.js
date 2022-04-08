
// dynamic nature of objevt in javascript
const circle = {

    radius: 1,
    color: 'red',
    log(){
        console.log('this log function');
        console.log('log', this.radius);

    }
}
console.log(circle);
// add the property in circle

circle.price = 100;
circle.draw = function(){}
circle.number = 20;
circle.isP
console.log(circle);


// delete the property

delete circle.number;
console.log(circle);
circle.log();



