class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
    void sayHello(String name) {
        System.err.println("Hello " + name + " My Name is Employee " + this.name);
    }
}