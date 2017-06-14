package Decorator.DecoratorBalise;

/**
 * Created by baptiste on 14/06/17.
 */
public class BaliseI extends Balise{

    BaliseI(Chaine p_chaine) {
        super(p_chaine);
    }

    @Override
    public void methodPrint() {
        baliseOuvrante();
        super.methodPrint();
        baliseFermante();
    }

    public void baliseOuvrante(){
        System.out.printf("<i>");
    }

    public void baliseFermante(){
        System.out.printf("</i>");
    }

}
