package decorator;

class MensajeConResumen implements Mensaje {
    private Mensaje mensaje;
    private String resumen;

    public MensajeConResumen(Mensaje mensaje, String resumen) {
        this.mensaje = mensaje;
        this.resumen = resumen;
    }
   

	@Override
	public String obtenerContenido() {
		// TODO Auto-generated method stub
		return resumen + "\n" + mensaje.obtenerContenido();
	}
}
