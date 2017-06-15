package Strategy.StrategyLogger;

/**
 * Created by baptiste on 15/06/17.
 */
public class Logger_Console extends Logger {

    Logger_Console(IFormater format){
        super(format);
    }

    @Override
    public void write(String message){
        System.out.println(super.getFormat().format(message));
    }
}

