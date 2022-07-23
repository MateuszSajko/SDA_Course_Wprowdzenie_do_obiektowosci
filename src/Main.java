public class Main {
    public static void main(String[] args) {

        Car audi = new Car("Red", 5,"A4", false);
        System.out.println(audi.getAutomaticGearbox());
        System.out.println(audi.getColour());
        System.out.println(audi.getDoorsAmount());
        System.out.println(audi.getBrand());
        audi.setAutomaticGearbox(true);
        audi.setColour("Blue");
        audi.setDoorsAmount(3);
        audi.setBrand("A3");
        System.out.println(audi.getAutomaticGearbox());
        System.out.println(audi.getColour());
        System.out.println(audi.getDoorsAmount());
        System.out.println(audi.getBrand());
    }
}
