
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
public class Eleccion extends Partido {

    ArrayList<Partido> partido = new ArrayList<Partido>();
    int diputadosTotales;

    public Eleccion(int diputadosTotales, int votos, String nombre, String siglas) {
        super(nombre, siglas, votos);
        this.diputadosTotales = diputadosTotales;
        partido.add(this);

    }

    public void agregarPartido(String nombre, String siglas, int votos) {
        Partido partido = new Partido(nombre, siglas, votos);
        System.out.println("Partido " + " " + partido.getNombre() + " " + "ha sido creado");

    }

    public void eliminarPartido(String nombre) {
        partido.forEach(element -> {
            if (nombre.equals(element.getNombre())) {
                partido.remove(element);
            }
        });

    }
        public void populatePartido() {
        partido.forEach(element -> {
            System.out.println(element.getNombre());
            
        });

    }

}
