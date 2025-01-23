public class Car {
    private String cModel;
    private int cYear;
    private boolean cIsElectric;

    public String getModel() {
        return cModel;
    }

    public void setModel(String cModel) {
        this.cModel = cModel;
    }

    public int getYear() {
        return cYear;
    }

    public void setYear(int cYear) {
        this.cYear = cYear;
    }

    public boolean getIsElectric() {
        return cIsElectric;
    }

    public void setIsElectric(boolean cIsElectric) {
        this.cIsElectric = cIsElectric;
    }

    public Car() {
        this.cModel = "Not defined";
        this.cYear = 1;
        this.cIsElectric = false;
    }

    public Car(String model, int year, boolean isElectric) {
        this.cModel = model;
        this.cYear = year;
        this.cIsElectric = isElectric;
    }
}
