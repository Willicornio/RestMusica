package edu.upc.dsa.models;


import edu.upc.dsa.util.RandomUtils;

import java.util.LinkedList;
import java.util.List;

public class Album {

    String id;
    private List<Track> ListaTracks;
    String autor;
    static int lastId;
    String nombre;


    public Album() {
        this.id = RandomUtils.getId();
    }

    public Album(String nombre, String autor, LinkedList<Track> e) {
        this();
        this.setAutor(autor);
        this.setAutor(nombre);
        List<Track> ListaTracks = new LinkedList<>();
        this.ListaTracks= e;


    }

    public void setListaTracks(LinkedList<Track> e) {
        this.e = e;
    }


    public void setId(String id) {
        this.id=id;
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String title) {
        this.autor = title;
    }

    public LinkedList<Track> getTracks() {
        return e;
    }

    public void setTracks(LinkedList<Track> e) {



    }

    @Override
    public String toString() {
        return "Track [id="+id+", nombre=" + nombre + ", autor=" + autor +"]";
    }

}