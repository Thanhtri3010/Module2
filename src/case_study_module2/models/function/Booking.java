package case_study_module2.models.function;

import case_study_module2.models.faciity.Facility;
import case_study_module2.models.people.Customer;

public class Booking {
    private int idBooking;
    private String starDate;
    private String endDate;
    private Customer customer;
    private Facility facility;

    public Booking() {
    }

    public Booking(int idBooking, String starDate, String endDate, Customer customer, Facility facility) {
        this.idBooking = idBooking;
        this.starDate = starDate;
        this.endDate = endDate;
        this.customer = customer;
        this.facility = facility;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking=" + idBooking +
                ", starDate='" + starDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", customer=" + customer +
                ", facility=" + facility +
                '}';
    }
}
