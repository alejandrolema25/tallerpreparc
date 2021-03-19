package TallerPOO.LeTourDeFrance.AppTour;

import TallerPOO.LeTourDeFrance.Corredor;
import TallerPOO.LeTourDeFrance.Equipo;
import TallerPOO.LeTourDeFrance.Tour;

import java.util.ArrayList;
import java.util.Arrays;

public class AppTour {

    public static void main(String[] args) {
        //Instancia Tour
        Tour tour= new Tour();

        //Instancia corredores
        Corredor Peter = new Corredor("Peter Sagan",(byte) 25,(byte) 1,"USA");
        Corredor Egan = new Corredor("Egan Bernal",(byte) 23,(byte) 2,"Colombia");
        Corredor Nairo = new Corredor("Nairo Quintana",(byte) 22,(byte) 3,"Colombia");
        Corredor Chavez = new Corredor("Esteban Chavez",(byte) 21,(byte) 4,"Colombia");
        Corredor Froome = new Corredor("Froome",(byte) 25,(byte) 19,"USA");
        Corredor Rigo = new Corredor("Rigoberto Urán",(byte) 20,(byte) 6,"Colombia");
        Corredor FaustoCoppi = new Corredor("Fausto Coppi",(byte) 28,(byte) 7,"Italia");
        Corredor ErikZabel = new Corredor("Erik Zabel",(byte) 29,(byte) 8,"Alemania");
        Corredor WalterGodefroot = new Corredor("Walter Godefroot",(byte) 33,(byte) 9,"Holanda");
        Corredor BernardHinault = new Corredor("Bernard Hinault",(byte) 34,(byte) 10,"Francia");
        Corredor MiguelIndurain = new Corredor("Miguel Indurain",(byte) 22,(byte) 11,"España");
        Corredor GregLeMond = new Corredor("Greg LeMond",(byte) 25,(byte) 12,"USA");
        Corredor JoopZoetemelk = new Corredor("Joop Zoetemelk",(byte) 21,(byte) 13,"Países Bajos");
        Corredor FrançoisFaber = new Corredor("François Faber",(byte) 22,(byte) 14,"Alemania");
        Corredor TonyRominger = new Corredor("Tony Rominger",(byte) 26,(byte) 15,"Suiza");
        Corredor MarkCavendish = new Corredor("Mark Cavendish",(byte) 27,(byte) 16,"Londres");
        Corredor GinoBartali = new Corredor("Gino Bartali",(byte) 38,(byte) 17,"Italia");
        Corredor FrancescoMoser = new Corredor("Francesco Moser",(byte) 39,(byte) 18,"Italia");
        Corredor JanRaas = new Corredor("Jan Raas",(byte) 29,(byte) 19,"Países Bajos");
        Corredor FerdiKübler = new Corredor("Ferdi Kübler",(byte) 30,(byte) 20,"Suiza");
        Corredor NicolasFrantz = new Corredor("Nicolas Frantz",(byte) 31,(byte) 21,"Luxemburgo");
        Corredor ChristopherFroome = new Corredor("Christopher Froome",(byte) 23,(byte) 22,"Kenia / Gran Bretaña");
        Corredor AlejandroValverde = new Corredor("Alejandro Valverde",(byte) 18,(byte) 23,"España");
        Corredor SeanKelly = new Corredor("Sean Kelly",(byte) 27,(byte) 24,"Irlanda");
        Corredor JacquesAnquetil = new Corredor("Jacques Anquetil",(byte) 22,(byte) 25,"Francia");
        Corredor JanUllrich = new Corredor("Jan Ullrich",(byte) 20,(byte) 26,"Alemania");
        Corredor Markavendish = new Corredor("Mark Cavendish",(byte) 21,(byte) 27,"Gran Bretaña");
        Corredor AlfredoBinda = new Corredor("Alfredo Binda",(byte) 33,(byte) 28,"Italia");
        Corredor AlexZülle = new Corredor(" Alex Zülle",(byte) 36,(byte) 29,"Suiza");
        Corredor CadelEvans = new Corredor("Cadel Evans",(byte) 37,(byte) 30,"Australia");
        Corredor GianniMotta = new Corredor("Gianni Motta",(byte) 38,(byte) 31,"Italia");
        Corredor EddyMerckx = new Corredor("Eddy Merckx",(byte) 40,(byte) 32,"Belgica");
        Corredor FransVerbeeck = new Corredor("Frans Verbeeck",(byte) 23,(byte) 33,"Londres");
        Corredor CharlyGaul = new Corredor("Charly Gaul",(byte) 21,(byte) 34,"Luxemburgo");
        Corredor DamianoCunego = new Corredor("Damiano Cunego",(byte) 26,(byte) 35,"Italia");


        //Instancia Equipos.
        Equipo Ineos = new Equipo("Ineos Granadiers");
        Equipo Arkea = new Equipo("Arkea Samsic");
        Equipo Astana = new Equipo("Astana Pro Team");
        Equipo Movistar = new Equipo("Movistar Team");
        Equipo UAE = new Equipo("UAE Team Emirates");

        Ineos.getCorredores().add(Egan);
        Ineos.getCorredores().add(Peter);
        Ineos.getCorredores().add(Nairo);
        Ineos.getCorredores().add(Chavez);
        Ineos.getCorredores().add(Froome);
        Ineos.getCorredores().add(Rigo);
        Ineos.getCorredores().add(FaustoCoppi);
        Arkea.getCorredores().add(BernardHinault);
        Arkea.getCorredores().add(CharlyGaul);
        Arkea.getCorredores().add(FransVerbeeck);
        Arkea.getCorredores().add(EddyMerckx);
        Arkea.getCorredores().add(GianniMotta);
        Arkea.getCorredores().add(CadeEvans );
        Astana.getCorredores().add(ErikZabel);
        Astana.getCorredores().add(BernardHinault);
        Astana.getCorredores().add(GregLeMond);
        Astana.getCorredores().add(JoopZoetemelk);
        Astana.getCorredores().add(FrançoisFaber );
        Astana.getCorredores().add(TonyRominger);
        Astana.getCorredores().add(MarkCavendish);
        Movistar.getCorredores().add(WalterGodefroot);
        Movistar.getCorredores().add(GinoBartali);
        Movistar.getCorredores().add(MiguelIndurain);
        Movistar.getCorredores().add(FrancescoMoser);
        Movistar.getCorredores().add(JanRaas);
        Movistar.getCorredores().add(Markavendish );
        Movistar.getCorredores().add(AlexZülle);
        UAE.getCorredores().add(JanUllrich);
        UAE.getCorredores().add(SeanKelly);
        UAE.getCorredores().add(AlejandroValverde);
        UAE.getCorredores().add(ChristopherFroome);
        UAE.getCorredores().add(NicolasFrantz);
        UAE.getCorredores().add(FerdiKübler);
        UAE.getCorredores().add(DamianoCunego);




        System.out.println("Los equipos que correrán el tour son:  ");
        ArrayList<Equipo> Equipos = new ArrayList<Equipo>(Arrays.asList(Ineos,Arkea,Astana,Movistar,UAE,Prueba,Prueba1));
        Equipos.forEach(numEquipos -> System.out.println(numEquipos.getNombreEquipo()));
        System.out.println("");


        System.out.println("Los corredores del equipo Ineos son:  ");
        Ineos.getCorredores().forEach(Corredor -> System.out.println(Corredor.getNombre()));




    }

}
