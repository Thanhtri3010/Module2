package case_study_module2.models.faciity;

import case_study_module2.comma.Comma;
import case_study_module2.models.faciity.Facility;

public class Villa extends Facility {
    private String standardVilla;
    private double areaPool;
    private int floor;

    public Villa() {
    }

    @Override
    public String getInfo() {
        return  super.getIdFacility()+ Comma.COMMA+
                super.getNameService()+Comma.COMMA+
                super.getAreaUse()+Comma.COMMA+
                super.getRentalPeopleMax()+Comma.COMMA+
                super.getStyleRental()+Comma.COMMA+
                this.getStandardVilla()+Comma.COMMA+
                this.getAreaPool()+Comma.COMMA+
                this.getFloor()+Comma.COMMA+"\n";
    }

    public Villa(String standardVilla, double areaPool, int floor) {
        this.standardVilla = standardVilla;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public Villa(String idFacility, String nameService, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String standardVilla, double areaPool, int floor) {
        super(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.standardVilla = standardVilla;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public String getStandardVilla() {
        return standardVilla;
    }

    public void setStandardVilla(String standardVilla) {
        this.standardVilla = standardVilla;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString()+
                "standardVilla='" + standardVilla + '\'' +
                ", areaPool=" + areaPool +
                ", floor=" + floor +
                '}';
    }
}
