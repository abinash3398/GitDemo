var bird={
    haswing:true,
    canfly:true
}
var eagle=Object.create(bird);
console.log("eagel:",eagle);
console.log('eagle can fly ?',eagle.canfly);
console.log('eagle haswings? ',eagle.haswing);

var crow=Object.create(bird);
console.log("crow can fly",crow.canfly);

var penguin=Object.create(bird);
penguin.canfly=false;
console.log('penguin can fly',penguin.canfly)