/**
 * 
 */

/**
 * @author akram
 *
 */

import javax.swing.JOptionPane;
public class Controller {
	private static Vista view = new Vista();
	double num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero (De un digito)"));
	double num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero (De un digito)"));
	double num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero (De un digito)"));
	String signo1 = JOptionPane.showInputDialog("Escoga el primer signo (+, -, *, /)");
	String signo2 = JOptionPane.showInputDialog("Escoga el segundo signo (+, -, *, /)");
	public void Program(){
        start();
    }
    
    private void start(){
    	view.welcome_Message();
    	
    	if (signo1.contains("+")){
    		String ecuacion = (num1  + " " +num2 + " " + signo1+ " "+ num3 +" " + signo2);
    		System.out.println("Su ecuacion posfix es la siguiente: " + ecuacion);
    		String ecuacionInfix = (num1 + signo1 + num2 + signo2 + num3);
    		System.out.println("Su ecuacion infix es la siguiente: " + ecuacionInfix);
    		suma();
    	}else if(signo1.contains("-")) {
    		String ecuacion = (num1  + " " +num2 + " " + signo1+ " "+ num3 +" " + signo2).toString();
    		System.out.println("Su ecuacion posfix es la siguiente: " + ecuacion);
    		String ecuacionInfix = (num1 + signo1 + num2 + signo2 + num3);
    		System.out.println("Su ecuacion infix es la siguiente: " + ecuacionInfix);
    		resta();
    	}else if(signo1.contains("*")) {
    		String ecuacion = (num1  + " " +num2 + " " + signo1+ " "+ num3 +" " + signo2).toString();
    		System.out.println("Su ecuacion posfix es la siguiente: " + ecuacion);
    		String ecuacionInfix = (num1 + signo1 + num2 + signo2 + num3);
    		System.out.println("Su ecuacion infix es la siguiente: " + ecuacionInfix);
    		multiplicacion();
    	}else if(signo1.contains("/")){
    		String ecuacion = (num1  + " " +num2 + " " + signo1+ " "+ num3 +" " + signo2).toString();
    		System.out.println("Su ecuacion posfix es la siguiente: " + ecuacion);
    		String ecuacionInfix = (num1 + signo1 + num2 + signo2 + num3);
    		System.out.println("Su ecuacion infix es la siguiente: " + ecuacionInfix);
    		division();
    	}
  }

    
    public void suma() {
    	if(signo2.contains("-")){
    		double resultado = (num1 + num2 - num3);
    		System.out.println("El resultado de la ecuacion fue: " + resultado);
    	}else if(signo2.contains("+")) {
    		double resultado = (num1 + num2 + num3);
    		System.out.println("El resultado de la ecuacion fue: " + resultado);
    	}else if(signo2.contains("*")) {
    		double resultado = (num1 + num2 * num3);
    		System.out.println("El resultado de la ecuacion fue: " + resultado);
    	}else if(signo2.contains("/")) {
    		double resultado = (num1 + num2 / num3);
    		System.out.println("El resultado de la ecuacion fue: " + resultado);
    	}
    	
 }
    
    public void resta() {
    	if(signo2.contains("-")){
    		double resultado = (num1 - num2 - num3);
    		System.out.println("El resultado de la ecuacion fue: " + resultado);
    	}else if(signo2.contains("+")) {
    		double resultado = (num1 - num2 + num3);
    		System.out.println("El resultado de la ecuacion fue: " + resultado);
    	}else if(signo2.contains("*")) {
    		double resultado = (num1 - num2 * num3);
    		System.out.println("El resultado de la ecuacion fue: " + resultado);
    	}else if(signo2.contains("/")) {
    		double resultado = (num1 - num2 / num3);
    		System.out.println("El resultado de la ecuacion fue: " + resultado);
    	}
    	
    }
    
    public void multiplicacion(){
    	if(signo2.contains("-")){
    		double resultado = (num1 * num2 - num3);
    		System.out.println("El resultado de la ecuacion fue: " + resultado);
    	}else if(signo2.contains("+")) {
    		double resultado = (num1 * num2 + num3);
    		System.out.println("El resultado de la ecuacion fue: " + resultado);
    	}else if(signo2.contains("*")) {
    		double resultado = (num1 * num2 * num3);
    		System.out.println("El resultado de la ecuacion fue: " + resultado);
    	}else if(signo2.contains("/")) {
    		double resultado = (num1 * num2 / num3);
    		System.out.println("El resultado de la ecuacion fue: " + resultado);
    	}
    	
    	
    }
    
    public void division() {
    	if(signo2.contains("-")){
    		double resultado = (num1 / num2 - num3);
    		System.out.println("El resultado de la ecuacion fue: " + resultado);
    	}else if(signo2.contains("+")) {
    		double resultado = (num1 / num2 + num3);
    		System.out.println("El resultado de la ecuacion fue: " + resultado);
    	}else if(signo2.contains("*")) {
    		double resultado = (num1 / num2 * num3);
    		System.out.println("El resultado de la ecuacion fue: " + resultado);
    	}else if(signo2.contains("/")) {
    		double resultado = (num1 / num2 / num3);
    		System.out.println("El resultado de la ecuacion fue: " + resultado);
    	}
    	
    }
}
