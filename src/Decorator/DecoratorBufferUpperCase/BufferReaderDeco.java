package Decorator.DecoratorBufferUpperCase;

import java.io.*;

/**
 * Created by baptiste on 14/06/17.
 */
public class BufferReaderDeco extends BufferedReader{

    BufferReaderDeco(Reader in){
        super(in);
    }


    @Override
    public String readLine() throws IOException{
        return super.readLine().toUpperCase();
    }


/*
    public BufferedReader getContentFile(){
        try( BufferedReader br = new BufferedReader(new FileReader("fichier.txt")) ) {

        } catch(IOException e){
            e.printStackTrace();
        }
        return reader;
    }
*/

}
