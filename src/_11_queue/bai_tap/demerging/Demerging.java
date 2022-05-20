package _11_queue.bai_tap.demerging;

public class Demerging implements Comparable<Demerging>{
    private String name;
    private final boolean gender;
    private final Integer born;

    public Demerging(String name, boolean gender, Integer born) {
        this.name = name;
        this.gender = gender;
        this.born = born;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public Integer getBorn() {
        return born;
    }

    @Override
    public String toString() {
        return "Demerging{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", born=" + born +
                '}';
    }

    @Override
    public int compareTo(Demerging o) {
        return this.getBorn().compareTo(o.getBorn());


    }
}
