package Lab05.Task1;

public class Subject {
    private static final int maxCredits;
    private static final Subject Instance;
    static {
        maxCredits = 100;
        Instance = new Subject("Java programming", 88);
    }
    private  String name;
    private  int credits;

    public Subject(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }
    public static Subject getInstance() {
        return Instance;
    }

    public int getCredits() {
        return credits;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException(
                    "Name cannot be null or empty");
        }
        this.name = name;
    }

    public void setCredits(int credits) {
        if (credits > maxCredits) {
            throw new IllegalArgumentException(
                    "credits cannot greater then 100");
        }
    }
    public void displayCourseDetails() {
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + credits);
    }
}