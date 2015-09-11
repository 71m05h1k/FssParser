/**
 * rasmer/fishbone crew
 */

public class FssParser {
    public static void main (String args[]){
        String searchstring = "http://fssprus.ru/iss/ip/";
        Konnekt konnektion = new Konnekt(searchstring);
        System.out.println(konnektion.openpage());
    }
}
