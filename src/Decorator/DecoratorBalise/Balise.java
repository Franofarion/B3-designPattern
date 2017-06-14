package Decorator.DecoratorBalise;

/**
 * Created by baptiste on 14/06/17.
 */
public class Balise extends Chaine{
    private Chaine chaine;

    Balise(Chaine p_chaine){
        chaine = p_chaine;
    }

    @Override
    public void methodPrint() {
        chaine.methodPrint();
    }
}
