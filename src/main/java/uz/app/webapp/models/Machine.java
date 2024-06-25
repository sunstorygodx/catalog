package uz.app.webapp.models;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
public class Machine {
    private String name;
    private String weight;
    private String desc;
}
