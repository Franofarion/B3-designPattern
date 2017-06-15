package Strategy.StrategyLogger;


/**
 * Created by baptiste on 15/06/17.
 */
public abstract class Logger {

    private IFormater format;

    Logger(IFormater p_format){
        format = p_format;
    }

    public void setFormater(IFormater formater) {
        this.format = formater;
    }

    public IFormater getFormat(){
        return format;
    }

    abstract void write(String message);
}
