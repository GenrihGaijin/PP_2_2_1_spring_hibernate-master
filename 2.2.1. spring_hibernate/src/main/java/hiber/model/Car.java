package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Column(name = "model")
private String model;
    @Column(name = "series")
private int series;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private Long car_id;
public Car(){}
    public Car(String model, int series){
    this.model=model;
    this.series=series;
    }
    public Long getId_car() {
        return car_id;
    }

    public void setId_car(Long car_id) {
        this.car_id= car_id;
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
