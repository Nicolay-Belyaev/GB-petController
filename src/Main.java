import Animals.Animal;
import Animals.Pets.Dog;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Animal Doggy = new Dog(new Date(), "Bobik");
        System.out.println(Doggy.getName());
        System.out.println(Doggy.getKnownCommands());
        System.out.println(Doggy.getCanLearnCommands());
        Doggy.LearnNewCommand("come");
        System.out.println(Doggy.getKnownCommands());

    }
}


