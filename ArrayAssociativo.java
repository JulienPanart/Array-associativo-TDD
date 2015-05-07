
import java.util.*;

public class ArrayAssociativo
{

	public HashMap<String, String> arrayassocia;

	public  ArrayAssociativo () 
	{
		arrayassocia = new HashMap<String, String>();	
	}

	public void put(String clave, String valor) 
	{	 
		arrayassocia.put(clave, valor);
	}

	public String get(String clave) 
	{
		String valor ="";
		
		for(int i =0; i<arrayassocia.size(); i++)
		{
			try
			{
				valor = arrayassocia.get(clave).toString();
				break;
			}
			
			catch(Exception e)
			{
				valor = "Esception!!!";
				break;
			}	
		}
				
		return valor;	

	}

	public String getOrElse(String clave, String valorPorDefecto) 
	{
		String valor ="";
		
		for(int i =0; i<arrayassocia.size(); i++)
		{
						
			if(arrayassocia.containsKey(clave))
			{
				valor = arrayassocia.get(clave).toString();
				break;
			}
			else
			{
				valor = valorPorDefecto;
				break;
			}
		}			
		return valor;	
	}

	public Boolean containsKey(String clave) 
	{
		Boolean valor =null;
		
		for(int i =0; i<arrayassocia.size(); i++)
		{
			if(arrayassocia.containsKey(clave))
			{
				valor = true;
				break;
			}
			else
			{
				valor = false;
				break;
			}		
		}

		return valor;
	}

	public Boolean remove(String clave) 
	{	
		Boolean valor =null;
		
		for(int i =0; i<arrayassocia.size(); i++)
		{
			if(arrayassocia.containsKey(clave))
			{
				arrayassocia.remove(clave);
				valor = true;
				break;
			}
			else
			{
				valor = false;
				break;
			}		
		}		
		return valor;

	}


	public int size() 
	{
		int valor = arrayassocia.size();
		return valor;
	}
}
