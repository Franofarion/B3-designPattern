package Decorator.DecoratorBalise;

/**
 * Created by baptiste on 14/06/17.
 */
public class Chaine {

    private String text;

    public Chaine(){

    }

    public Chaine(String p_text){
        text = p_text;
    }

    public void methodPrint(){
        System.out.printf(text);
    }
}
