package TallerPOO.LeTourDeFrance;

public class Etapa {

    private short numEtapa;
    private String ganadorEtapa;

    public Etapa(short numEtapa) {

        this.numEtapa = numEtapa;
    }

    public short getNumEtapa() {
        return numEtapa;
    }

    public void setNumEtapa(short numEtapa) {
        this.numEtapa = numEtapa;
    }

    public String getGanadorEtapa() {
        return ganadorEtapa;
    }

    public void setGanadorEtapa(String ganadorEtapa) {
        this.ganadorEtapa = ganadorEtapa;
    }
}
