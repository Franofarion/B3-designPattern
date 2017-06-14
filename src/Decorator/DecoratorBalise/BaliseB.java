package Decorator.DecoratorBalise;

/**
 * Created by baptiste on 14/06/17.
 */
public class BaliseB extends Balise {


    BaliseB(Chaine p_chaine) {
        super(p_chaine);
    }

    @Override
    public void methodPrint() {
        baliseOuvrante();
        super.methodPrint();
        baliseFermante();
    }

    public void baliseOuvrante(){
        System.out.printf("<b>");
    }

    public void baliseFermante(){
        System.out.printf("</b>");
    }
}
