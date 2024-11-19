package academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio;

import lombok.Builder;
import lombok.Getter;
import lombok.Value;

@Value
@Builder
public class Producer {
    Integer id;
    String name;
}
