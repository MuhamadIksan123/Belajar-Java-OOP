package pzn.application;

import pzn.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] Args) {
        HelloWorld english = new HelloWorld() {
            public void sayHello() {
                System.out.println("Halo");
            }

            public void sayHello(String name) {
                System.out.println("Halo " + name);
            }
        };

        english.sayHello();
        english.sayHello("Eko");
    }
}
