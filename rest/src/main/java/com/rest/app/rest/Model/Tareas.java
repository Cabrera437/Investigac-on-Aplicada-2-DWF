package com.rest.app.rest.Model;

import jakarta.persistence.*;

@Entity
@Table(schema = "TareasCrud")


public class Tareas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private  String Titulo;

    @Column
    private  String descripcion;





    public long getId() {
        return id;
    }
    public void setId(long id){
         this.id = id;
    }


public  String getTitulo(){
        return Titulo;
}

    public void setTitulo(String titulo) {
        this.Titulo = Titulo;
    }


    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
