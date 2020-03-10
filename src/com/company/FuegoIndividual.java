package com.company;

public class FuegoIndividual implements Explotable {

  private String ruido;

  public FuegoIndividual(String ruido) {
    this.ruido = ruido;
  }

  @Override
  public void explotar() {
    System.out.println(ruido);
  }

  public String getRuido() {
    return ruido;
  }
}
