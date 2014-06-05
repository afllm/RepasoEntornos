package alx.calculo;

public class Calcular {
	private float num1;
	private float num2;
	
	
	public float sumar(float numero1, float numero2){
		this.num1=numero1;
		this.num2=numero2;
		System.out.println("El resultado de la suma es: ");
		return num1+num2;
	}
	
	public float restar(float numero1, float numero2){
		this.num1=numero1;
		this.num2=numero2;
		System.out.println("El resultado de la suma es: ");
		return num1-num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
