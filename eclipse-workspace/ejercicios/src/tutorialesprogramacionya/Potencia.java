package tutorialesprogramacionya;

class Potencia {
    double b;
    int e;
    double valor;

    Potencia(double b, int e){
      this.b=b;
      this.e=e;
      this.valor=1;

        if (e==0) return;
        for ( ; e>0; e--) this.valor = this.valor * b;
    }

     double get_potencia(){
        return this.valor;
}

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		Potencia poten= new Potencia(12, 30);
		System.out.println(poten.get_potencia());
	}

}
