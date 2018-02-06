
public class Taller3
{
   //Ejercicio 1	
	
   public static void torresDeHannoi(int n) {
		torresDeHannoiAux(n, 1, 2, 3);
   }
	
   private static void torresDeHannoiAux(int n, int origen, int intermedio, int destino) {
	if(n==1){
	    System.out.println("Mover disco " + origen + "a" + destino);
	   }
	   else {
	   torresDeHannoiAux(n -1, origen, destino,intermedio);
	   System.out.println("Mover disco " + origen + "a" + destino);
	   torresDeHannoiAux(n -1, intermedio,origen,destino);
        }
    }

   //Ejercicio 2
   public static void combinations(String s) { 
		combinationsAux("", s); 
		}
   private static void combinationsAux(String prefix, String s) {  
	if(s.length() == 1){
	System.out.println(s);
	   }
	    
   }
   
}
