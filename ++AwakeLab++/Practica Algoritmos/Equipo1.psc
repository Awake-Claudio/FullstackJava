subproceso Vestado(h)
	
	
		si h=1
			Escribir "SOLTERO";
			
		SiNo
			si h>=2 y h<=4
				
				Escribir "FAMILIA";
			SiNo
				si h>=5 y h<=7
					
					Escribir "Oficina";
				FinSi
			FinSi
		FinSi

	
FinSubProceso



Algoritmo Problematica
	
	Dimension Casas[10];//vacio
	definir n,x,h como entero;
	n=0;
	x=0;
	h=0;
	
	Repetir
        Escribir "Ingrese la cantidad de habitantes (entre 1-7) de la casa nro ",x+1;
		Leer n;
		
		si n>=1 y n<=7
			
			Casas[x+1]<-n;
			x=x+1;
		SiNo
			Escribir "****Digito mal ingresado****";
			
		FinSi
		
		
		
	Hasta Que x=10
	
	
	Escribir "---------------INFORMACION DE CASAS-------";
	
	Para j<-1 Hasta 10 Con Paso 1 Hacer
		
		h<-Casas[j];
		Escribir "Casa nro (",j,")"; 
		Escribir "Habitantes (",h,")";
		Vestado(h);
		Escribir "----------------------------";
		
		
	Fin Para
	

	



	
FinAlgoritmo
