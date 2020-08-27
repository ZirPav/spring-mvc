package web.model;

public class Car {

    private int id;

    private String name;

    private int number;

    public Car(){

    }

    public Car(int id, String name, int number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
