package Controle.AdapterLegacy;

/**
 * Created by baptiste on 15/06/17.
 */
public class LegacyLine extends Shape {

    public void draw(int x1, int y1, int x2, int y2)
    {
        System.out.println("line from (" + x1 + ',' + y1 + ") to(" + x2 + ','+ y2 + ')');
    }

    @Override
    public void draw() {

    }
}