package ma.education.tp2.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import ma.education.tp1.introduction.Salle;

public class TestReflection{
	
	public static void main(String[] args) 
			throws InstantiationException,
			IllegalAccessException, IllegalArgumentException,InvocationTargetException {
		
	
			Class s = Salle.class;
					
			
			/* Affichage des nom attributs */
			
			 Field[]  attributes = s.getDeclaredFields();
			 for(Field d : attributes) {
				 	char p  = d.getName().charAt(0); 
				 	if(Character.isLowerCase(p)) {
				 		System.out.println(d.getName() + "Correct");	
				 	}else {
				 		System.out.println(d.getName() + "Error");	
				 	}
			 	}
			 
			 /* Affichage des nom methodes */ 
			 
			 Method[] methods = s.getDeclaredMethods();
			 for (Method meth : methods) {
			 System.out.println(meth.getName());
			 }
			 
			 /* Instanciation des objets par reflection */
			 
			 Salle o1 = null;
			 Salle o2 = null;
			 Salle o3 = null;
			 
			 Constructor[] cons = s.getDeclaredConstructors();
			 
			 for (Constructor c : cons) {
				 
				 int count = c.getParameterCount();
			 
				 switch (count) {
				 		case 0: {
				 					o1 = (Salle) c.newInstance();
				 					break;
				 				}
				 		case 1: {
				 					o2 = (Salle) c.newInstance("Salle Informatique");
					 				break;
				 				}
				 		case 2: {
				 					o3 = (Salle) c.newInstance(2, "Salle des cours");
				 					break;
				 				}
				 	   default: {
				 		   			break;
				 				}
				 }
				 
			 }
			 
			 //Affichage des valeurs des attributs des objets o1,o2 et o3
			 
			 System.out.println(o1.id + " " + o1.nom);
			 System.out.println(o2.id + " " + o2.nom);
			 System.out.println(o3.id + " " + o3.nom);
			 
	}

}
