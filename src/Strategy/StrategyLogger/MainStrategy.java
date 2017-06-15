package Strategy.StrategyLogger;

/**
 * Created by baptiste on 15/06/17.
 */
public class MainStrategy {
    public static void main(String [] a){
        Logger log = new Logger_Console(new Formater_XML()) ;
        log.write("Mon log en XML");
        log.setFormater(new Formater_HTML()) ;
        log.write("Mon log en HTML");
    }
}
