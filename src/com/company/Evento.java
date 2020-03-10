package com.company;

import java.util.ArrayList;

public class Evento {

  private ArrayList<Explotable> listaDeExplotables;
  private ArrayList<Invitado> listaDeInvitados;

  public Evento() {
    this.listaDeExplotables = new ArrayList<Explotable>();
    this.listaDeInvitados = new ArrayList<Invitado>();
  }

  public void añadirInvitados(Invitado unInvitado){
    this.listaDeInvitados.add(unInvitado);
  }

  public void echarInvitados(Invitado unInvitado){
    this.listaDeInvitados.remove(unInvitado);
  }

  public void añadirExplosivo(Explotable unExplotable){
    this.listaDeExplotables.add(unExplotable);
  }

  public void quitarExplosivo(Explotable unExplotable){
   this.listaDeExplotables.remove(unExplotable);
  }

  public void encenderVelas(){
    repartirTorta();
    explotarFuegos();
  }

  private void repartirTorta(){
    for (Invitado invitado : listaDeInvitados) {
      invitado.comerTorta();
    }
  }

  private void explotarFuegos(){
    for (Explotable explotable : listaDeExplotables) {
      explotable.explotar();
    }
  }

}
