package bai_tap_them.school.models;

public abstract class Person {
    private int id;
    private String name;
    private String sex;
    private String age;
    private String address;

    public Person() {
    }

    public Person(int id, String name, String sex, String age, String address) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public abstract String getInfo();
    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", tên='" + name + '\'' +
                ", giới tính='" + sex + '\'' +
                ", tuổi='" + age + '\'' +
                ", địa chỉ='" + address + '\'' +
                '}';
    }
}
