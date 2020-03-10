package com.company;

public class InvitadoDH extends Invitado {

  public InvitadoDH(String nombre) {
    super(nombre);
  }

  @Override
  public void comerTorta() {
    System.out.println("ñam ñam");
    gritar();
  }

  private void gritar(){
    System.out.println("Viva la Chiqui!!");
  }
}
