package boards.places;

import java.util.ArrayList;

public class Board {
    int boardId;
    SkillsBoard skillBoard;
    ArrayList<Position> positions = new ArrayList<>();

    public Board(int boardId) {
        this.boardId = boardId;
    }

    public void setPositions(Position position) {
        positions.add(position);
    }

    @Override
    public String toString(){
        String s = "";
        for (Position p: positions){
            s = s + p.toString();
        }
        return "BoardID: " + boardId + ", Pos: " + s;
    }

}
