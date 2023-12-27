package Exercises.exercise2enumwithFields;

public enum Planet {
    Mercury("Mercury", 0.39),
    VENUS("Venus", 0.72),
    EARTH("Earth", 1.0),
    MARS("Mars", 1.52),
    JUPITER("Jupiter", 5.20),
    SATURN("Saturn", 9.54),
    URANUS("Uranus", 19.19),
    NEPTUNE("Neptune", 30.07);

    private String name;
    private double distanceFromSun;

    Planet(String name, double distanceFromSun) {
        this.name = name;
        this.distanceFromSun = distanceFromSun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public void setDistanceFromSun(double distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }
}
