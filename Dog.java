
public class Dog extends Animal implements Comparable<Dog>{
	Dog(String name, int leg){
		this.name = name;
		this.leg = leg;
		
	}
	
	public int compareTo(Dog a) {
		if(this.getLegs() > a.getLegs()) {
			return 1;
		}
		if(this.getLegs() < a.getLegs()) {
			return -1;
		}
		return 0;
	}
	
	public String toString() {
		return this.name + " " + this.getLegs() + " ";
	}

}
