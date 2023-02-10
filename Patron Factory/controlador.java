import javax.swing.JOptionPane;

public class controlador {

vista view = new vista();
dispositivos electronics = new dispositivos();

    public void startApp(){
    int opcion = 0;
    
    while(opcion != 9){
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Escoga un numero del 1-10 \nSi desea salir apache 9"));
        if (opcion ==1){
            electronics.iphone14();

        }else if (opcion == 2){
            electronics.laptop();

        }else if(opcion ==3){

        }else if (opcion ==4){

        }else if (opcion ==5){

        }else if (opcion ==6){

        }else if (opcion ==7){

        }else if (opcion ==8){

        }else if (opcion ==9 ){

        }else{
            System.out.println("Escoga una opcion valida");
        }

       }
    }   
}