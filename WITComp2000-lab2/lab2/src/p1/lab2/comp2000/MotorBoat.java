package p1.lab2.comp2000;

public class MotorBoat {
	private double fuelCapcity, fuelRemaining, speedMax, speed, boatEfficiency , distance;

	public MotorBoat(double givenCapacity, double givenMaxSpeed, double givenEfficiency) {
		this.fuelCapcity    = givenCapacity;
		this.fuelRemaining  = 0;
		this.speedMax       = givenMaxSpeed;
		this.speed          = 0;
		this.boatEfficiency = givenEfficiency;
		this.distance       = 0;
	}		
	
	public double distance(){
		return(this.distance);
	}
	
	
	public double fuelRemaining() {
		return(this.fuelRemaining);
	}
	
	
	public void refuelBoat(double fuleAmount) {
		if(fuleAmount > (this.fuelCapcity-this.fuelRemaining)) {
			this.fuelRemaining += (this.fuelCapcity-this.fuelRemaining);
		} else { 
			this.fuelRemaining += fuleAmount;
		}
	}
	
	public void operateForTime(double time) {
		if(this.speed != 0) {
			double maxTime = (this.fuelRemaining)/(this.boatEfficiency*this.speed*this.speed);
			
			if(maxTime<time) {
				time = maxTime;
			}
			
			this.distance += this.speed*time;
			this.fuelRemaining -= this.boatEfficiency*this.speed*this.speed*time;
		}
		
	}
	
	public void changeSpeed(double newSpeed) {
		if( newSpeed > this.speedMax) {
			this.speed = this.speedMax;
		} else if (newSpeed < 0) {
			this.speed = 0;
		} else {
			this.speed = newSpeed;
		}
	}

}
