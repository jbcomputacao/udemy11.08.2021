import java.util.Scanner;

public class estruturaCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Digite a Hora: ");
		hora = sc.nextInt();
		
		if ((hora>=1)&&(hora<12)){
			
		System.out.println("Bom dia");
		
		}else if ((hora>=12)&&(hora<18)){		
		
		System.out.println("Bom tarde");
		
		}else
		{
		System.out.println("Boa Noite");
		}
		sc.close();
	}
	
}
