public class Empleado extends Persona2{
		
		private String idpersonal;
		private float sueldo;
		private String categoria;
		
		public Empleado() {   //Constructor vacio.
			super();
			idpersonal= "no definido";
			sueldo=0;
			categoria= "no definido";
		}
		
		public Empleado(String idpersonal, float sueldo, String categoria) {//Constructor par�metros empleado.
			super();
		}
		
		/*
		 * Constructor par�metros Clase Persona y datos empleados inicializados.
		 */
		public Empleado (String nombre, byte edad, char sexo, String dni, boolean casado) {
			super(nombre, edad, sexo, dni, casado);
			idpersonal= "no definido";
			sueldo=0;
			categor�a= "no definido";
		}
		
		/*
		 * Cosnstructor todos los par�metros y datos.
		 */
		public Empleado (String nombre, byte edad, char sexo, String dni, boolean casado, String idpersonal, float sueldo, String categoria){
			super(nombre, edad, sexo, dni, casado);
		}
		
		/*
		 * Metodos "set" y "get" para los par�metros exclusivos de Empleado.
		 */
		public void setIdpersonal(String idpersonal){
			this.idpersonal=idpersonal;
		}
		
		public String getIdpersonal(){
			return idpersonal;
		}
		
		public void setSueldo(float sueldo){
			this.sueldo= sueldo;
		}
		
		public float getSueldo(){
			return sueldo;
		}
		public void setCategoria(String categoria){
			this.categoria= categoria;
		}
		public void getCategoria(){
			return categoria;
		}
		
		/*
		 * Sobreescribimos el m�todo "toStrig" para que muestre todos los atributos Empleado y heredados de persona.
		 */
		 /*
		  * (non-Javadoc)
		  * @see Persona2#toString()
		  */
		 @Override
		public String toString() {
			return super.toString() + idpersonal + sueldo + categoria;
		}
		 
		 /*
		  * Sobreescribimos el m�todo "pintar" para que muestre en pantalla todos los atributos Empleado y heredados de persona.
		  */
		 /*
		  * (non-Javadoc)
		  * @see Persona2#pintar()
		  */
		 @Override
		public void pintar(){
			 System.out.println(getNombre()+ " " + getEdad() + " " + getSexo() + " " + getDni() + " " + getCasado() + " " + idpersonal + " " + sueldo + " " + getCategoria);
		 }


}
