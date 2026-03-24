import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaPais {

    public Paises buscarPais(String pais){
        String nomeCodificado = java.net.URLEncoder.encode(pais.trim(), java.nio.charset.StandardCharsets.UTF_8);
        URI endereco = URI.create("https://restcountries.com/v3.1/translation/" + nomeCodificado);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Paises[] listaDePaises = new Gson().fromJson(response.body(), Paises[].class);

            return listaDePaises[0];
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Não consegui localizar o País a partir dessas informações.");
        }
    }
}
