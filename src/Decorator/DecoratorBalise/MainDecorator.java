package Decorator.DecoratorBalise;

/**
 * Created by baptiste on 14/06/17.
 */
public class MainDecorator {
    public static void main(String[] args) {
        Chaine c = new Chaine("TEXTE");
        c = new BaliseB(c);
        c = new BaliseI(c);
        c.methodPrint();

    }

}
