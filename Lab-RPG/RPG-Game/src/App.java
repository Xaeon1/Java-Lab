import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        Character hooman = new Human("Anduin", 1000, 75);
        Character elf = new Elf("Legolas", 850, 125);
        Character orc = new Orc("Thrall", 700, 125);

        int i = 1;
        String input;

        while(i <= 10){
            int randomNum = rand.nextInt(1, 3);
            switch (randomNum){
                case 1:
                    hooman.showInfo();
                    System.out.println("Options: attack, heal");
                    System.out.println("Input: ");
                    input = scan.next();
                    if(input.equals("attack")){
                        int selectInt = rand.nextInt(1,2);
                        if (selectInt == 1){
                            hooman.attack(elf);
                        }else {
                            hooman.attack(orc);
                        }
                    }else if(input.equals("heal")){
                        hooman.useAbility(hooman);
                    }
                    break;
                case 2:
                    elf.showInfo();
                    System.out.println("Options: attack, dodge");
                    System.out.println("Input: ");
                    input = scan.next();
                    if(input.equals("attack")){
                        int selectInt = rand.nextInt(1,2);
                        if (selectInt == 1){
                            elf.attack(hooman);
                        }else {
                            elf.attack(orc);
                        }
                    }else if(input.equals("dodge")){
                        elf.useAbility(elf);
                    }
                    break;
                case 3:
                    orc.showInfo();
                    System.out.println("Options: attack, berserk");
                    input = scan.nextLine();
                    if(input.equals("attack")){
                        int selectInt = rand.nextInt(1,2);
                        if (selectInt == 1){
                            orc.attack(elf);
                        }else {
                            orc.attack(hooman);
                        }
                    }else if(input.equals("berserk")){
                        orc.useAbility(hooman);
                    }
                    break;
            }
            i++;
        }
        List<Character> charactersList = new ArrayList<>();


   }
}