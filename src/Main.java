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
        int WORKING_DAYS = 20;

        int monthlyWage = 0;
        int totalHours = 0;

        for (int i=1;i<=WORKING_DAYS;i++)
        {
            int empCheck = (int)(Math.floor(Math.random()*10)%3);

            switch (empCheck){
                case 1:
                    System.out.println("Employee is Present");
                    totalHours += FULL_DAY_HOURS;
                    break;
                case 2:
                    System.out.println("Employee is part time");
                    totalHours += PART_TIME_HOURS;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    break;
            }
        }



        monthlyWage = totalHours * WAGE_PER_HOUR;
        System.out.println("total monthly wage = " + monthlyWage);
    }
}