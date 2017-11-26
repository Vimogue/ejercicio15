

public class PruebaPersonas {

	public static void main(String[] args) {
		
		
		Persona2 per1, per2;
		Empleado emp1, emp2, emp3, emp4, usurpadordni;
		
		per1= new Persona2();
		per2= new Persona2("Antonio", (byte)36,'h', "54365719-r", false);
		
		emp1= new Empleado();
		emp2= new Empleado("Sec.3-num.18", (float)1346.27, "Becario");
		emp3= new Empleado("Ramón", (byte)19, 'h', "63922415-l", true);
		emp4= new Empleado("Olga", (byte) 22, 'm', "02465379-z", false, "Sec.5-num.3", (float) 1346.27, "Jefecillo");
		usurpadordni= new Empleado ("Usurpador", (byte) 55, 'h', "54365719-r", false);
		
		System.out.println(per1.toString());
		per1.pintar();
		
		System.out.println(per2.toString());
		per2.pintar();
		
		System.out.println(emp1.toString());
		emp1.pintar();
		
		System.out.println(emp2.toString());
		emp2.pintar();
		
		System.out.println(emp3.toString());
		emp3.pintar();
		
		System.out.println(emp4.toString());
		emp4.pintar();
		
		System.out.println(per1.equals(per2));
		System.out.println(per1.equals(emp2));
		System.out.println(emp3.equals(emp4));
		System.out.println(emp4.equals(per2));
		System.out.println(usurpadordni.equals(per2));
		System.out.println(usurpadordni.equals(emp1));
		
		System.out.println("esto es para probar la fusión de ramas del ejercicio de git");
		
	}
	
	

}
