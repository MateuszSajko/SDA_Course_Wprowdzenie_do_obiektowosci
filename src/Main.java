import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TWORZENIE AUT
        Scanner scanner = new Scanner(System.in);
     /*   Car audi = new Car("Red", 5,"A4", false);
        System.out.println(audi.getAutomaticGearbox());
        System.out.println(audi.getColour());
        System.out.println(audi.getDoorsAmount());
        System.out.println(audi.getBrand());

        audi.setAutomaticGearbox(true);

        System.out.println("Wprowadz zadany kolor");
        String kolor =scanner.next();
        audi.setColour(kolor);

        System.out.println("Wprowadz zadana ilosc drzwi");
        int drzwi = scanner.nextInt();
        audi.setDoorsAmount(drzwi);

        System.out.println("Jaki model?");
        String model = scanner.next();
        audi.setBrand(model);

        System.out.println("Twoje auto to Audi z parametrami:");
        System.out.println("kolor: " + audi.getColour());
        System.out.println("Ilosc drzwi: " + audi.getDoorsAmount());
        System.out.println("Model: " + audi.getBrand());
        System.out.println("Automatyczna skrzynia biegow:" + audi.getAutomaticGearbox());
 //Kalkulator
        int a;
        int b;
        a = 10;
        b = 2;
        int c;
        c = a - b;
        System.out.println(c);

        Kalkulator op1 = new Kalkulator();
        System.out.println( op1.add(5,7));
        System.out.println( op1.sub );

        Kalkulator calc = new Kalkulator();

        System.out.println("wprowadz pierwsza liczbe");
        double liczba1 = scanner.nextDouble();
        System.out.println("Wprowadz druga liczbe");
        double liczba2 = scanner.nextDouble();
        System.out.println("Twoj wynik sumy to " + calc.add(liczba1,liczba2));
        System.out.println("Twoj wynik roznicy to " + calc.sub(liczba1,liczba2));
        System.out.println("Twoj wynik mnozenia to " + calc.multi(liczba1,liczba2));
        System.out.println("Twoj wynik dzielenia to " + calc.div(liczba1,liczba2));
        */
        Kalkulator calc = new Kalkulator();
        System.out.println("wprowadz pierwsza liczbe");
        double liczba1 = scanner.nextDouble();
        System.out.println("Wprowadz druga liczbe");
        double liczba2 = scanner.nextDouble();
        System.out.println("Wprowadz zadana operacje. 1 - dodawanie, 2- odejmowanie, 3- mnozenie, 4- dzielenie");
        int x = scanner.nextInt();
        switch (x) {
            case 1:
                System.out.println(calc.add(liczba1, liczba2));
                break;
            case 2:
                System.out.println(calc.sub(liczba1, liczba2));
                break;
            case 3:
                System.out.println(calc.multi(liczba1, liczba2));
                break;
            case 4:
                System.out.println(calc.div(liczba1, liczba2));
                break;

        }
    }
}
