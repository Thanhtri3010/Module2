package thanh_tri.models;

import thanh_tri.comma.Comma;

public class Students extends Person {
    private String nameClass;
    private float point;

    public Students() {
    }

    @Override
    public String getInfo() {
        return super.getId()+ Comma.COMMA+
                super.getName()+Comma.COMMA+
                super.getAge()+Comma.COMMA+
                super.getSex()+Comma.COMMA+
                this.getNameClass()+Comma.COMMA+
                this.getPoint();
    }

    public Students(String nameClass, float point) {
        this.nameClass = nameClass;
        this.point = point;
    }

    public Students(String id, String name, String age, String sex, String nameClass, float point) {
        super(id, name, age, sex);
        this.nameClass = nameClass;
        this.point = point;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "nameClass='" + nameClass + '\'' +
                ", point=" + point +
                '}';
    }
}
