public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Kingkin");
        employee.sayHello("Fajar");

        employee = new Manager("Kingkin");
        employee.sayHello("Fajar");

        employee = new VicePresident("Kingkin");
        employee.sayHello("Fajar");

        sayHello(new Employee("Kingkin"));
        sayHello(new Manager("Fajar"));
        sayHello(new VicePresident("Anifianto"));
    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else  if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }

}
