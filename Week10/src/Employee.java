public class Employee {
    private int id;
    private int totalHours;

    public Employee(int id, int totalHours) {
        this.id = id;
        this.totalHours = totalHours;
    }

    public int getId() {
        return id;
    }

    public int getTotalHours() {
        return totalHours;
    }

    @Override
    public String toString() {
        return "Employee " + id + ": Total Hours = " + totalHours;
    }
}
