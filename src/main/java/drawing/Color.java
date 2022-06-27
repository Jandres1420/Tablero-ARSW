package drawing;

import java.util.*;

public class Color {
    private static Map<String, ArrayList<String>> listaColores;
    private static  Color _instance = new Color();
    public static Color getInstance(){
        return _instance;
    }
    public Color(){
        listaColores = new HashMap<>();
    }

    private void rellenar(){
        listaColores.put("red", new ArrayList<>(Arrays.asList("255", "51", "51")));
        listaColores.put("yellow", new ArrayList<>(Arrays.asList("255", "251", "0")));
        listaColores.put("green", new ArrayList<>(Arrays.asList("50", "255", "0")));
        listaColores.put("cyan", new ArrayList<>(Arrays.asList("0", "255", "251")));
        listaColores.put("blue", new ArrayList<>(Arrays.asList("0", "35", "255")));
    }

    public static Map<String, ArrayList<String>> getListaColores() {
        return listaColores;
    }

    public String getColorR(String key){
        return listaColores.get(key).get(0);
    }

    public String getColorG(String key){
        return listaColores.get(key).get(1);
    }
    public String getColorB(String key){
        return listaColores.get(key).get(2);
    }
    public boolean comprobar(String key){
        boolean flag = false;
        if(listaColores.containsKey(key)) {
            flag = false;
        }else {
            flag = true;
        }
        return flag;
    }
    public static void setListaColores(Map<String, ArrayList<String>> listaColores) {
        Color.listaColores = listaColores;
    }
}
