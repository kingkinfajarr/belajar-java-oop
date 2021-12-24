public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Kingkin", "Karanganyar");
        var person2 = new Person("Kingkin");
        var person3 = new Person();

        // person.country = "Jepang"; //ERROR

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Kingkin");
    }
}
