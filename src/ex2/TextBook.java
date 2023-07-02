package ex2;

import java.util.Date;

// sach giao khoa
public class TextBook  extends Book{
    private Boolean status; // true: new, false: old

    public TextBook(){
        super();
        this.status = true;
    }

    public TextBook(String code, String title, Date importDate, Double price, Integer quantity, Date publishing, Boolean status) {
        super(code, title, importDate, price, quantity, publishing);
        this.status = status;
    }

    @Override
    public Double calcMoney() {
        if(this.status){
            return super.calcMoney();
        }

        return super.calcMoney() * 0.5;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
