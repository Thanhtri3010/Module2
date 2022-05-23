package bai_tap_them.staff_mvc.model;

public class DailyWorker extends Staff {
    private int workDay;

    public DailyWorker() {
    }

    public DailyWorker(int workDay) {
        this.workDay = workDay;
    }

    public DailyWorker(String name, int age, String address, int workDay) {
        super(name, age, address);
        this.workDay = workDay;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    @Override
    public double salaryStaff() {
        return this.workDay * 120000;
    }

    @Override
    public String toString() {
        return "DailyWorker{" + super.toString() +
                "workDay=" + workDay +
                '}' + "salary= " + salaryStaff();
    }
}
