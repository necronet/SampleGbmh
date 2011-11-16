package com.mobilabsolutions.sample;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args){
		String races[] ={"Puddle","Doberman","Bulldog","Chihuahua","Puddle","Doberman"};
		int ages[]={4,5,6,5,3,2};
		Animal[] animals=new Animal[races.length];
		for(int i=0;i<races.length;i++){
			animals[i]=new Dog(races[i],ages[i]);
		}
		
		Arrays.sort(animals,new AnimalComparator());
		
		for(Animal animal:animals){
			System.out.println(animal);
		}
	}

}
