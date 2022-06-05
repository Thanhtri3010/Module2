package case_study_module2.models.faciity;

import case_study_module2.comma.Comma;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    @Override
    public String getInfo() {
        return super.getIdFacility() + Comma.COMMA +
                super.getNameService() + Comma.COMMA +
                super.getAreaUse() + Comma.COMMA +
                super.getRentalPrice() + Comma.COMMA +
                super.getRentalPeopleMax() + Comma.COMMA +
                super.getStyleRental() + Comma.COMMA +
                this.getFreeService();
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String idFacility, String nameService, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String freeService) {
        super(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
