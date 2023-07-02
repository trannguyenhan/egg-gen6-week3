package ex2;

import java.time.Instant;
import java.util.Date;

public class Book {
    private String code;
    private String title;
    private Date importDate;
    private Double price;
    private Integer quantity;
    private Date publishing; // nha xuat ban

    public Book(){
        this("CODE01", "No title", Date.from(Instant.now()), 0.0, 0, Date.from(Instant.now()));
    }

    public Book(String code, String title, Date importDate, Double price, Integer quantity, Date publishing) {
        this.code = code;
        this.title = title;
        this.importDate = importDate;
        this.price = price;
        this.quantity = quantity;
        this.publishing = publishing;
    }

    public Double calcMoney(){
        return this.price * this.quantity;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public Date getImportDate() {
        return importDate;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Date getPublishing() {
        return publishing;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPublishing(Date publishing) {
        this.publishing = publishing;
    }
}
