package thanh_tri.models;

import thanh_tri.comma.Comma;

public class Teacher extends Person {
    private String specialize;

    public Teacher() {
    }

    @Override
    public String getInfo() {
        return super.getId()+ Comma.COMMA+
                super.getName()+Comma.COMMA+
                super.getAge()+Comma.COMMA+
                super.getSex()+Comma.COMMA+
                this.getSpecialize();
    }

    public Teacher(String specialize) {
        this.specialize = specialize;
    }

    public Teacher(String id, String name, String age, String sex, String specialize) {
        super(id, name, age, sex);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString()+
                "specialize='" + specialize + '\'' +
                '}';
    }
}
