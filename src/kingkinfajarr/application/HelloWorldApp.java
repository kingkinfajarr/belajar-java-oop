package kingkinfajarr.application;

import kingkinfajarr.data.HelloWorld;

public class HelloWorldApp {

    public static void main(String[] args) {

        HelloWorld english = new HelloWorld() {

            public void sayHello() {
                System.out.println("Hello");
            }

            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

    }

}
