class VicePresident extends Manager {

    VicePresident(String name) {
        super(name);
    }

    // overriding
    void sayHello(String name) {
        System.out.println("Hi " + name + ", My name is VicePresident " + name);
    }
}
