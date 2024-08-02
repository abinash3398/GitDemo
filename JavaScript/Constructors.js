class StationaryBike{
    constructor(position,gear){
        this.position=position;
        this.gear=gear;
    }
}
class Treadmill{
    constructor(position,modes){
    this.position=position;
    this.modes=modes;}
}

class Gym{
constructor(openHrs,StationaryBikePos,TreadmillPos)
{
    this.openHrs=openHrs;
    this.StationaryBike=new StationaryBike(StationaryBikePos,8);
    this.Treadmill=new Treadmill(TreadmillPos,5);
}
}

var boxingGym=new Gym("7-22","right corner","left corner")
console.log(boxingGym.openHrs);
console.log(boxingGym.StationaryBike);
console.log(boxingGym.Treadmill);