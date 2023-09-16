package toString_example;

public class Fruit { //Class`i yaratdiq.
    String alma; // Field verdik.

    public Fruit(String alma) {
        this.alma = alma;
    }

    public String getAlma() {
        return alma;
    }

    public void setAlma(String alma) {
        this.alma = alma;
    }

    @Override
    public String toString() {    //"toString"-i Override edib istedyimizi yaziriq.
        return "Fruit{" +
                "alma='" + alma + '\'' +
                '}';
    }

}
