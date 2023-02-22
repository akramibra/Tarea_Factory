import javax.swing.JOptionPane;

public class Vista {
	public void welcome_Message(){
        System.out.println("---------------------------------");
        System.out.println("Bienvenido a nuestro programa");
        System.out.println("---------------------------------");
    }
	
	public int menu(){
		System.out.println("-------------------------------");
		System.out.println("Escoga la opcion que desea");
		System.out.println("-------------------------------");
		String[] menu = {"Sumar","Restar","Multiplicar","Dividir", "Salir"};
		for(int i=0; i<menu.length;i++){
			System.out.println((i+1) + ". " + menu[i]);
		}return menu.length;
	}
	
	
	public int notAnOption(int amoutOptions){
        boolean next_step = false;
        int selection = 0;
        do{
            try{
                selection = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una de las opciones"));
                if(selection<0 || selection>amoutOptions){
                    System.err.println("DEBE INGRESAR UNA OPCION VALIDA");
                }else{
                    next_step = true;
                }
            }catch(NumberFormatException e){
                System.err.println("INGRESE UN VALOR NUMERICO");
            }
        }while(!next_step);
        return selection;
	}
}
