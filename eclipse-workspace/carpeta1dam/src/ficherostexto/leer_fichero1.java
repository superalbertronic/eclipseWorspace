package ficherostexto;

import java.io.*;

public class leer_fichero1 {

    public static void main(String[] args) {
    
        File archivo1=null;
        FileReader fr=null;
        BufferedReader br=null;
        
      try{  
    //creamos fichero
        archivo1 = new File("c:/leer/fichero.txt");
        fr = new FileReader(archivo1);
        br=new BufferedReader(fr);    

        //leemos el fichero
        String linea;
        //mientras el fichero tiene contenido
        linea=br.readLine();
        
        while(linea!=null)
        {
        System.out.println(linea);
        }
       }
      catch(Exception e)
              {
            System.out.println(e.getMessage());  
              }    
            finally{      
              try{    
                  if(fr != null)
                     {
                    fr.close();
                    }
              }
              catch(Exception e2)
              {
              System.out.println(e2.getMessage());
              }             





              }




    }
    
}
