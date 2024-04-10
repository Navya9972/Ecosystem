package Eco;

import java.util.List;

public class Habitats1 extends Habitats{
		   @Override
		   void Consume(String AnimalName, String PlantName) 
		   {
			   if(Interact.Animal.containsKey(AnimalName) && Interact.plant.containsKey(PlantName) ) {
		       Interact.Animal.get(AnimalName).setEnergyLevel(Interact.Animal.get(AnimalName).getEnergyLevel()+Interact.plant.get(PlantName).getP_energy());
		       Interact.plant.get(PlantName).setP_energy(0);
			   }
			   else {
				   System.out.println("Animal or Plant not found");
			   }
		   }
		   
		   @Override
		   void Rgrowing(String PlantName,int GrowthRate) 
		   {
			   if(Interact.plant.containsKey(PlantName)) {
		       Interact.plant.get(PlantName).setP_energy(Interact.plant.get(PlantName).getP_energy()+GrowthRate);
			   }
			   else {
				   System.out.println("Plant not found");
			   }
		   }

		   @SuppressWarnings("unchecked")
		@Override
		   void move(String AnimalName,int energy,String Availablity)
		   {
			   if(Interact.Animal.containsKey(AnimalName)) {
				   
		       if(energy==0){
		           System.out.println("Animal cannot move the Habitat because energy level is low");
		       }
		       else{
		    	   String oldHabit=Interact.Animal.get(AnimalName).getHabitat();
		           Interact.Animal.get(AnimalName).setHabitat(Availablity);
		           Interact.Animal.get(AnimalName).setEnergyLevel(Interact.Animal.get(AnimalName).getEnergyLevel()/2);
		          // Interact.Habitat.remove(oldHabit);
		           Interact.removeFromHashMap(Interact.Habitat, oldHabit, AnimalName);
		           Interact.addToHashMap(Interact.Habitat, Availablity, AnimalName);

		       }
		       
		   }
			   else {
				   System.out.println("Animal not found");
			   }
		   }
		   
		  
		  
}
		   
		






