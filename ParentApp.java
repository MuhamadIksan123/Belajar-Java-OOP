public class ParentApp {
    public static void main(String[] Args) {
        Child child = new Child();
        child.doIt();
        System.out.println(child.name = "Child");

        Parent parent = (Child) child;
        parent.doIt();
        System.out.println(parent.name);
    }
}
