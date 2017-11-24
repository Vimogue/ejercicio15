

public class Persona2 {
	/*
	 * definici�n de variables
	 */
	private String nombre;
	private byte edad;
	private char sexo;
	private String dni;
	private boolean casado;
	
	/*
	 * Creaci�n de constructores.
	 */
	
	public Persona2() {//sin par�metros.
		nombre= "s.ref";
		edad= 0;
		sexo= 'h';
		dni= "sin datos";
		casado= false;
	}
	
	public Persona2(String nombre, byte edad, char sexo, String dni, boolean casado){//con todos los par�metros.
		this.nombre= nombre;
		this.edad= edad;
		this.sexo= sexo;
		this.dni= dni;
		this.casado= casado;
	}
	/*
	 * Creaci�n de m�todos Setter y Guetter.
	 */
	public void setNombre(String nombre){
		this.nombre= nombre;
	}
	public String getNombre(){
		return nombre;
	}
	
	public void setEdad(byte edad){
		this.edad= edad;
	}
	
	public byte getEdad(){
		return edad;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public char getSexo() {
		return sexo;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public boolean getCasado() {
		return casado;
	}

	/*
	 * Sobrescribimos el m�todo equals para comparar los objetos en base al dni.
	 */
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	 @Override
	 public boolean equals(Object obj) {
		 if (obj instanceof Persona2 ){
			 Persona2 pers=(Persona2)obj;
			 if(this.dni==pers.dni){
				 return true;
			 }else{
				 return false;
			 }
		 }else{
			 return false;
		 }
	 }
	 
	/*
	 * Sobreescribimos el m�tod toString para que convierta los atributos de Persona.
	 * en cadenas de String.
	 */
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	 @Override
	public String toString() {
		return nombre + edad+ sexo+ dni + casado;
	}
	 
	 /*
	  * Creamos un m�todo para que aparezcan en pantalla los datos de Persona.
	  */
	public void pintar(){
		 System.out.println(nombre + " " + edad + " " + dni + " " + casado);
	 }
	  
	 
	 
	 
}
