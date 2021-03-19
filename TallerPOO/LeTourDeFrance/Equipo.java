package TallerPOO.LeTourDeFrance;

import java.util.List;

public class Equipo {

    private String nombreEquipo;
    private List<Corredor> corredores;
    private List<Equipo> Equipos;
    private static byte numIntegrantes =0;
    public static byte numMaxEquipos = 0;





    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }




    public void setCorredores(List<Corredor> corredores) {
        if (numIntegrantes < 7){
            this.corredores = corredores;

            numIntegrantes += 1;
        }else{
            System.out.println("El equipo "+ getNombreEquipo() +" Ya cuenta con el número máximo de integrantes.");
        }


    }

    public static byte getNumIntegrantes() {
        return numIntegrantes;
    }

    public static void setNumIntegrantes(byte numIntegrantes) {
        Equipo.numIntegrantes = numIntegrantes;
    }
}
