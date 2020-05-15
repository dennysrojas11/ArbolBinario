package arbol_binario;
/*
 @author wolfie
 */
public class Arbol_Binario {

    public static void main(String[] args) {
        arbolBinarioOrdenado abo=new arbolBinarioOrdenado();
        abo.insertar(100);
        abo.insertar(50);
        abo.insertar(25);
        abo.insertar(75);
        abo.insertar(150);
        System.out.println("Impresión preorden: "); abo.imprimirPre();
        System.out.println("Impresión entreorden: "); abo.imprimirEntre();
        System.out.println("Impresión postorden: ");abo.imprimirPost();        
    }
}
