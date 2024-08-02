function add(a,b){
    try{
    if(typeof(a)!='number'){
        throw new ReferenceError('The first argument is not a number');
}
    else if(typeof(b)!='number')
{
    throw new ReferenceError('The second argument is not a nubmer');
}
    else
        console.log(a+b);
    }
catch(err){
    console.log('Error!',err)
}
}
add(5,6);
console.log('It still works');
