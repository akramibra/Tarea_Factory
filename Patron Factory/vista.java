import javax.swing.JOptionPane;

public class vista {

    public void mensajeBienvenida(){
        System.out.println("Bienvenidos a la tienda de apple, gracias por escoger esa tienda. ");
    }

    public int notAnOption(int amoutOptions) {
        boolean next_step = false;
        int selection = 0;
        do {
            try {
                selection = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una de las opciones"));
                if (selection < 0 || selection > amoutOptions) {
                    System.err.println("DEBE INGRESAR UNA OPCION VALIDA");
                } else {
                    next_step = true;
                }
            } catch (NumberFormatException e) {
                System.err.println("INGRESE UN VALOR NUMERICO");
            }
        } while (!next_step);
        return selection;
    }
    
}
