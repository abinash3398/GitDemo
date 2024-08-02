function randomNum(){
    return Math.floor(Math.random()*100);
}
function addTwoNums(a,b){
    return a+b;
}
var getNum;
getNum=randomNum();
console.log(addTwoNums(getNum,getNum));
