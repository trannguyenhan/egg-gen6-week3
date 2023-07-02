package ex2;

import java.util.Date;

public class ReferBook extends Book{
    private String specialized;
    private Double tax;

    public ReferBook(){
        super();
        this.specialized = "IT";
        this.tax = 0.0;
    }

    public ReferBook(String code, String title, Date importDate, Double price, Integer quantity, Date publishing, String specialized, Double tax) {
        super(code, title, importDate, price, quantity, publishing);
        this.specialized = specialized;
        this.tax = tax;
    }

    @Override
    public Double calcMoney() {
        return super.calcMoney() + this.tax;
    }

    public String getSpecialized() {
        return specialized;
    }

    public Double getTax() {
        return tax;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
}
