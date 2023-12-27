public enum DayOfWeek {
    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7)

    private String name;
    private int nrOfDay;

    DayOfWeek(String name, int nrOfday){
        this.name = name;
        this.nrOfDay = nrOfday;
    }

    public boolean isWeekend(){
        return this == SATURDAY || this == SUNDAY;
    }
}
