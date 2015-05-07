import static org.junit.Assert.*;

import org.junit.Test;


public class TestArray {

	private static ArrayAssociativo array = new ArrayAssociativo();
	
	
	
	@Test
	public void insertpares() 
	{	
		//Insercion de nuestros data en el array
		array.put("nombre","luis");
		array.put("appelido","martin");
		array.put("dni","157271959");
		array.put("pais","espana");	
	}
	
	@Test
	public void getValor()
	{		
		//Get la valor de un clave que existe sino ecribimos excepcion!!
		String valor="";
		valor = array.get("nombre");
		System.out.println(valor);
	}
	
	@Test
	public void SilaClaveNoExista()
	{
		//En un caso donde el clave no es corecto pues mandamos le mensaje par default		
		String valor="";
		valor = array.getOrElse("zegvsdg","Impossible de encontrar el clave");
		System.out.println(valor);
	}
	
	@Test
	public void SAberSIExisteONo()
	{		
		//recibimos true porque nombre existe
		Boolean valor=null;
		valor = array.containsKey("nombre");
		System.out.println(valor);
		
		//El codigo siguiente es por la methoda BorraUnPar porque funcionna aqui pero no despues!
		
		/*Boolean valor=null;
		valor = array.remove("nombre");
		System.out.println(valor);	*/
		
	}
	
	@Test
	public void BorraUnPar()
	{
		//No entiendo !! el codigo siguiente no funcionna aqui pero si lo pongo en una otra methoda funcionna.
		//Es como si el array es vacio, porque manda null, es como si no pasa en el for !!
		Boolean valor=null;
		valor = array.remove("nombre");
		System.out.println(valor);		
		
	}
	
	@Test
	public void SaberElNumeroDeEntrada()
	{	
		//Recibimos 4, porque tenemos 4 informacion en nuestro array
		int valor = array.size();
		System.out.println(valor);			
	}
	
	
	

}
