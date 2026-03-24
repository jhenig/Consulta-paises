import com.google.gson.annotations.SerializedName;

import java.util.List;

public record Paises(Name name, List<String> capital,
                     @SerializedName("region") String regiao,
                     @SerializedName("population") long populacao) {

    public record Name(String common, String official){}

    @Override
    public String toString(){
        return "País: " + name.common() +
                "\nCapital: " + (capital != null ? capital.get(0) : "N/A") +
                "\nRegião: " + regiao +
                "\nPopulação: " + populacao;
    }
}
