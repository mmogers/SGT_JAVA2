package lesson1.helloWorldLibrary;

public class WorldLibrary {
    private String planetName;

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public static String getName(){ //static belongs to a class
        return "Marina";
    }

}
