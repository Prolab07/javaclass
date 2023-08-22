package Exception;

import java.util.Objects;

public class ExceptionHome extends java.lang.Exception {
   private String message;

    public ExceptionHome(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExceptionHome that = (ExceptionHome) o;

        return Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return message != null ? message.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ExceptionHome{" +
                "message='" + message + '\'' +
                '}';
    }
}
