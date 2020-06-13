package larsvan.model;

public class TrafficRule {
	
	private Integer maxAcceleration;
	private Integer minorAcceleration;
	public static String impossible = "*";
	
	
	public Boolean trafficPolicy(Double actualSpeed) {
		return actualSpeed <= this.maxAcceleration && actualSpeed >= this.minorAcceleration;
	}

	public Integer getMaxAcceleration() {
		return maxAcceleration;
	}

	public void setMaxAcceleration(Integer maxAcceleration) {
		this.maxAcceleration = maxAcceleration;
	}


	public Integer getMinorAcceleration() {
		return minorAcceleration;
	}

	public void setMinorAcceleration(Integer minorAcceleration) {
		this.minorAcceleration = minorAcceleration;
	}
	

}
