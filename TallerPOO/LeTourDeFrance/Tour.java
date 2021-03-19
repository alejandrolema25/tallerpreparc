package TallerPOO.LeTourDeFrance;

import java.util.List;

public class Tour {

    List<Corredor> top10;
    List<Etapa> resultadoEtapa;
    List<Equipo> mostrarEquipo;
    List<Equipo> mostrarTotalEquipos;
    public static byte numMaxEquipo= 7;


    public Tour() {
    }

    public List<Corredor> getTop10() {
        return top10;
    }

    public void setTop10(List<Corredor> top10) {
        this.top10 = top10;
    }

    public List<Etapa> getResultadoEtapa() {
        return resultadoEtapa;
    }

    public void setResultadoEtapa(List<Etapa> resultadoEtapa) {
        this.resultadoEtapa = resultadoEtapa;
    }

    public List<Equipo> getMostrarEquipo() {


        return mostrarEquipo;
    }

    public void setMostrarEquipo(List<Equipo> mostrarEquipo) {
        this.mostrarEquipo = mostrarEquipo;
    }

    public List<Equipo> getMostrarTotalEquipos() {
        return mostrarTotalEquipos;
    }

    public void setMostrarTotalEquipos(List<Equipo> mostrarTotalEquipos) {
        this.mostrarTotalEquipos = mostrarTotalEquipos;
    }
    public Equipo(String nombreEquipo) {
        if (numMaxEquipos <= 5){

            this.nombreEquipo = nombreEquipo;
            corredores = new ArrayList<>();

            numMaxEquipos += 1;

        }else{

        }
        int numero;
        ArrayList numeros = new ArrayList();
        ArrayList camisas = new ArrayList();
        for (int i = 1; i <= 5; i++) {
            numero = (int) (Math.random() * 7 + 1);
            if (numeros.contains(numero)) {
                i--;
            } else {
                numeros.add(numero);
            }
        }
        camisas.stream().filtar(Corredor->corredor.getcamisa()).map(corredor->getMostrarEquipo())

        System.out.println("Los ganadores son por numero de camisa:");
        for (Integer n : numeros) {
            System.out.println(n + "");
        }

    }
    public List<Corredor> getCorredores() {
        if (numIntegrantes < 7) {

            this.corredores = corredores;

            numIntegrantes += 1;
        } else {
            System.out.println("El equipo " + getNombreEquipo() + " Ya cuenta con el número máximo de integrantes.");
        }

        return corredores;
    }



}
