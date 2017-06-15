package Strategy.StrategyLogger;

/**
 * Created by baptiste on 15/06/17.
 */
public class Formater_HTML implements IFormater{

    @Override
    public String format(String message) {
        return "<HTML><p> "+message+"</p></HTML>";
    }
}
