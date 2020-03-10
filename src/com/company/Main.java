package com.company;

public class Main {

    public static void main(String[] args) {
	      FuegoIndividual unCuete = new FuegoIndividual("bang");
        FuegoIndividual unNuevoCuete = new FuegoIndividual("ping");
        FuegoIndividual unLindoCuete = new FuegoIndividual("pum");
        FuegoIndividual unHermosoCuete = new FuegoIndividual("recontra bum");
        FuegoIndividual unTerribleCuete = new FuegoIndividual("kablum");

        PackFuegos unPaquete = new PackFuegos();
        unPaquete.agregarExplotable(unCuete);
        unPaquete.agregarExplotable(unNuevoCuete);

        InvitadoStandard unRandom = new InvitadoStandard("pepe");
        InvitadoStandard otroRandom = new InvitadoStandard("richar");
        InvitadoStandard nuevoRandom = new InvitadoStandard("jojo");
        InvitadoDH edu = new InvitadoDH("edu");
        InvitadoDH lopi = new InvitadoDH("lopi");
        InvitadoDH juan = new InvitadoDH("juan");

        Evento cumpleChiqui = new Evento();

        cumpleChiqui.añadirExplosivo(unPaquete);
        cumpleChiqui.añadirExplosivo(unLindoCuete);
        cumpleChiqui.añadirExplosivo(unHermosoCuete);
        cumpleChiqui.añadirExplosivo(unTerribleCuete);

        cumpleChiqui.añadirInvitados(unRandom);
        cumpleChiqui.añadirInvitados(otroRandom);
        cumpleChiqui.añadirInvitados(nuevoRandom);
        cumpleChiqui.añadirInvitados(edu);
        cumpleChiqui.añadirInvitados(lopi);
        cumpleChiqui.añadirInvitados(juan);

        cumpleChiqui.encenderVelas();


    }
}
