package boards.places;

import boards.products.Product;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TODO: Протестировать скил. Если скилл не задан или модуль не подходит как ведет себя класс.

public class Board {
    private int boardId;
    private ArrayList<Position> positions = new ArrayList<>();
    private int assigned = 0;
    private Product joinProduct = null;

    Pattern pat;
    Matcher mat;
    Boolean b = false;

    public Board(int boardId) {
        this.boardId = boardId;
    }

    public void setSkill(String skill) {
        this.pat = Pattern.compile(skill);
    }

    public void setProduct(Product joinProduct) {
        this.joinProduct = joinProduct;
    }

    public void setPositions(Position position) {
        positions.add(position);
    }
    public Position getPosition(int index){
        return positions.get(index);
    }

    public int getBoardId() {
        return boardId;
    }

    public void setAssignned(int uniqNo) {
        assigned = uniqNo;
    }

    public void clearAssignned() {
        assigned = 0;
    }

    public boolean isValid (String productName){
        mat = pat.matcher(productName);
        b = mat.matches();
        System.out.println("Паттерн: " + pat.pattern() + "Модуль: " + productName);
        System.out.println("Проверка: " + b);
        return b;
    }

    @Override
    public String toString() {
        return "Board{" +
                "boardId=" + boardId +
//                ", skillBoard=" + skillsBoard +
                ", positions=" + positions +
                ", assigned=" + assigned +
                '}';
    }
}
