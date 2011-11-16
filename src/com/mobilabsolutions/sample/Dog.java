package com.mobilabsolutions.sample;

public class Dog extends Animal {

	private String race;

	public Dog(String race, int age) {
		this.race = race;
		setAge(age);
	}

	public String getRace() {
		return race;
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 31 * result + ((race != null) ? race.hashCode() : 0);

		return result;
	}

	@Override
	public boolean equals(Object object) {

		if (this == object)// test if the references the same object
			return true;
		else if (object instanceof Dog) {
			Dog dog = (Dog) object;

			// If age and race are the same
			return dog.getRace().equals(getRace()) && dog.getAge() == getAge();
		}

		return false;
	}
	public String toString(){
		return "Age: "+getAge()+" Race: "+getRace();
	}

}
