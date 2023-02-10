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
            electronics.ipad();

        }else if (opcion ==4){
            electronics.appleWatch();

        }else if (opcion ==5){
            electronics.appleTv();

        }else if (opcion ==6){
            electronics.ipod();

        }else if (opcion ==7){
            electronics.iphone3();

        }else if (opcion ==8){

        }else{
            System.out.println("Escoga una opcion valida");
        }

       }
    }   
}