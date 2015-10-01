/**
 * Muestra por pantalla el Horario de clase en colores. 
 *
 * @author Moisés Rodríguez Naranjo
 */

public class Ej5horarioscolor { 
	public static void main(String[] args) { 

		String rojo = "\033[31m";	
		String color2 = "\033[32m";	
		String color3 = "\033[33m";	
		String color4 = "\033[34m";	
		String color5 = "\033[35m";	
		String color6 = "\033[36m";	
		String color7 = "\033[37m";	
		String color8 = "\033[30m";	

		System.out.println(color7 + "    HORA" +" \t LUNES  "+"  MARTES  "+"  MIERCOLES  "+"  JUEVES  "+"  Viernes");
		System.out.println(color7 +"  08:15 – 09:15 "+ rojo +" FOL  "+ color2 +"    PROG   "+ color3 +"   SIN     "+ color4 +"     PROG   "+ color6 +"   BBDD");
		System.out.println(color7 +"  09:15 – 10:15 "+ rojo +" FOL  "+ color2 +"    PROG   "+ color3 +"   SIN     "+ color4 +"     PROG   "+ color6 +"   BBDD");
		System.out.println(color7 +"  10:15 – 11:15 "+ rojo +" FOL  "+ color2 +"    PROG   "+ color3 +"   SIN     "+ color4 +"     PROG   "+ color6 +"   BBDD");
		System.out.println(color7 +"  11:15 – 11:45 "+ color5 +" R    "+"    E      "+"   C    "+"   R  "+"      E       "+" O ");
		System.out.println(color7 +"  11:45 – 12:40 "+ color2 +" PROG  "+ color6 +"   BBDD   "+ color3 +"   SIN     "+ color7 +"     ED     "+ color4 +"   PROG");
		System.out.println(color7 +"  12:40 – 13:35 "+ color7 +" ED   "+ color6 +"    BBDD   "+ color8 +"   LM      "+"     LM     "+ color3 +"   SIN");
		System.out.println(color7 +"  13:35 – 14:30 "+ color7 +" ED   "+ color6 +"    BBDD   "+ color8 +"   LM      "+"     LM     "+ color3 +"   SIN");

		
	}
}
 
