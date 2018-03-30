package boards.server;

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
