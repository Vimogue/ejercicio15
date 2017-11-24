public class Empleado extends Persona2{
		
		private String idpersonal;
		private float sueldo;
		
		public Empleado() {   //Constructor vacio.
			super();
			idpersonal= "no definido";
			sueldo=0;
		}
		
		public Empleado(String idpersonal, float sueldo) {//Constructor par�metros empleado.
			super();
		}
		
		/*
		 * Constructor par�metros Clase Persona y datos empleados inicializados.
		 */
		public Empleado (String nombre, byte edad, char sexo, String dni, boolean casado) {
			super(nombre, edad, sexo, dni, casado);
			idpersonal= "no definido";
			sueldo=0;
		}
		
		/*
		 * Cosnstructor todos los par�metros y datos.
		 */
		public Empleado (String nombre, byte edad, char sexo, String dni, boolean casado, String idpersonal, float sueldo){
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
		
		/*
		 * Sobreescribimos el m�todo "toStrig" para que muestre todos los atributos Empleado y heredados de persona.
		 */
		 /*
		  * (non-Javadoc)
		  * @see Persona2#toString()
		  */
		 @Override
		public String toString() {
			return super.toString() + idpersonal + sueldo;
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
			 System.out.println(getNombre()+ " " + getEdad() + " " + getSexo() + " " + getDni() + " " + getCasado() + " " + idpersonal + " " + sueldo);
		 }


}
