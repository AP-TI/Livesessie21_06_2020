package be.apti.Livesessie21_06_2020.deel2.oefening7;

public class NoResultsException extends Exception{
    public NoResultsException() {
        super("Dit bestand heeft geen resultaten opgeleverd!");
    }

    public NoResultsException(String message) {
        super(message);
    }
}
