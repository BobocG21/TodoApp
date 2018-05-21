package ro.bobocgabrielcojocaruandrei;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TodoDescription {
    @Size(max = 50)
    @NotNull
    private String shortDescription;

    @Size(max = 300)
    @NotNull
    private String description;

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
