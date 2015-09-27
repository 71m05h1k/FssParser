/**
 * rasmer/fishbone crew
 */

//php\?no=\d\d\d\d\d\d\d\d\d\d
//http://stackoverflow.com/questions/926938/how-to-load-a-image-from-web-in-java
public class FssParser {
    public static void main (String args[]){
        System.out.println("FssParser ver. 0.1");
        String searchstring = "http://fssprus.ru/iss/ajax_search"; //?system=ip&is[extended]=1&is[variant]=3&is[ip_number]=4851/14/22/29&nocache=1&is[sort_field]=&is[sort_direction]=";
        Konnekt konnektion = new Konnekt();
        System.out.println(konnektion.openpage(searchstring));
        System.out.println(konnektion.openpage(searchstring));
    }
}
