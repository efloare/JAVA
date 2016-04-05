package sample;

import java.util.Random;

/**
 * Created by Bb on 3/21/2016.
 */
public class RandomString {
    static String firstname = new StringBuilder().append("Adela F-").append("Adelina F-").append("Afina F-").append("Afrodita F-").append("Agapia F-").append("Ariona F-").append("Aglaia F-").append("Agnes F-").append("Alana F-").append("Alda F-").append("Alexandra F-").append("Alexia F-").append("Alice F-").append("Alina F-").append("Alla F-").append("Alma F-").append("Amalia F-").append("Amanda F-").append("Amedeia F-").append("Amelia F-").append("Amelie F-").append("Amina F-").append("Amira F-").append("Amita F-").append("Barbu M-").append("Bodgan M-").append("Calin M-").append("Catalin M-").append("Carol M-").append("Cezar M-").append("Ciprian M-").append("Claudiu M-").append("Constantin M-").append("Cornel M-").append("Cosmin M-").append("Costel M-").append("Costi M-").append("Costin M-").append("Cristian M-").append("Cristinel M-").append("Dan M-").append("Daniel M-").append("David M-").append("Dorin M-").append("Doru M-").append("Dragos M-").append("Dumitru M-").append("Eduard M-").append("Emil M-").append("Eugen M-").append("Eusebiu M-").toString();
    String [] firstnameS = firstname.split("-");

        public String getRandomName(){
            Random rnd = new Random();
           return (firstnameS[rnd.nextInt(49)]);
        }
    static String lastname = new StringBuilder().append("Baciu-").append("Baconschi-").append("Baconski-").append("Baconsky-").append("Bădărău-").append("Căciulescu-").append("Cacoveanu-").append("Cadanțu-").append("Căianu-").append("Căileanu-").append("Damaschin-").append("Dănceanu-").append("Danciu-").append("Dănciulescu-").append("Dănescu-").append("Dănișor-").append("Eminescu-").append("Enache-").append("Ene-").append("Enescu-").append("Epureanu-").append("Fernic-").append("Fieraru-").append("Filimon-").append("Filipescu-").append("Filotti-").append("Geambașu-").append("Geiculescu-").append("Georgescu-").append("Gheorghe-").append("Gheorghelaș-").append("Halep-").append("Halippa-").append("Hălmăgeanu-").append("Hanganu-").append("Hanu-").append("Hasdeu-").append("Iacobescu-").append("Iaru-").append("Ierunca-").append("Irimescu-").append("Irimia-").append("Irimie-").append("Isopescu-").append("Laurian-").append("Lăzăreanu-").append("Lazu-").append("Lăzureanu-").append("Lăzărescu-").append("Lucaciu-").append("Lucan-").toString();
    String [] lastnameS = lastname.split("-");

    public String getRandomLastName(){
        Random rnd = new Random();
        return (lastnameS[rnd.nextInt(49)]);
    }

    static String type = new StringBuilder().append("PAS1-").append("PAS1-").append("PAS1-").append("PAS1-").append("PAS1-").append("PAS1-").append("PAS2-").append("PAS2-").append("PAS2-").append("PAS2-").append("PAS2-").append("ASR1-").append("ASR1-").append("ASR1-").append("ASR1-").append("ASR1-").append("ASR1-").append("ASR1-").append("ASR2-").append("ASR2-").append("ASR2-").append("ASR2-").append("ASR2-").append("ASR2-").append("ASR2-").append("AGR1-").append("AGR1-").append("AGR1-").append("AGR1-").append("AGR1-").append("AGR1-").append("AGR1-").append("AGR1-").append("AGR2-").append("AGR2-").append("AGR2-").append("AGR2-").append("AGR2-").append("AGR2-").append("AGR2-").append("AGR2-").append("AGR2-").append("AGR3-").append("AGR3-").append("AGR3-").append("AGR3-").append("AGR3-").append("AGR3-").append("AGR3-").append("AGR3-").append("AGR3-").toString();
    String [] typeS = type.split("-");
    public String getRandomType() {
        Random rnd = new Random();
        return (typeS[rnd.nextInt(49)]);
    }
}
