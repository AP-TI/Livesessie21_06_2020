package be.apti.Livesessie21_06_2020.oefening3;

public class Boek implements Comparable<Boek>{
    private String titel;
    private String schrijver;
    private int uitgaveJaar;
    private boolean hardcover;

    public Boek(String titel, String schrijver, int uitgaveJaar, boolean hardcover) {
        this.titel = titel;
        this.schrijver = schrijver;
        this.uitgaveJaar = uitgaveJaar;
        this.hardcover = hardcover;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getSchrijver() {
        return schrijver;
    }

    public void setSchrijver(String schrijver) {
        this.schrijver = schrijver;
    }

    public int getUitgaveJaar() {
        return uitgaveJaar;
    }

    public void setUitgaveJaar(int uitgaveJaar) {
        this.uitgaveJaar = uitgaveJaar;
    }

    public boolean isHardcover() {
        return hardcover;
    }

    public void setHardcover(boolean hardcover) {
        this.hardcover = hardcover;
    }


    @Override
    public int compareTo(Boek o) {
        return this.titel.toLowerCase().compareTo(o.getTitel().toLowerCase());
    }

    @Override
    public String toString() {
        return titel;
    }
}
