package larsvan.model;

public class Van {
	
	private Double acceleration = 0.0;
	private Double speed = 0.0;
	private Double position = 0.0;

	public Double calculateSpeed(Double v, Double a, Double t) {
		this.speed =  v + (a * t);
		return speed;
	}
	
	public Double calculateMoveDistance(Double a, Double t, Double v) {
		return  (a * (Math.pow(t, 2)) / 2) + (v * t);
	}
	
	public Double calculateTime(Integer s, Double vm) {
		return s / vm;
	}
	
	public Integer calculateSpaceVariation(Integer finalSpace, Integer initialSpace) {
		return finalSpace - initialSpace;
	}
	
	public Double getAcceleration() {
		return acceleration;
	}
	public void setAcceleration(Double acceleration) {
		this.acceleration = acceleration;
	}
	public Double getSpeed() {
		return speed;
	}
	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public Double getPosition() {
		return position;
	}

	public void setPosition(Double position) {
		this.position = position;
	}
	
	

}
