
package gestordeclientesgimnasio;

import Crud.ClienteCrud;
import Vistas.VentanaPrincipal;

/**
 *
 * @author HP
 */
public class Principal {
    static public ClienteCrud clienteCrud =  new ClienteCrud();

    public static void main(String[] args) {
       
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setExtendedState(VentanaPrincipal.MAXIMIZED_BOTH);
        ventana.setVisible(true);
    }
}
