package pl.javastart.task;

public class IncorrectAgeException extends IllegalArgumentException {
    public IncorrectAgeException() {
        super("Wiek nie może być mniejszy niż 1.");
    }
}
