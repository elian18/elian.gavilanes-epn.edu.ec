package Utilitario;

import java.io.IOException;

public class ProgressBar {
    /**
     * [oooooo\     ]53%  rotate
     * @param porcentaje
     * @param delay
     * @throws InterruptedException
     * @throws IOException
     */

    public static void showProgressBar_e(int porcentaje,int delay) throws InterruptedException, IOException {
        String sb = new String();
        String str = new String();
        String name = "elian.gavilanes@epn.edu.ec";
        sb = "\r [";
        int nroCaracteres = porcentaje*name.length()/100;
        for (int i = 0; i < name.length(); i++) {
            sb += String.format("%s", ((nroCaracteres < i) ? " " : "o"));
            System.out.printf("%s%d%s%d", "Loading: ", i, " de ", 26);
            str += String.format("%s", name.charAt(i));
            System.out.println(str);
        }
        sb += "]";
        System.out.print(CMD.RED + "");
            System.out.write(sb.getBytes());
            System.out.printf(" %d %%", porcentaje);
            Thread.sleep(delay);
    }
    
}