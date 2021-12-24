package kingkinfajarr.application;

import kingkinfajarr.annotation.Fancy;
import kingkinfajarr.data.Animal;
import kingkinfajarr.data.Cat;

@Fancy(name = "AnimalApp", tags = {"application", "java"})
public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();
    }
}
