package com.jpmc.test;

import com.jpmc.factory.VehicleFactory;
import com.jpmc.strategy.Vehicle;

public class TestStrategyPattern {

	public static void main(String[] args) {
		Vehicle veh = null;
		veh = VehicleFactory.getInstance("petrol");
		veh.move();
		veh.park();	

	}

}
