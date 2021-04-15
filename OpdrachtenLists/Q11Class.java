package opdrachtLists;

public class Q11Class {
    private String colour;

    public Q11Class(String colour) {
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
        return "colour = " + colour ;
    }
}
