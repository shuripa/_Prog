package boards.places;

import boards.products.Product;

import java.util.ArrayList;

public class Board {
    private int boardId;
    private SkillsBoard skillBoard;
    private ArrayList<Position> positions = new ArrayList<>();
    private int assigned = 0;

    public void setProduct(Product joinProduct) {
        this.joinProduct = joinProduct;
    }

    private Product joinProduct = null;

    public Board(int boardId) {
        this.boardId = boardId;
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


    @Override
    public String toString() {
        return "Board{" +
                "boardId=" + boardId +
                ", skillBoard=" + skillBoard +
                ", positions=" + positions +
                ", assigned=" + assigned +
                '}';
    }
}
