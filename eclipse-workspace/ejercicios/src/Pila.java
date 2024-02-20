

import java.util.Stack;


public class Pila{
	class Nodo {
		int dato;
		Nodo sig;
		}
		private Nodo raiz;
		public Pila(){
		raiz=null;
	}
	public void push(int d){

		Nodo nuevo;
		nuevo=new Nodo();
		if (raiz==null) {
			nuevo.sig=null;
			raiz=nuevo;
		}else{
			nuevo.sig=raiz;
			raiz=nuevo;
		}
	}
	
	public int pop(){
		if (raiz==null) {;
		int information=raiz.dato;
		raiz=raiz.sig;
		return information;
		}else{
		return Integer.MAX_VALUE;}
	}

	public void print(){
		Nodo aux=raiz;
		System.out.println("contenido de la pila:");
		while (aux!=null){
			System.out.print(aux.dato+"->");
			aux=aux.sig;
		}
		System.out.println();
	}

    public static void main(String[] args) {

    	Pila pila1=new Pila();
    	pila1.push(21);
    	pila1.push(47);
    	pila1.push(48);
    	pila1.push(36);
    	pila1.push(47);
    	pila1.print ();
    	System.out.println("extraemos de la pila "+pila1.pop());
    	pila1.print();
    		
    }
}