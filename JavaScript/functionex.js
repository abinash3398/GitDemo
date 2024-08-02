var virtualPet={
    sleepy:true,
    nap: function(){
        this.sleepy=false;
    }
}
console.log(virtualPet.sleepy)
virtualPet.nap();
console.log(virtualPet.sleepy)
