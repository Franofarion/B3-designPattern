package Strategy.StrategyLogger;

/**
 * Created by baptiste on 15/06/17.
 */
public class Formater_XML implements IFormater {

    @Override
    public String format(String message) {
        return "<XML><Message> "+message+" </Message></XML>";
    }

}
