package hiber.model;

public class Car {
    private String model;
private int series;
private long id;
public Car(){}
    public Car(String model, int series){
    this.model=model;
    this.series=series;
    }
    public long getId(){
    return id;
    }
    public void setId(long id){
    this.id=id;

    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public int getSeries(){
        return series;
    }
    public void setSeries(int series){
        this.series=series;

    }
}
