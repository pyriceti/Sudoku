import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;

public class MainBoot {

    public static void main(String[] args) {

        Runtime rt = Runtime.instance();
        Profile p;

        try {
            String MAIN_PROPERTIES_FILE = "main_container.txt";
            p = new ProfileImpl(MAIN_PROPERTIES_FILE);
            AgentContainer mc = rt.createMainContainer(p);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
