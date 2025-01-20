public class PersonApp {
    public static void main(String[] Args) {
        var person1 = new Person("Iksan", "Cirebon");

        System.out.println(person1.name);
        System.out.println(person1.address);

        person1.sayHello("Putri");


        Person person2 = new Person("Joko");
        person2.sayHello("Adawiyah");

        Person person3;
        person3 = new Person();
        person3.name = "Budi";
        person3.sayHello("Rizka");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
