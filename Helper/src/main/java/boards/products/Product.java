package boards.products;

import boards.masterdata.WorkStep;
import boards.plan.Order;

import java.util.Calendar;
import java.util.HashMap;

public class Product {
    private int prodId;
//    private int orderNo;
    private Order ord;
    private int ordId;
    private String name;
    private Calendar dtStart;
    private Calendar dtFinish;
    private double etalonTime;
    //TODO Реалізувати робочі кроки WorkStep
    private HashMap<Integer, WorkStep> workSteps = new HashMap();

    public Product(String name){
        this.name = name;
    }

//    public Product(String name, double etalonTime){
//        this.etalonTime = etalonTime;
//    }

//    public Product(String name, double etalonTime, int prodId){
//        this.etalonTime = etalonTime;
//    }

//    public Product(String name, int prodId, int orderNo){
//        this.etalonTime = etalonTime;
//    }

    public Product(String name, int prdId, int ordId){
        this.name = name;
        this.prodId = prdId;
        this.ordId = ordId;
    }

    public Product(String name, int id, Order ord){
        this.name = name;
        this.prodId = id;
        this.ord = ord;
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
                "prodId=" + prodId +
                ", name='" + name + '\'' +
                ", dtStart=" + dtStart +
                ", dtFinish=" + dtFinish +
                ", etalonTime=" + etalonTime +
                '}';
    }
}
