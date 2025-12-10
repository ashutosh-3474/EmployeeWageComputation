//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to employee wage computation program");


        int IS_FULL_TIME = 1;
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOURS = 8;

        int empCheck=(int)(Math.floor(Math.random()*10)%2);
        if(empCheck==IS_FULL_TIME) {
            System.out.println("Employee is Present");
            int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
            System.out.println("Daily Employee Wage: " + dailyWage);
        }
        else
            System.out.println("Employee is Absent");
    }
}