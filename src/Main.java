import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car audi = new Car("Red", 5,"A4", false);
        System.out.println(audi.getAutomaticGearbox());
        System.out.println(audi.getColour());
        System.out.println(audi.getDoorsAmount());
        System.out.println(audi.getBrand());

        audi.setAutomaticGearbox(true);

        System.out.println("Wprowadz zadany kolor");
        String kolor =scanner.nextLine();
        audi.setColour(kolor);

        System.out.println("Jaki model?");
        String model = scanner.nextLine();
        audi.setBrand(model);

        System.out.println("Wprowadz zadana ilosc drzwi");
        int drzwi = scanner.nextInt();
        audi.setDoorsAmount(drzwi);

        System.out.println("Twoje auto to Audi z parametrami:");
        System.out.println("kolor: " + audi.getColour());
        System.out.println("Ilosc drzwi: " + audi.getDoorsAmount());
        System.out.println("Model: " + audi.getBrand());
        System.out.println("Automatyczna skrzynia biegow:" + audi.getAutomaticGearbox());
    }
}
