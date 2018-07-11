package com.jpmc.factory;

import com.jpmc.strategy.CNGEngine;
import com.jpmc.strategy.DiselEngine;
import com.jpmc.strategy.PetrolEngine;
import com.jpmc.strategy.Vehicle;

public class VehicleFactory {
	public static Vehicle getInstance(String engineType) {
		Vehicle veh = new Vehicle();
		if (engineType.equalsIgnoreCase("petrol"))
			veh.setEngg(new PetrolEngine());
		else if (engineType.equalsIgnoreCase("disel"))
			veh.setEngg(new DiselEngine());
		else
			veh.setEngg(new CNGEngine());
		return veh;
	}
}
