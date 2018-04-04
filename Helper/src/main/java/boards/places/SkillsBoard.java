package boards.places;
import java.util.regex.*;

public class SkillsBoard {
    Pattern pat;
    Matcher mat;
    Boolean b = false;

    public void setPattern(String pattern) {
        this.pat = Pattern.compile(pattern);
        System.out.println("Паттерн установлен" );
    }

    public boolean isValid (String module){
        mat = pat.matcher(module);
        b = mat.matches();
        System.out.println("Паттерн: " + pat.pattern() + "Модуль: " + module);
        System.out.println("Проверка: " + b);
        return b;
    }


}
