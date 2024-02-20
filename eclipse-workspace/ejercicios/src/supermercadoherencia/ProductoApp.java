package supermercadoherencia;
import java.lang.*;

public class ProductoApp {
    public static void main(String[]args){
        ProdutosCongelados nuggets = new ProdutosCongelados("16-10-2016","L1603004");
        ProductoFresco lechuga = new ProductoFresco("20-10-2016","L1610005");
        ProductoRefigerado jugo = new ProductoRefigerado("25-10-2016","L1609006");
        System.out.println("Sin datos. \nProducto Congelado: ");
        System.out.println("Fecha de caducidad: " + nuggets.getFechaCaducidad() + "\nNumero de Lote: " + nuggets.getNumeroLote()
                           + "\nTemperatura Recomendada: " + nuggets.getTemperaturaRecomendada() + "C°");
        System.out.println();
        System.out.println("Producto Fresco: ");
        System.out.println("Fecha de caducidad: " + lechuga.getFechaCaducidad() + "\nNumero de Lote: " + lechuga.getNumeroLote()
                           );
        System.out.println();
        System.out.println("Producto Refrigerado: ");
        System.out.println("Fecha de caducidad: " + jugo.getFechaCaducidad() + "\nNumero de Lote: " + jugo.getNumeroLote()
                           + "\nCodigo de supervision alimentaria: " );
        nuggets.setTemperaturaRecomendada(-18);
        lechuga.setFechaEnvasado("03-10-2015");
        lechuga.setPaisDeOrigen("Panamá");
        jugo.setCodigoSupervisionAlimentaria("B#6745");
        System.out.println();
        System.out.println("Con datos. \nProducto Congelado: ");
        System.out.println("Fecha de caducidad: " + nuggets.getFechaCaducidad() + "\nNumero de Lote: " + nuggets.getNumeroLote()
                           + "\nTemperatura Recomendada: " + nuggets.getTemperaturaRecomendada() + "C°");
        System.out.println();
        System.out.println("Producto Fresco: ");
        System.out.println("Fecha de caducidad: " + lechuga.getFechaCaducidad() + "\nNumero de Lote: " + lechuga.getNumeroLote()
                          );
        System.out.println();
        System.out.println("Producto Refrigerado: ");
        System.out.println("Fecha de caducidad: " + jugo.getFechaCaducidad() + "\nNumero de Lote: " + jugo.getNumeroLote()
                           + "\nCodigo de supervision alimentaria: " );
    }
}
