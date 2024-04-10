package Eco;
// Abstract class

public abstract class Habitats {
	abstract void Consume(String AnimalName,String PlantName);
    abstract void Rgrowing(String PlantName,int GrowthRate);
    abstract void move(String AnimalName,int energy,String Availablity);
    
}
