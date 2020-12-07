package com.jjh.enums;

public enum CompassDirections {
	
	NORTH(0), SOUTH(180), EAST(90), WEST(270);
	
	private final int bearing;
	
	CompassDirections(int bearing) {
		this.bearing = bearing;
	}
	
	public int getBearing() {
		return this.bearing;
	}
	
}