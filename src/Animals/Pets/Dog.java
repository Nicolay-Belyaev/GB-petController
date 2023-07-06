package Animals.Pets;

import Animals.Animal;
import java.util.Date;

public class Dog extends Animal {
    public Dog(Date birthday, String name) {
        super(true, new String[]{"bark", "paw"}, new String[]{"come", "seat", "wait"});
        super.name = name;
        super.birthday = birthday;
    }
}