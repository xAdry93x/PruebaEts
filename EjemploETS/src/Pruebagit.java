
public class Pruebagit {

	public static void main(String[] args) {
		
		
		//Pruebas de actividad git 
		
		
		public class VecUtil {

			public int buscarMayor(int[] vec) {
				// Desarrollar un método estático llamado int buscarMayor(int[] vec) 
				//que devuelve el elemento mayor de un vector de enteros.

				
				if (vec.length > 0) {
				int mayor = vec[0];
				
				for(int i=1; i<vec.length; i++){
					if (vec[i] > mayor)
						mayor = vec[i];
				}
				return mayor;
				}else
					return 0;
				
			}
		}
	}
}