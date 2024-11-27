import DecoratorClasses.ExtraCheese;
import DecoratorClasses.Mushroom;
import DecoratorClasses.ToppingDecorator;
import PizzaClasses.BasePizza;
import PizzaClasses.FarmHouse;
import PizzaClasses.Margherita;
import PizzaClasses.VegDelight;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza1 = new FarmHouse();
        BasePizza pizza2 = new Margherita();
        BasePizza pizza3 = new VegDelight();


        ToppingDecorator extraCheeseForFarmHouse = new ExtraCheese(pizza1);
        ToppingDecorator mushroomForMargherita = new Mushroom(pizza2);

        System.out.println("Cost of Base class pizza with VegDelight: " +pizza3.cost());
        System.out.println("Cost of extraCheese with FarmHouse: "+extraCheeseForFarmHouse.cost());
        System.out.println("Cost of Mushroom with Margherita: "+mushroomForMargherita.cost());

    }
}