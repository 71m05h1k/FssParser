import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

class Konnekt {
    String searchstring;
    String pechenyushka;
    HttpURLConnection connection;

    public String openpage (String searchstr) {

        this.searchstring = searchstr;
        try {
            connection = (HttpURLConnection) new URL(searchstring).openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        connection.setRequestProperty("Host" , "fssprus.ru");
        connection.setRequestProperty("User-Agent" , "Mozilla/5.0 (X11; Linux i686; rv:38.0) Gecko/20100101 Firefox/38.0 Iceweasel/38.2.0");
        connection.setRequestProperty("Accept" , "*/*");
        connection.setRequestProperty("Accept-Language" , "ru,en-US;q=0.7,en;q=0.3");
        connection.setRequestProperty("Accept-Encoding" , "deflate");
        connection.setRequestProperty("DNT" , "1");
        connection.setRequestProperty("X-Requested-With" , "XMLHttpRequest");
        connection.setRequestProperty("Referer" , "http://fssprus.ru/iss/ip/");
        connection.setRequestProperty("Connection" , "keep-alive");


        StringBuilder tempstring = new StringBuilder();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(connection.getInputStream(),"windows-1251"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (pechenyushka != null) {
//            pechenyushka = connection.getHeaderField("Set-Cookie");
            connection.setRequestProperty("Set-Cookie", pechenyushka);
        }



        String line;
        try {
            if (br != null) {
                while ((line = br.readLine()) != null) {
                    tempstring = tempstring.append(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (br != null) {
                br.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tempstring.toString();
    }
}
