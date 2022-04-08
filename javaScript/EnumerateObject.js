const circle = {
    radius : 1,
    add(){
        console.log('draw');
    }
};

for(let key in circle)
console.log(key, circle[key]);

for(let key of Object.keys(circle))
console.log(key);