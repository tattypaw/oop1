public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeAutomate = new CoffeeMachine();
        coffeeAutomate.addCoffee(new Coffee("Americano", 50.50, 150, 70, 10))
                .addCoffee(new Coffee("Capuchino", 60, 100, 75, 5))
                .addCoffee(new Coffee("Latte", 100.2, 150, 80, 10))
                .addCoffee(new Coffee("Nescafe", 45.75, 200,90, 5));

        System.out.println("До продажи");
        System.out.println(coffeeAutomate);

        System.out.println("Selling:");
        PrintSell(coffeeAutomate,"Americano");
        PrintSell(coffeeAutomate,"Capuchino");
        PrintSell(coffeeAutomate,"Latte");
        PrintSell(coffeeAutomate,"Nescafe");

        System.out.println();
        System.out.println("После продажи");
        System.out.println(coffeeAutomate);

        System.out.println("Selling:");
        PrintSell(coffeeAutomate,"Nescafe");
        PrintSell(coffeeAutomate,"Nescafe");

        System.out.println();
        System.out.println("После продажи");
        System.out.println(coffeeAutomate);
        
        System.out.println();
        System.out.println("Selling:");
        PrintSell(coffeeAutomate,"Цикорий");
        System.out.println(coffeeAutomate);
    }

    public static void PrintSell (CoffeeMachine machine, String nameCafe){
        try{
            System.out.println(machine.sell(nameCafe));
        } catch (Exception e) {
            System.out.println("Товар не найден");
        }
    }
}
