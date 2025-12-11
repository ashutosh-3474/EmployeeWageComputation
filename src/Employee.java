public class Employee {
    String name;
    Company company;

    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;

    public Employee(String name, Company company) {
        this.name = name;
        this.company = company;
    }

    public void computeWage() {
        int monthlyWage = 0;
        int totalHours = 0;
        int totalDays = 0;

        while(totalDays < company.MAX_WORKING_DAYS && totalHours < company.MAX_HOURS)
        {
            int empCheck = (int)(Math.floor(Math.random()*10)%3);
            totalDays++;

            switch (empCheck){
                case IS_FULL_TIME:
                    System.out.println("Employee is Present");
                    totalHours += company.FULL_DAY_HOURS;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is part time");
                    totalHours += company.PART_TIME_HOURS;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    break;
            }
        }

        monthlyWage = totalHours * company.WAGE_PER_HOUR;
        System.out.println("total monthly wage = " + monthlyWage);
    }
}
