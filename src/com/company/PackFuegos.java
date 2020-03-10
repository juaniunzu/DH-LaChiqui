package com.company;

import java.util.ArrayList;

public class PackFuegos implements Explotable {

  private ArrayList<Explotable> listaExplotable;

  public PackFuegos() {
    this.listaExplotable = new ArrayList<Explotable>();
  }

  public void agregarExplotable(Explotable unExplotable){
    this.listaExplotable.add(unExplotable);
  }

  public void quitarExplotable(Explotable unExplotable){
    this.listaExplotable.remove(unExplotable);
  }

  public ArrayList<Explotable> getListaExplotable() {
    return listaExplotable;
  }

  @Override
  public void explotar() {
    for (Explotable explotable : listaExplotable) {
      explotable.explotar();
    }
    listaExplotable.clear();
  }
}
