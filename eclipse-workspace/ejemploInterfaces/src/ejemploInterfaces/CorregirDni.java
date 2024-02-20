package ejemploInterfaces;

import javax.swing.JOptionPane;

public class CorregirDni implements EventoCambiarPropiedad{

	@Override
	public void propiedadCambiada(ObjetoEvento e) {
		if(e.getNombrePropiedad().equals("dni")){
			if(comprobarDni(e.getValorPropiedad())){
				JOptionPane.showMessageDialog(null, "El dni:"+e.getValorPropiedad()+" es correcto");
			}else if(comprobarDni(e.getAnteriorPropiedad())){
				JOptionPane.showMessageDialog(null, "El dni:"+e.getValorPropiedad()+" es incorrecto se procedera a restaurarlo usando el dni:"+e.getAnteriorPropiedad());
				Persona p = (Persona)e.getOrigen();
				p.setDni(e.getAnteriorPropiedad());
			}else{
				JOptionPane.showMessageDialog(null, "Tanto el dni actual:"+e.getValorPropiedad()+" como el dni anterior:"+e.getAnteriorPropiedad()+" son incorrectos.");
				String nuevoDni = JOptionPane.showInputDialog("Haga el favor de corregirlo introduciendo uno nuevo");
				Persona p = (Persona)e.getOrigen();
				p.setDni(nuevoDni);
			}
		}
	}
	
	private boolean comprobarDni(String dni){
		String [] letras = {"T","R","w","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		int resto = Integer.parseInt(dni.substring(0, dni.length()-1))%23;
		return letras[resto].equalsIgnoreCase(dni.substring(dni.length()-1));
	}

}
