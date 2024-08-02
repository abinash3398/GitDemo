var arrofKeys=['speed','altitude','color'];
var drone={
    speed:100,
    altitude:200,
    color:'red'
}

for(var i=0;i<arrofKeys.length;i++){
    console.log(drone[arrofKeys[i]]);
}