/**
 * @author : Elian Gavilanes
 * @version : 1.0
 */
public class App {
    public static void main(String[] args) throws Exception {
        for (int x = 0; x <=100; x++) {
            Utilitario.ProgressBar.showProgressBar_e(x, 100);
        }
    }
    /**
     * Un Issue se puede encontar en el uso de los for
     * ya que el programa funciona sin embargo presenta errores
     */
}
