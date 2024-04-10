package Eco;

public class Animal {
     private String AnimalName;
     private int EnergyLevel;
     private String habitat;
     
     //Constructor 
     
     public Animal(String animalName, int energyLevel, String habitat) {
 		super();
 		AnimalName = animalName;
 		EnergyLevel = energyLevel;
 		this.habitat = habitat;
 	}
     
     //ToString concept
	@Override
	public String toString() {
		return "Animal [AnimalName=" + AnimalName + ", EnergyLevel=" + EnergyLevel + ", habitat=" + habitat + "]";
	}

	//Encapsulation concept
	public String getAnimalName() {
		return AnimalName;
	}
	
	public void setAnimalName(String animalName) {
		AnimalName = animalName;
	}
	public int getEnergyLevel() {
		return EnergyLevel;
	}
	public void setEnergyLevel(int energyLevel) {
		EnergyLevel = energyLevel;
	}
	
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	static void animal_details(){
        System.out.println(Interact.Animal);
    }
}
