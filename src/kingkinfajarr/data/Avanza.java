package kingkinfajarr.data;

public class Avanza implements Car, IsMaintenance {
    public void drive() {
        System.out.println("Avanza drive");
    }

    public int getTire() {
        return 4;
    }

    public String getBrand() {
        return "Toyota";
    }

    public boolean isMaintenance() {
        return false;
    }
}
