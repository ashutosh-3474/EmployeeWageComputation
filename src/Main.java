//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to employee wage computation program");

        Company  c1 = new Company("ABC", 30, 8, 7, 22, 120);
        Employee e1 = new Employee("XYZ", c1);

        e1.computeWage();
    }
}