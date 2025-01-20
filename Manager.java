class Manager extends Employee {
    Manager(String name) {
        super(name);
    }

    void sayHello(String name) {
        System.err.println("Hello " + name + " My Name is Manager " + this.name);
    }
}