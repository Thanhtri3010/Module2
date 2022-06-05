package case_study_module2.models.function;

import case_study_module2.comma.Comma;

public class Contract {
    private Integer contractsCode;
    private Integer bookingCode;
    private Integer deposits;
    private Integer totalMoney;
    private Integer customerCode;

    public Contract() {
    }

    public Contract(Integer contractsCode, Integer bookingCode, Integer deposits, Integer totalMoney, Integer customerCode) {
        this.contractsCode = contractsCode;
        this.bookingCode = bookingCode;
        this.deposits = deposits;
        this.totalMoney = totalMoney;
        this.customerCode = customerCode;
    }

    public Integer getContractsCode() {
        return contractsCode;
    }

    public void setContractsCode(Integer contractsCode) {
        this.contractsCode = contractsCode;
    }

    public Integer getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(Integer bookingCode) {
        this.bookingCode = bookingCode;
    }

    public Integer getDeposits() {
        return deposits;
    }

    public void setDeposits(Integer deposits) {
        this.deposits = deposits;
    }

    public Integer getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Integer totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Integer getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(Integer customerCode) {
        this.customerCode = customerCode;
    }

    public String getInfo() {
        return this.getContractsCode() + Comma.COMMA +
                this.getBookingCode() + Comma.COMMA +
                this.getDeposits() + Comma.COMMA +
                this.getTotalMoney() + Comma.COMMA +
                this.getCustomerCode();
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractsCode=" + contractsCode +
                ", bookingCode=" + bookingCode +
                ", deposits=" + deposits +
                ", totalMoney=" + totalMoney +
                ", customerCode=" + customerCode +
                '}';
    }
}
