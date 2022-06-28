package drawing;

import java.util.ArrayList;

public class Usuarios {
    private ArrayList<String> listaUsuarios;
    private static  Usuarios _instance = new Usuarios();
    
    public static Usuarios getInstance(){
        return _instance;
    }
    public Usuarios(){
        Color.getInstance();
        listaUsuarios = new ArrayList<>();
    }

    /**
     * @return ArrayList<String> return the listaUsuarios
     */
    public ArrayList<String> getListaUsuarios() {
        return listaUsuarios;
    }

    /**
     * @param listaUsuarios the listaUsuarios to set
     */
    public void setListaUsuarios(ArrayList<String> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public void setUsuario(String usuario) {
        if(!(listaUsuarios.contains(usuario))){
            listaUsuarios.add(usuario);

        }
    }

    public String posicionColor(String usuario){
        int cont = 0;
        String cadena = "";
        for(String j: listaUsuarios){
            if(listaUsuarios.get(cont).equals(usuario)){
               cadena = Color.getInstance().colorX();
            }
            cont++;
        }
        System.out.println("EL COLOR RETORNADO ES : " + cadena);
        return cadena;
    }

}
