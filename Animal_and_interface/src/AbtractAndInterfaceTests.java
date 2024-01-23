

import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import ediable.Edible;
import fruit.Apple;
import fruit.Orange;
import fruit.Fruit;
public class AbtractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new animal.Tiger();
        animals[1] = new animal.Chicken();
        for (animal.Animal animal : animals){
            System.out.println(animal.makeSound());
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new fruit.Orange();
        fruits[1] = new fruit.Apple();
        for(fruit.Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}


