package Collections.One.three;

import java.util.Objects;

public class Word {

    private String ukrword;
    private String engword;
    private String gerword;
    private String itaword;

    public Word(String ukrword, String engword, String gerword, String itaword) {
        this.ukrword = ukrword;
        this.engword = engword;
        this.gerword = gerword;
        this.itaword = itaword;
    }

    public String getUkrword() {
        return ukrword;
    }

    public void setUkrword(String ukrword) {
        this.ukrword = ukrword;
    }

    public String getEngword() {
        return engword;
    }

    public void setEngword(String engword) {
        this.engword = engword;
    }

    public String getGerword() {
        return gerword;
    }

    public void setGerword(String gerword) {
        this.gerword = gerword;
    }

    public String getItaword() {
        return itaword;
    }

    public void setItaword(String itapword) {
        this.itaword = itaword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Word word = (Word) o;

        if (!Objects.equals(ukrword, word.ukrword)) return false;
        if (!Objects.equals(engword, word.engword)) return false;
        if (!Objects.equals(gerword, word.gerword)) return false;
        return Objects.equals(itaword, word.itaword);
    }

    @Override
    public int hashCode() {
        int result = ukrword != null ? ukrword.hashCode() : 0;
        result = 31 * result + (engword != null ? engword.hashCode() : 0);
        result = 31 * result + (gerword != null ? gerword.hashCode() : 0);
        result = 31 * result + (itaword != null ? itaword.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Word{" +
                "ukrword='" + ukrword + '\'' +
                ", engword='" + engword + '\'' +
                ", gerword='" + gerword + '\'' +
                ", itaword='" + itaword + '\'' +
                '}';
    }
}
