public class Employee {
    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;
    private static int WAGE_PER_HOUR = 20;
    private static int FULL_DAY_HOURS = 8;
    private static int PART_TIME_HOURS = 4;
    private static int MAX_WORKING_DAYS = 20;
    private static int MAX_HOURS = 100;

    public static void computeWage() {
        int monthlyWage = 0;
        int totalHours = 0;
        int totalDays = 0;

        while(totalDays < MAX_WORKING_DAYS && totalHours < MAX_HOURS)
        {
            int empCheck = (int)(Math.floor(Math.random()*10)%3);
            totalDays++;

            switch (empCheck){
                case IS_FULL_TIME:
                    System.out.println("Employee is Present");
                    totalHours += FULL_DAY_HOURS;
                    break;
                case IS_PART_TIME:
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
