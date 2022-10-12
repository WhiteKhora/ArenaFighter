import java.util.ArrayList;
import java.util.List;

public class Types {
    public List<String> types = new ArrayList<>();

    public Types() {
        types.add("Assassin");
        types.add("Berserker");
        types.add("Knight");
        types.add("Ranger");
    }

    public List<String> getEntries() {
        return types;
    }

    public String getFieldValue(int p) {
        return types.get(p);
    }
}
