package coche;

public class Uso_coche {
	public static void main(String[] args) {
		
				Coche c1 = new Coche();
				
		
				Coche c2 = new Coche ("132312AB",200);
				Coche c3 = new Coche ("3333CC",100,"Rojo",false);
				
				System.out.println(c1.getCombustible());
				System.out.println(c2.getCombustible());
				System.out.println(c3.getCombustible());
				
				boolean pudeRepostar;
				pudeRepostar = c1.repostar(70);
				c2.repostar(70);
				c3.repostar(70);
				
				System.out.println(pudeRepostar);
				
				boolean pudeArrancar;
				
				c1.arrancar();
				pudeArrancar= c2.arrancar();
				c3.arrancar();
				
				
				System.out.println(c1.getCombustible());
				System.out.println(c2.getCombustible());
				System.out.println(c3.getCombustible());
				
				
				
				
				
				
				
				
				
				
				System.out.println(c1.aString());
				System.out.println(c2.aString());
				System.out.println(c3.aString());
			}
		
		
	}
