let hour = 10;
if( hour>= 6 && hour<=12){
    console.log('good  morning');
}
else if(hour<=12 && hour<=18){
    console.log('good evening');
}
else
{
console.log('good night');
}

// wap pf find a max number 
let a = 1000;
let b = 2000;
let c = 3000;
 if(a>b && a>c) console.log('a is greater than b and c');

else if (b>c)console.log('b is greater than a and c');

else console.log('c is greater than b and a');

// switch statement

let role = 'admin';
switch(role){
    case 'guest':
        console.log('guest user');
    break;
    case 'admin':
        console.log('admin user');
    break;
    case 'vender':
        console.log('vender user');
    break;
    default :
    console.log('no user');
}

// role with switch statment

if(role === 'guest') console.log('guest user');
else if (role === 'admin') console.log('admin user');
else if(role === 'vender')  console.log('vender user');
else console.log('no user');
