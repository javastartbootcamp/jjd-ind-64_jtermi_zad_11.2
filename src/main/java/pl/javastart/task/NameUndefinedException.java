package pl.javastart.task;

public class NameUndefinedException extends IllegalArgumentException {
    public NameUndefinedException() {
        super("Imię i nazwisko nie może być puste lub składać się z jednego znaku");
    }
}



