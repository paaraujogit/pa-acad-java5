package pt.cgd.indices;

//import com.google.gson.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import org.json.simple.*;
import org.json.simple.parser.*;

public class IndexDownload {

    public final static int iALPHAVANTAGE = 0;
    public final static int iYAHOO = 1;

    final static String[] sURL = {
        "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=MSFT&interval=1min&apikey=demo",
        "http://finance.yahoo.com/webservice/v1/symbols/allcurrencies/quote?format=json"
    };

    private String sIndex;
    private int iSite;
    private String sJSON;

    public IndexDownload(String sIndex, int iSite) throws Exception {
        this.sIndex = sIndex;
        this.iSite = iSite;

        sJSON = readUrl(sURL[iSite]);
//        Gson g = new Gson();
//        JsonElement jelement = new JsonParser().parse(sJSON);
//        JsonArray jobject = jelement.getAsJsonArray();
        
        JSONParser parser = new JSONParser();

        JSONObject obj = (JSONObject) parser.parse(sJSON);
        JSONObject obj2 = (JSONObject) obj.get(0);
//        JSONArray array = (JSONArray) obj.get("Time Series (1min)");
        
        HashMap hm ;

        switch (iSite) {
            case iALPHAVANTAGE:

                break;

            case iYAHOO:

                break;
        }

    }

    private static String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1) {
                buffer.append(chars, 0, read);
            }

            return buffer.toString();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }

}
