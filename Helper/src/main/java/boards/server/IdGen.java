package boards.server;

public class IdGen {
    private static IdGen ourInstance = new IdGen();
    private int moduleId;

    public static IdGen getInstance() {
        return ourInstance;
    }

    private IdGen() {
        moduleId = 0;
    }

    public int getModuleId() {
        moduleId++;
        return moduleId;
    }
}
