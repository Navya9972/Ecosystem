package Eco;

public class Plant {
     private String PlantName;
     private int P_energy;
     private float GrowthRate;
     
     //Create a constructor for this 
     public Plant(String plantName, int p_energy, float growthRate) {
		super();
		PlantName = plantName;
		P_energy = p_energy;
		GrowthRate = growthRate;
	}

	@Override
	public String toString() {
		return "Plant [PlantName=" + PlantName + ", P_energy=" + P_energy + ", GrowthRate=" + GrowthRate + "]";
	}

	//Encapsulation concept 
	public String getPlantName() {
		return PlantName;
	}
	public void setPlantName(String plantName) {
		PlantName = plantName;
	}
	public int getP_energy() {
		return P_energy;
	}
	public void setP_energy(int p_energy) {
		P_energy = p_energy;
	}
	public float getGrowthRate() {
		return GrowthRate;
	}
	public void setGrowthRate(float growthRate) {
		GrowthRate = growthRate;
	}
	
	
	static void plant_details(){
        System.out.println(Interact.plant);
    }
     
}
