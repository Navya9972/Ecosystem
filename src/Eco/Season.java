package Eco;

public class Season implements InterfaceSeason{
	
	public  void season(String PlantName,String Season,String NaturalDisaster) {
		   if(Interact.plant.containsKey(PlantName)) {
			   if(Season.equals("Summer")) {
				   Interact.plant.get(PlantName).setGrowthRate(Interact.plant.get(PlantName).getGrowthRate()-1);
			   }
			   if(Season.equals("Winter")) {
				   Interact.plant.get(PlantName).setGrowthRate(Interact.plant.get(PlantName).getGrowthRate()+1);
			   }
			   if(Season.equals("Rainy")) {
				   Interact.plant.get(PlantName).setGrowthRate(Interact.plant.get(PlantName).getGrowthRate()+2);
			   }
			   if(NaturalDisaster.equals("Flood")||NaturalDisaster.equals("Drought")||NaturalDisaster.equals("LandFire") ){
				   Interact.plant.get(PlantName).setGrowthRate(0);
			   }
		   }
	 }
	
}
    

