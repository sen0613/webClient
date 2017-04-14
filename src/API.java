import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-14.
 */
public class API {
    public static void main(String[] args) {

        try {
            URL url = new URL("http://api.github.com");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            //URLConnection conn = url.openConnection();

//            String contentType = conn.getContentType();
//            String encoding = conn.getContentEncoding();


            InputStream is = url.openStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String line = "";
            List<String> list = new ArrayList<>();


            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }



        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


