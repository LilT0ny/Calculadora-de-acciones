package Model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class StockModel {
    private String apiKey;

    public StockModel(String apiKey) {
        this.apiKey = apiKey;
    }

    public double obtenerPrecioActual(String symbol) {
        String urlString = "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol="
                + symbol + "&interval=1min&apikey=" + apiKey;
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();

            JSONObject json = new JSONObject(content.toString());
            JSONObject timeSeries = json.getJSONObject("Time Series (1min)");
            String lastKey = timeSeries.keys().next();
            return timeSeries.getJSONObject(lastKey).getDouble("4. close");
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public double[] calcularGananciaPerdida(double precioCompra, double precioActual, double cantidadAcciones) {
        double inversionInicial = precioCompra * cantidadAcciones;
        double valorActual = precioActual * cantidadAcciones;
        double gananciaDolares = valorActual - inversionInicial;
        double gananciaPorcentaje = (gananciaDolares / inversionInicial) * 100;
        return new double[]{gananciaPorcentaje, gananciaDolares};
    }
}
