package com.saraya.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class BicycleService {
	private static ArrayList<Bicycle> bicycles = new ArrayList<Bicycle>();
	private static int count = 10;
	
	static {
		bicycles.add(new Bicycle(1, 2020, "Eroika", "Classic", "https://images.unsplash.com/photo-1589202716657-657f5bc39ebf?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=667&q=80"));
		bicycles.add(new Bicycle(2, 2021, "Nishiki", "Olympic","https://images.unsplash.com/photo-1571333250630-f0230c320b6d?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=750&q=80"));
		bicycles.add(new Bicycle(3, 2022, "Compact-compagnolo", "Gios","https://images.unsplash.com/photo-1485965120184-e220f721d03e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1500&q=80"));
		bicycles.add(new Bicycle(4, 2019, "Steel-Vintage", "R34","https://images.unsplash.com/photo-1557616907-6bea6f8991d1?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=589&q=80"));
		bicycles.add(new Bicycle(5, 2020, "Bike-OLTR", "Pinarello3","https://images.unsplash.com/photo-1577106901574-4629d3108efc?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1494&q=80"));
		bicycles.add(new Bicycle(6, 2018, "Airstreem", "V60","https://images.unsplash.com/photo-1532298229144-0ec0c57515c7?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=708&q=80"));
		bicycles.add(new Bicycle(7, 2016, "Unplugged", "700C","https://images.unsplash.com/photo-1570169043013-de63774bbf97?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80"));
		bicycles.add(new Bicycle(8, 2021, "Trekk", "KingXS","https://images.unsplash.com/photo-1596647528339-7aa320d3c9a0?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=750&q=80"));
		bicycles.add(new Bicycle(9, 2022, "Tomasso", "AcR105" ,"https://images.unsplash.com/photo-1559225549-532a2e59a52c?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=889&q=80"));
		bicycles.add(new Bicycle(10, 2020, "Colnago AC", "Titanium50","https://images.unsplash.com/photo-1559137966-64cb96f92284?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=365&q=80"));
		
	}
	
	public List<Bicycle> getAllBicycles(){
		return bicycles;
	}
	
	public void addBicycle(int year, String make, String model, String image) {
		bicycles.add(new Bicycle(++count, year, make, model, image));
	}
	
	public void removeBicycle(int id) {
		Iterator<Bicycle> tounkara = bicycles.iterator();
		while(tounkara.hasNext()) {
		
			Bicycle b = tounkara.next();
			if(b.getId() == id) {
				tounkara.remove();
			}
		}
	}
	
	
	
}