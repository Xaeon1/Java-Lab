package base;

import java.util.Scanner;

public class BuildingFactory {
    public Building getBuilding(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Options: Storage, Mine, ResearchLab, ShipYard...");
        String input = scan.nextLine();
        if (input == null) return null;
        if (input.equalsIgnoreCase("STORAGE")){
            return new Storage();
        }else if (input.equalsIgnoreCase("MINE")){
            return new Mine();
        }else if(input.equalsIgnoreCase("RESEARCHLAB")){
            return new ResearchLab();
        }else if(input.equalsIgnoreCase("SHIPYARD")){
            return new ShipYard();
        }
        return null;
    }
}
