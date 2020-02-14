package vista;

import java.util.Scanner;
import java.util.ArrayList;
import modelo.Alumno;

public class Secundaria {
	
	
         
	public static void main(String[] args){
		
		String rut="",nom="",ape="";
		int eda1=0,op=0;
		float not1,not2,not3,not4;
		ArrayList<Alumno> listaPrincipal = new ArrayList<Alumno>();
		Scanner sc = new Scanner(System.in);
		Alumno A;
		
		
			
		do {
			System.out.println("-----BIENVENIDOS AL SISTEMA DE REGISTRO DE ALUMNOS Y NOTAS----");
			
			System.out.println("1.-REGISTRAR ALUMNO");
			System.out.println("2.-INGRESAR NOTAS A ALUMNO REGISTRADO");
			System.out.println("3.-MOSTRAR NOTAS ALUMNO REGISTRADO");
			System.out.println("4.-MOSTRAR TODOS LOS ALUMNOS");
			System.out.println("5.-SALIR");
			System.out.println("INGRESE LA OPCION QUE DESEA ELEGIR:");
			op=sc.nextInt();
		  
			
			switch (op) {
			case 1:
				   
				   sc.nextLine();
				   System.out.println("----------INGRESO DE ALUMNOS----------");
				   do {
					   System.out.print("INGRESE EL RUT DEL ALUMNO :");
				       rut = sc.nextLine();
					   
				   }while(rut.trim().length()==0);
				   
				   
				   if (!verificarAlumno(rut,listaPrincipal)) {
					   
					do {
					System.out.print("INGRESE EL NOMBRE DEL ALUMNO:");
				    nom = sc.nextLine();
					}while(nom.trim().length()==0);   
				     
					
				    do {
				    System.out.print("INGRESE EL APELLIDO DEL ALUMNO:");
				    ape = sc.nextLine();
				    }while(ape.trim().length()==0);	
				    
				    do {
				    System.out.print("INGRESE LA EDAD DEL ALUMNO :");
				    eda1 = sc.nextInt();
				    }while(eda1==0);
				    
				    
				    A = new Alumno(rut,nom,ape,eda1,0,0,0,0);
				    listaPrincipal.add(A);
				    
				    System.out.println("***********************************");
					System.out.println("**ALUMNO REGISTRADO CORRECTAMENTE**");
					System.out.println("***********************************");
					
					
				   }else {
					 
					   System.err.println("El Alumno ya se encuentra Registrado, Compruebe con otro!!");
					 
				 }
				   
				
			   break;
            case 2:
            	
            	
            	if (listaPrincipal.isEmpty() ||listaPrincipal==null) 
            	{
					System.err.println("***NO HAY NINGUN ALUMNO REGISTRADO***");
					
				}else {
					
			    sc.nextLine();
			    System.out.println("---------------------------------------------------------");
        		System.out.println("INGRESE RUT PARA INGRESAR NOTAS :");
        		String dato = sc.nextLine();
        		
					if (verificarAlumno(dato,listaPrincipal)==true) {
						
						for (int i = 0; i < listaPrincipal.size(); i++) {
        			
        			A= listaPrincipal.get(i);
        			
        			if (dato.equalsIgnoreCase(A.getRut())) {
        				
        			  rut = A.getRut();
        			  nom = A.getNom();
        			  ape = A.getApe();
        			  eda1 = A.getEdad();
        			 System.out.println("Alumno :"+A.getNom());
        			 System.out.println("--------------------------");
        		     System.out.println("ingrese la primer nota:");
        		      not1=sc.nextFloat();
        		     System.out.println("ingrese la Segunda nota:");
        		      not2=sc.nextFloat();
        		     System.out.println("ingrese la Tercer nota nota:");
        		      not3=sc.nextFloat();
        		     System.out.println("ingrese la cuarta nota:");
        		      not4=sc.nextFloat();
        		     sc.nextLine();
        		     
        		     A= new Alumno(rut,nom,ape,eda1,not1,not2,not3,not4);
        		     
        		     int pos =obtenerPosicion(rut,listaPrincipal);
        		     listaPrincipal.set(pos,A);
        			 	
        			}
        			
        			
        			
        		     }
						
			   }else {
				   
				   System.err.println("NO SE ENCUNTRA EL ALUMNO,REGISTRELO O COMPRUEBE CON OTRO");
			   }
	
				}
				
            	
			    
					
				
            	break;
            case 3:
            	
            	sc.nextLine();
            	if (listaPrincipal.isEmpty() || listaPrincipal==null)
            	{
            		System.err.println("***NO HAY NINGUN ALUMNO REGISTRADO***");
            		
				}else  
					
				System.out.println("---------------------------------------------------------");
         		System.out.println("INGRESE RUT A BUSCAR :");
         		String dato1 = sc.nextLine();
         		
         		if (verificarAlumno(dato1,listaPrincipal)) {
         			
         			for (int i = 0; i < listaPrincipal.size(); i++) 
         		    {
         			
         			A= listaPrincipal.get(i);
         			
         			  if (dato1.equalsIgnoreCase(A.getRut())) 
         			  {	
         		        System.out.println("Nombre :"+A.getNom());
         			    System.out.println("Apellido :"+A.getApe());
         			    System.out.println("Edad :"+A.getEdad());
         			    System.out.println("Nota1 :"+A.getNota1());		
         			    System.out.println("Nota2 :"+A.getNota2());
         			    System.out.println("Nota3 :"+A.getNota3());
         			    System.out.println("Nota4 :"+A.getNota4());
         			   String est = obtenerEstado(A.getNota1(),A.getNota2(),A.getNota3(),A.getNota4());
           			    if (est.equalsIgnoreCase("REPROBADO")) {
  						System.err.println("Estado:"+est);
  					    }else {
  						System.out.println("Estado:"+est);
  					    }
         			    System.out.println("------------");
         				
         			  }
         			
         			
	
         		    }
					
				}else{
					
					System.err.println("NO SE ENCUNTRA EL ALUMNO, COMPRUEBE CON OTRO");
				}
				
				
            	
            	break;

            case 4:
                 sc.nextLine();
            	if (listaPrincipal.isEmpty() || listaPrincipal==null) {
            		System.err.println("***NO HAY NINGUN ALUMNO REGISTRADO***");
				}else {
            	
            	System.err.println("***ALUMNOS**/");
            	for (int i = 0; i < listaPrincipal.size(); i++) 
         		{
         			A= listaPrincipal.get(i);
         			 System.out.println("****************************");
         		     System.out.println("Nombre :"+A.getNom());
         			 System.out.println("Apellido :"+A.getApe());
         			 System.out.println("Edad :"+A.getEdad());
         			 System.out.println("Nota(1):"+A.getNota1());		
         			 System.out.println("Nota(2):"+A.getNota2());
         			 System.out.println("Nota(3):"+A.getNota3());
         			 System.out.println("Nota(4):"+A.getNota4());
         			 String est = obtenerEstado(A.getNota1(),A.getNota2(),A.getNota3(),A.getNota4());
         			 if (est.equalsIgnoreCase("REPROBADO")) {
						System.err.println("Estado:"+est);
					}else {
						System.out.println("Estado:"+est);
					}
         			 
         			 System.out.println("****************************");
         				
         		}
            	
				}
				break;
				
            case 5:
            	System.out.println("SALIENDOO......");
            	sc.close();
            	break;
			}
			
			
			
			
			
		} while (op>0 && op<5);
		
		
		        System.out.println("**********************************************");
            	System.out.println("***MUCHAS GRACIAS POR OCUPAR LA HERRAMIENTA***");
            	System.out.println("**********************************************");
		
		
		 
		 
		
		
	}
	
	

	private static boolean verificarAlumno(String rut,ArrayList<Alumno> a) {
		boolean existe = false;
		Alumno A;
		
		for (int i = 0; i < a.size(); i++) {
			A=a.get(i);
			
			if (rut.equalsIgnoreCase(A.getRut())) {
			  existe =true;
				
			}
			
			
			
		}
		
		return existe;
		
		
	}



	private static String obtenerEstado(float  n1,float n2 ,float n3, float n4) {
		float prom=0;
		String estado = "";
		
		prom = (n1+n2+n3+n4)/4;
		
		if (prom<4 ) {
			estado ="REPROBADO";
		}else if(prom>=4){
			estado="APROBADO";
			
		}
		
		
		
		return estado;
	}


	/**
     * Este metodo retorna la posicion dentro de un arreglo con el motivo de encontrar la posicion de un
       objeto del tipo Alumno .
	  @param rut,ArrayList<Alumno>
	  @author Gerald Reyes
	  @return Este Metodo retorna un valor int 
	*/
	private static  int obtenerPosicion(String rut,ArrayList<Alumno> a) {
		
		
		for (int j = 0; j < a.size(); j++) {
			Alumno A = a.get(j);
			if (rut.equalsIgnoreCase(A.getRut())) {
				return j;
			}
			
			
		}
	
		return -1;
	}

} 
