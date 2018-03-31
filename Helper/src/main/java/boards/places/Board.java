package boards.places;

import java.util.ArrayList;

public class Board {
    private int boardId;
    private SkillsBoard skillBoard;
    private ArrayList<Position> positions = new ArrayList<>();
    private int assigned = 0;

    public Board(int boardId) {
        this.boardId = boardId;
    }

    public void setPositions(Position position) {
        positions.add(position);
    }
    public Position getPosition(int index){
        return positions.get(index);
    }

    public int getId() {
        return boardId;
    }

    @Override
    public String toString(){
        String s = "";
        for (Position p: positions){
            s = s + p.toString();
        }
        return "BoardID: " + boardId + ", Pos: " + s;
    }

    public void setAssignned(int uniqNo) {
        assigned = uniqNo;
    }

    public void clearAssignned() {
        assigned = 0;
    }


}
