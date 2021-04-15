package opdrachtLists;

import java.util.Objects;

public class Q10Class {
    private String colour;

    public Q10Class(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "colour : " + colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Q10Class)) return false;
        Q10Class q10Class = (Q10Class) o;
        return Objects.equals(getColour(), q10Class.getColour());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColour());
    }
}
