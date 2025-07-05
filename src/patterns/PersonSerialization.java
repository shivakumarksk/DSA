package patterns;

import java.io.Serializable;

public class PersonSerialization implements Serializable {
    private String name;

    public PersonSerialization(String name, String city) {
        this.name = name;
        this.city = city;
    }

    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
