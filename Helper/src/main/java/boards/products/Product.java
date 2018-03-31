package boards.products;

import java.util.Calendar;

public class Product {
    int id;
    String name;
    Calendar dtStart;
    Calendar dtFinish;
    double etalonTime;

    public Product(String name){
        this.name = name;
    }

    public Product(String name, double etalonTime){
        this.etalonTime = etalonTime;
    }

    public Product(String name, double etalonTime, int id){
        this.etalonTime = etalonTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDtStart(Calendar dtStart) {
        this.dtStart = dtStart;
    }

    public void setDtFinish(Calendar dtFinish) {
        this.dtFinish = dtFinish;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dtStart=" + dtStart +
                ", dtFinish=" + dtFinish +
                ", etalonTime=" + etalonTime +
                '}';
    }
}
