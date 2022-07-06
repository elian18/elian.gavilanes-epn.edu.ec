package Utilitario;

import java.io.IOException;

public class ProgressBar {

    public static void showProgressBar_e(int porcentaje,int delay) throws InterruptedException, IOException {
        String sb = new String();
        String name = "elian.gavilanes@epn.edu.ec";
        int nroCaracteres = porcentaje*name.length()/100;
        for (int i = 0; i < name.length(); i++) {
            sb = "\r [";
            sb += String.format("%s", ((nroCaracteres < i) ? " " : "o"));
            sb += "]";
            System.out.write(sb.getBytes());
            Thread.sleep(delay);
        }
        for (int i = 0; i < name.length(); i++) {
            System.out.printf("%s%d%s", "Loading: ", i, " de ", 26);
        }

        String str = new String();
        for (int i = 0; i < name.length(); i++) {
            str += String.format("%s", name.charAt(i));
            System.out.println(str);
        }
    }
    
}