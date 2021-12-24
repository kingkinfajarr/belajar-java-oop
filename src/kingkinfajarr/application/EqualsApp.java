package kingkinfajarr.application;

public class EqualsApp {

    public static void main(String[] args) {
        String first = "Kingkin";
        first = first + " " + "Fajar";

        System.out.println(first);

        String second = "Kingkin Fajar";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Kingkin Fajar";

        System.out.println(second == third);
        System.out.println(second.equals(third));
    }

}
