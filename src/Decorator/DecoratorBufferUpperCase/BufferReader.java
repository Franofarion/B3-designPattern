package Decorator.DecoratorBufferUpperCase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by baptiste on 14/06/17.
 */
public class BufferReader {

    private BufferedReader reader;
    private File path;

    BufferReader(File p_path){
        path = p_path;
    }

    public BufferedReader getContentFile(){
        try( BufferedReader br = new BufferedReader(new FileReader("fichier.txt")) ) {

        } catch(IOException e){
            e.printStackTrace();
        }
        return reader;
    }

}
