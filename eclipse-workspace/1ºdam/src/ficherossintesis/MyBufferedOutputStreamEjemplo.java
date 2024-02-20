package ficherossintesis;
//da error
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyBufferedOutputStreamEjemplo {

    public static void main(String[] args) {
        byte CR = 13;
        //final byte LF = 10;

        try {
            FileOutputStream fos = new FileOutputStream("c:\\ficheros\\fich1.bin");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            fos.write((byte) 'a');
            fos.write(CR);

            fos.write((byte) 'p');
            fos.write(CR);
            fos.write((byte) 'i');
            fos.write(CR);
            fos.write((byte) 'c');
            fos.write(CR);
            fos.write((byte) 'u');

          //  bos.write(LF);
            fos.close();
            bos.close();
            System.out.println("Fichero creado");
        } catch (IOException ioe) {
            System.out.println("error");
        }
    }
}
