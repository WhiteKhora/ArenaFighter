import com.arenafighter.core.Controller;
import com.console.View;
import com.fighter.template.Fighter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static View view = new View();
    static List<Fighter> fighters = new ArrayList<>();
    static List<Player> players = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Controller controller = new Controller();
        //controller.run();

        view.printWelcomeMessage();
        view.printInputText("name");
        String name = view.readString();
        String type = view.getType();

        Fighter object = controller.createFighter(name, type);
        fighters.add(object);

        getFighter();
    }

    public static void printListContents() {
        for (int i = 0; i < fighters.size(); i++) {
            view.printListContent(i, fighters.get(i).printPrimitiveOverview());
        }
    }

    public static void getFighter() {
        view.printChooseText("fighter");
        printListContents();

        int i = view.getLoopInput();
        fighters.get(i).printOverview();
    }
}
