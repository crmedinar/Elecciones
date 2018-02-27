/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Ricardo Medina Rojas
 */
public class Partido {
    private String    nombre;
    private String    siglas;
 //   private int         diputados;
    private int votos;
    private int diputados;
    
    
    public Partido(String nombre, String siglas, int votos){
        this.nombre      = nombre;
        this.siglas          = siglas;
        this.votos = votos;
//        this.diputados  = diputados;
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getVotos() {
        return votos;
    }

    public String getSiglas() {
        return siglas;
    }

//    public int getDiputados() {
//        return diputados;
//    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

//    public void setDiputados(int diputados) {
//        this.diputados = diputados;
//    }
        public void setVotos(int votos) {
        this.votos = votos;
    }
    
   
    
}
