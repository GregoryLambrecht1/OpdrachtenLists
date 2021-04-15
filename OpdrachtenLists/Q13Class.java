package opdrachtLists;

import java.util.Objects;

public class Q13Class {
    private String name;
    private boolean niceColour;

    public Q13Class(String name, boolean niceColour) {
        this.name = name;
        this.niceColour = niceColour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNiceColour() {
        return niceColour;
    }

    public void setNiceColour(boolean niceColour) {
        this.niceColour = niceColour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Q13Class)) return false;
        Q13Class q13Class = (Q13Class) o;
        return Objects.equals(getName(), q13Class.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "name = " + name + ", niceColour = " + niceColour;
    }
}
