public class ManagerApp {
    public static void main(String[] Args) {
        Employee employee = new Employee("Eko");
        employee.sayHello("Budi");

        employee = new Manager("Rina");
        employee.sayHello("Budi");

        employee = new VicePresident("Jodi");
        employee.sayHello("Budi");

        sayHello(new Employee ("Eko"));
        sayHello(new Manager("Rina"));
        sayHello(new VicePresident("Budi"));
    }

    static void sayHello(Employee employee) {
        if(employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident);
        } else if(employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager);
        } else {
            System.out.println("Hello " + employee);
        }
    }
}
