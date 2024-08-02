var car={};
car.color='red';
car.turnKey=function(){
    console.log('engine running');
}
car.lightsOn=function(){
    console.log('The lights are on');
}

console.log(car);
car.turnKey();
car.lightsOn();
