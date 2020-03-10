package com.company;

public abstract class Invitado {

  private String nombre;

  public Invitado(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void comerTorta() {
    System.out.println("ñam ñam");
  }

}
