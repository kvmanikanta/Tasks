package DifferentWaysToCreateAnObject;

import java.lang.reflect.Constructor;

/* To create an object Java provides various ways 
New keyword
New instance
Clone method
De serialization
NewInstance() method */
public class CreatingObjectsdemo implements Cloneable{
	private String name;
	CreatingObjectsdemo()
    {
    }
    public void setName(String name)
    {
        this.name = name;
    }
    @Override
	protected Object clone() throws CloneNotSupportedException
    { 
        return super.clone(); 
    } 
	String s = "Manikanta";

	public static void main(String args[]) {
		//1
		CreatingObjectsdemo a = new CreatingObjectsdemo();
		System.out.println("With new keyword: "+a.s);
		
		//2
//		try {
//			Class<CreatingObjectsdemo> b = Class.forName("CreatingObjectsdemo");
//			CreatingObjectsdemo c = (CreatingObjectsdemo) b.newInstance();
//			System.out.println(c.s);
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (InstantiationException e) {
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			e.printStackTrace();
//		}
	
		//3
		try
		{
			CreatingObjectsdemo b=(CreatingObjectsdemo) a.clone();
			System.out.println("With clone() method: "+b.s);
		}
		catch (CloneNotSupportedException e) 
        { 
            e.printStackTrace(); 
        } 
		
		//4
		 try
	        {
	            Constructor<CreatingObjectsdemo> constructor = CreatingObjectsdemo.class.getDeclaredConstructor();
	            CreatingObjectsdemo r = constructor.newInstance();
	            r.setName("Manikanta");
	            System.out.println("With newInstance() method of Constructor class: "+r.name);
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
		
	}
}
