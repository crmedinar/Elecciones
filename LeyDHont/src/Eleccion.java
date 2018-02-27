
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Carlos Ricardo Medina Rojas
 */
public class Eleccion  {

    static ArrayList<Partido>  partido = new ArrayList<Partido>();
    static int partidosPoliticos;
    static int diputadosTotales;
    

    public Eleccion() {

        this.diputadosTotales = diputadosTotales;

       

    }

    public static void agregarPartido(String nombre, String siglas, int votos) {
        Partido partido = new Partido(nombre, siglas, votos);
        Eleccion.partido.add(partido);
        System.out.println("Partido " + " " + partido.getNombre() + " " + "ha sido creado");
         partidosPoliticos ++;
         System.out.println("Tenemos "+partidosPoliticos+" partido(s) Registrado(s)");

    }
    
    public void asignarDiputadosDhont(){
        
       // Stream str = this.partido.stream().max( a ,  b)->{Integer.compare( (Integer)a.getVotos(),(Integer)b.getVotos())};
        
        
    }

    public void eliminarPartido(String nombre) {
        partido.forEach(element -> {
            if (nombre.equals(element.getNombre())) {
                partido.remove(element);
                partidosPoliticos --;
            }
        });

    }
    public static String getNombrePartido(){
        String nombre="";
        nombre = partido.get(partidosPoliticos).getNombre();
        
        return  nombre;
    }
        public void populatePartido() {
        this.partido.forEach(element -> {
            System.out.println(element.getNombre());
            
        });

    }

}
