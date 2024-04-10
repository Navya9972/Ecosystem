package Eco;
import java.util.*;
public class Main1 {
     public static void main(String args[])
     {
    	 int s,k=0,n1;
         String AnimalName,PlantName,Season,Disaster;
         Scanner sc=new Scanner(System.in);
         try {
         Interact e=new Interact();
         Habitats h=new Habitats1();
         Season d = new Season();
         while(k==0)
         {
           System.out.println("1.Create an  Ecosystem");
           System.out.println("2.Display an Ecosystem");
           System.out.println("3.Display the details");
           System.out.println("4.Animal consuming plant and regrowing based on thier growth rate :");
           System.out.println("5.Animal moving one to another habitat");
           System.out.println("6.Seasonal changes or Disaster :");
           System.out.println("7.Exit");
           s=sc.nextInt();
           switch (s){
            case 1:
             System.out.println("1.Animal Details");
             System.out.println("2.Plant Details");
             n1=sc.nextInt();
                switch (n1){
                   case 1:
                       e.AnimalCreation();
                        break;
                   case 2:
                        e.PlantCreation();
                        break;
                     }
              System.out.println("Ecosystem created Successfully !!!");
              break;
             case 2:
              System.out.println("1. Animal Details");
              System.out.println("2. Plant Details");
              System.out.println("3. Habitat Details");
              n1=sc.nextInt();
              switch (n1){
                  case 1:
                      e.AnimalDisplay();
                      break;
                  case 2:
                      e.PlantDisplay();
                      break;
                  case 3:
                      e.HabitatList();
                      break;
                     }
                     break;
              case 3:
                System.out.println("1.Display all animals details");
                System.out.println("2.Display all plants details");
                n1=sc.nextInt();
                switch (n1){
                   case 1:
                        Animal.animal_details();
                        break;
                   case 2:
                        Plant.plant_details();
                        break;
                     }
                     break;
              case 4:
                     System.out.println("Animal name");
                     AnimalName=sc.next();
                     System.out.println("Plant name");
                     PlantName= sc.next();
                     h.Consume(AnimalName,PlantName);
                     h.Rgrowing(PlantName,(int)Interact.plant.get(PlantName).getGrowthRate());
                     break;
                 case 5:
                   int m=0;
                   System.out.println("Animal name");
                   AnimalName=sc.next();
                   while(m==0){
                   System.out.println("Which Habitat move? \n1.Forest \n2.Grassland \n3.Desert \n4.Polar regions");
                   n1=sc.nextInt();
                   switch (n1) {
                      case 1:
                        if (Interact.Animal.get(AnimalName).getHabitat().equals("Forest")) {
                         System.out.println("Animal has been already living in Forest...");
                         }
                         else 
                          {
                           h.move(AnimalName,Interact.Animal.get(AnimalName).getEnergyLevel(),"Forest");
                           m=1;
                           break;
                           }
                           break;
                       case 2:
                          if (Interact.Animal.get(AnimalName).getHabitat().equals("Grassland")) {
                          System.out.println("Animal has been already living in Grassland...");
                           } 
                          else 
                          {
                           h.move(AnimalName,Interact.Animal.get(AnimalName).getEnergyLevel(),"Grassland");
                           m=1;
                           break;
                          }
                          break;
                       case 3:
                         if (Interact.Animal.get(AnimalName).getHabitat().equals("Desert")) {
                         System.out.println("Animal has been already living in Desert...");
                         } else {
                          h.move(AnimalName,Interact.Animal.get(AnimalName).getEnergyLevel(),"Desert");
                          m=1;
                          
                           break;
                         }
                         break;
                       case 4:
                         if (Interact.Animal.get(AnimalName).getHabitat().equals("Polar Region")) {
                         System.out.println("Animal has been already living in Polar region...");
                         } else {
                         h.move(AnimalName,Interact.Animal.get(AnimalName).getEnergyLevel(),"Polar Region");
                         m=1;
                         break;
                        }
                      break;
                     }
                     }
                     break;
                 case 6:
                	 System.out.println("PlantName");
                     PlantName=sc.next();
                	 System.out.println("Season");
                     Season=sc.next();
                     System.out.println("Disaster");
                     Disaster= sc.next();
                     d.season(PlantName, Season, Disaster);
                	 break;
                case 7:
                     k=1;
                     break;
                     
             }
         }
         }finally
         {
        	 sc.close();
         }
     }
     }

