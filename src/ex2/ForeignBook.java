package ex2;

import java.util.Date;

public class ForeignBook extends Book{
    public String language;

    public ForeignBook(String language) {
        super();
        this.language = language;
    }

    public ForeignBook(String code, String title, Date importDate, Double price, Integer quantity, Date publishing, String language) {
        super(code, title, importDate, price, quantity, publishing);
        this.language = language;
    }

    @Override
    public Double calcMoney() {
        return super.calcMoney() * 1.2;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
