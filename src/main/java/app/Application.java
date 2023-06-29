package app;

import app.front.swing.carregamento.CarregamentoInicial;
import java.io.FileNotFoundException;

/**
 *
 * @author gustavo.felix
 */
public class Application {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        new CarregamentoInicial().setVisible(true);
        
    }
    
}
