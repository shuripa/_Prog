package boards.server;

//IdGenerator это синглтон
public class IdGenerator {
    private int moduleId;

    public IdGenerator(){
        moduleId = 0;
    }

    public int getModuleId() {
        moduleId++;
        return moduleId;
    }
}

