package case_study_module2.models.function;


import case_study_module2.comma.Comma;

public class Booking {
    private int idBooking;
    private String starDate;
    private String endDate;
    private int customerCode;
    private String serviceCode;

    public Booking() {
    }

    public Booking(int idBooking, String starDate, String endDate, int customerCode, String serviceCode) {
        this.idBooking = idBooking;
        this.starDate = starDate;
        this.endDate = endDate;
        this.customerCode = customerCode;
        this.serviceCode = serviceCode;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getStarDate() {
        return starDate;
    }

    public void setStarDate(String starDate) {
        this.starDate = starDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(Integer customerCode) {
        this.customerCode = customerCode;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getInFo() {
        return this.getIdBooking() + Comma.COMMA +
                this.getStarDate() + Comma.COMMA +
                this.getEndDate() + Comma.COMMA +
                this.getCustomerCode() + Comma.COMMA +
                this.getServiceCode();
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", starDate='" + starDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", customerCode=" + customerCode +
                ", serviceCode='" + serviceCode + '\'' +
                '}';
    }
}
