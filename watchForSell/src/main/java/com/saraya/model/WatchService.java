package com.saraya.model;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WatchService {
	private static ArrayList<Watch> watches = new ArrayList<Watch>();
	private static int count = 8;
	
	static {
		watches.add(new Watch(1, 2020, "Rolex", "103", "https://images.unsplash.com/photo-1549482199-bc1ca6f58502?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1yZWxhdGVkfDJ8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60"));
		watches.add(new Watch(2, 2021, "Omega", "Citizen","https://images.unsplash.com/photo-1546868871-7041f2a55e12?ixid=MnwxMjA3fDB8MHxwaG90by1yZWxhdGVkfDE5fHx8ZW58MHx8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"));
		watches.add(new Watch(3, 2015, "Audemars Piguet", "Seiko","https://images.unsplash.com/photo-1539542990784-6a2fe3f50f39?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1545&q=80"));
		watches.add(new Watch(4, 2019, "Patek Phillipe", "Promaster","https://images.unsplash.com/photo-1520895653685-c739b6db8fce?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=625&q=80"));
		watches.add(new Watch(5, 2000, "TAG Heuer", "300","https://images.unsplash.com/photo-1554116154-e733de92fe4b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=400&q=80"));
		watches.add(new Watch(6, 2018, "Jaeger-LeCoultre", "Santos","https://images.unsplash.com/photo-1603296928495-4be8645ffa7b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=400&q=80"));
		watches.add(new Watch(7, 2016, "Cartier", "Fiesta","https://images.unsplash.com/photo-1451290337906-ac938fc89bce?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=877&q=80"));
		watches.add(new Watch(8, 2013, "Breitling", "Navitimer","https://images.unsplash.com/photo-1548171916-c0dea7f94ca6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1yZWxhdGVkfDJ8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60"));
		watches.add(new Watch(8, 2014, "Pilot", "IWC","https://tpc.googlesyndication.com/daca_images/simgad/9906876129040143891"));
		
	}
	
	public List<Watch> getAllWatches(){
		return watches;
	}
	
	public void addWatch(int year, String make, String model, String image) {
		watches.add(new Watch(++count, year, make, model, image));
	}
	public void deleteWatch(int id) {
		Iterator<Watch> iterate = watches.iterator();
		while(iterate.hasNext()){
			Watch w = iterate.next();
			if(w.getId()==id) {
				iterate.remove();
			}
		}
	}
}
		
		
	
	

	
	
	
