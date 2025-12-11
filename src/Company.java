public class Company {
    String name;
    int WAGE_PER_HOUR;
    int FULL_DAY_HOURS;
    int PART_TIME_HOURS;
    int MAX_WORKING_DAYS;
    int MAX_HOURS;

    public Company(String name, int WAGE_PER_HOUR, int FULL_DAY_HOURS, int PART_TIME_HOURS, int MAX_WORKING_DAYS, int MAX_HOURS) {
        this.name = name;
        this.WAGE_PER_HOUR = WAGE_PER_HOUR;
        this.FULL_DAY_HOURS = FULL_DAY_HOURS;
        this.PART_TIME_HOURS = PART_TIME_HOURS;
        this.MAX_WORKING_DAYS = MAX_WORKING_DAYS;
        this.MAX_HOURS = MAX_HOURS;
    }
}
