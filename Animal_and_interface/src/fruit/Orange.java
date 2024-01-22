package fruit;

import ediable.Edible;

public class Orange extends Fruit implements Edible {
    @Override
    public String howToEat() {
        return "Orang coule be juice";
    }
}
