package case_study_module2.models.faciity;

import case_study_module2.comma.Comma;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloors;

    public House() {
    }

    @Override
    public String getInfo() {
        return super.getIdFacility() + Comma.COMMA +
                super.getNameService() + Comma.COMMA +
                super.getAreaUse() + Comma.COMMA +
                super.getRentalPrice() + Comma.COMMA +
                super.getRentalPeopleMax() + Comma.COMMA +
                super.getStyleRental() + Comma.COMMA +
                this.getRoomStandard() + Comma.COMMA +
                this.getNumberOfFloors();
    }

    public House(String roomStandard, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String idFacility, String nameService, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String roomStandard, int numberOfFloors) {
        super(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
