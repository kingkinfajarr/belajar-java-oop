public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Kingkin");
        manager.name = "Kingkin";
        manager.sayHello("Fajar");

        var vicePresident = new VicePresident("Joko");
        vicePresident.name = "Kingkin";
        vicePresident.sayHello("Nanda");
    }
}
