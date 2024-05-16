import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConvertirMoneda {

    public Moneda moneda(String monedaOrigen, String monedaDestino, double numeroUsuario){
        String endpoint = "https://v6.exchangerate-api.com/v6/c9441403a5169522eb03bda8/pair/"+monedaOrigen+"/"+monedaDestino+"/"+numeroUsuario;

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(endpoint))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String jsonData = response.body();
            return gson.fromJson(jsonData, Moneda.class);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}