//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to employee wage computation program");


        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOURS = 8;
        int PART_TIME_HOURS = 4;

        int empCheck = (int)(Math.floor(Math.random()*10)%3);

        int curHours = 0;

        if(empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present");
            curHours = FULL_DAY_HOURS;
        }
        else if(empCheck == IS_PART_TIME)
        {
            System.out.println("Employee is part time");
            curHours = PART_TIME_HOURS;
        }
        else
            System.out.println("Employee is Absent");

        int dailyWage = curHours * WAGE_PER_HOUR;
        System.out.println("current day wage = " + dailyWage);
    }
}