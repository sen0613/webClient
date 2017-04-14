import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-14.
 */
public class URLDemo {
    public static void main(String[] args) {

        try {
            URL url = new URL("http://www.naver.com");

            //URLConnection conn = url.openConnection();

//            String contentType = conn.getContentType();
//            String encoding = conn.getContentEncoding();


            InputStream is = url.openStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            List<String[]> list = new ArrayList<>();

            String line = "";

            int count = 0;
            while ((line = br.readLine()) != null) {

                String[] splitted = line.split(" ");
                list.add(splitted);

                System.out.println(splitted.length);

                count += splitted.length;

            }System.out.printf("총 단어수는 %d입니다.", count);


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
