package animal;

import ediable.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "animal.Chicken, cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "Fry it";
    }
}
