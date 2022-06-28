package drawing;

import java.util.*;

public class Color {
    private static ArrayList<String> rgb;
    private static  Color _instance = new Color();
    public static Color getInstance(){
        return _instance;
    }
    public Color(){ 
        rgb = new ArrayList<>();
        colorRandom();
    }
    public void colorRandom(){
        rgb.add("darkblue");
        rgb.add("blueviolet");
        rgb.add("chartreuse");
        rgb.add("darkgreen");
        rgb.add("dodgerblue");
        rgb.add("orange");
        rgb.add("orchid");
    } 

    public String colorX(){
        String cadena = "";
        for(int i = 0 ; i<rgb.size();i++){
            Random random = new Random();
            int numeroRandom = random.nextInt(rgb.size());
            cadena = rgb.get(numeroRandom);
        }
        return cadena;
    }

}
