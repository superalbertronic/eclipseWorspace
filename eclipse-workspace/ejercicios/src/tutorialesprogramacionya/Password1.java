package tutorialesprogramacionya;

import java.util.Random;

public class Password1 {
char [] contrasena;
int longitud;

public Password1(int longitud) {
this.longitud=longitud;
Random a=new Random();
contrasena = new char[longitud];
for(int i=0;i<longitud;i++){
char caracterAlearotio=(char)(a.nextInt(89)+33);
contrasena[i]=caracterAlearotio;
}
}
public boolean esFuerte() {
int contarMayuscula = 0;
int contarMinuscula=0;
int contarNumeros=0;

for(int i=0;i<contrasena.length;i++){
if(Character.isDigit(contrasena[i])) {
	contarNumeros++;
	
	}else if(Character.isLowerCase(contrasena[i])){
	contarMinuscula++;
	}else if(Character.isUpperCase(contrasena[i])) {
	contarMayuscula++;
	}
	}
	if (contarMayuscula>=2 && contarMinuscula>= 1 && contarNumeros>=5){
	return true;
}
return false;

}
public  void generarPassword() {
	Random a=new Random();
	for(int i=0;i<longitud;i++){
	char caracterAlearotio=(char)(a.nextInt(89)+33);
	contrasena[i]=caracterAlearotio;
	}
}
public char[] getContrasena(){

return contrasena;

}
public int getLongitud(){

return longitud;

}
public void setLongitud (int longitud) {
this.longitud=longitud;
}

}

