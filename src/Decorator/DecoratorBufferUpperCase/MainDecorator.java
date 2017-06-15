package Decorator.DecoratorBufferUpperCase;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by baptiste on 15/06/17.
 */
public class MainDecorator {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferReaderDeco(new FileReader("/home/baptiste/textDeco.txt")); //File path need to be changed for your project
            while (br.ready()){
                System.out.println(br.readLine());
            }
        } catch (IOException ex){
            Logger.getLogger(MainDecorator.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
