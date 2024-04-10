package Eco;
import java.util.*;

public class Interact {
  Scanner sc = new Scanner(System.in);
  static HashMap<String ,Plant> plant = new HashMap();
  static HashMap<String ,Animal> Animal = new HashMap();
  static HashMap<String, List<String>> Habitat= new HashMap();

  
  void PlantCreation()
  {
	  System.out.println("Enter the Plant Species name");
      String plantName1=sc.next();
      System.out.println("Enter the Plant Energy level");
      int plantEnergy1=sc.nextInt();
      System.out.println("Enter the Plant Growth rate");
      float plantGrowth=sc.nextFloat();
      
      plant.put(plantName1,new Plant(plantName1,plantEnergy1,plantGrowth));
     // Habitat.put(nav, new Habitat(AnimalName1));
  }
  
  
  void PlantDisplay()
  {
      System.out.println("Enter the Plant Species name");
      String PlantName1=sc.next();
      Set s1 = plant.entrySet();
      Iterator i3 = s1.iterator();
      while (i3.hasNext()) {
          Map.Entry me1 = (Map.Entry) i3.next();
          if (me1.getKey().equals(PlantName1))
          {
              System.out.println(me1.getKey() + ":" + me1.getValue());
          }
      }
  }
  
  @SuppressWarnings("unchecked")
void AnimalCreation()
  {
	  String nav="";
      System.out.println("Enter the Animal Species name");
      String AnimalName1=sc.next();
      System.out.println("Enter the Animal Energy level");
      int animalEnergy=sc.nextInt();
      System.out.println("Choose Habitat? \n1.Forest \n2.Grassland \n3.Desert \n4.Polar regions");
      int s = sc.nextInt();
      switch (s){
          case 1:
              nav="Forest";
              break;
          case 2:
              nav="Grassland";
              break;
          case 3:
              nav="Desert";
              break;
          case 4:
              nav="Polar Region";
              break;
      }
      Animal.put(AnimalName1,new Animal(AnimalName1,animalEnergy,nav));
      
      addToHashMap(Habitat, nav, AnimalName1);
  }
  
  void AnimalDisplay()
  {
	  System.out.println("Enter the Animal Species name");
      String AniName=sc.next();
      Set s = Animal.entrySet();
      Iterator i1 = s.iterator();
      while (i1.hasNext()) {
          Map.Entry me = (Map.Entry) i1.next();
          if (me.getKey().equals(AniName)) {
              System.out.println(me.getKey() + ":" + me.getValue());
          }
      }
  }
  
  static void addToHashMap(Map<String, List<String>> Habitat, String key, String value) {
      List<String> values = Habitat.get(key);

      if (values == null) {
          values = new ArrayList<>();
          Habitat.put(key, values);
      }

      values.add(value);
  }
  

static void removeFromHashMap(Map<String, List<String>> Habitat, String key, String value) {
      List<String> values = Habitat.get(key);

      if (values == null) {
          values = new ArrayList<>();
          Habitat.remove(key, values);
      }

      values.remove(value);  }

  
  void HabitatList()
  {
	  System.out.println("Choose Habitat? \n1.Forest \n2.Grassland \n3.Desert \n4.Polar regions");
      int s = sc.nextInt();
      String nav="";
      switch (s){
          case 1:
              nav="Forest";
              break;
          case 2:
              nav="Grassland";
              break;
          case 3:
              nav="Desert";
              break;
          case 4:
              nav="Polar Region";
              break;
      }
      
      
      
      List<String> values = Habitat.get(nav);

      if (values != null) {
          System.out.println("Values for key " + nav + "':");

          // Iterate over the collection of values and print each value
          for (String value : values) {
              System.out.println(value);
          }
      }
      
          else {
        	  System.out.println("No animals present inside "+nav);
          }
      
	  
  }
 }
  
  

