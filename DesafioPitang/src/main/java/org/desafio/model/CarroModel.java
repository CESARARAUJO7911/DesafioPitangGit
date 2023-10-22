package org.desafio.model;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
public class CarroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCar;
    @Column
    private Integer yearCars;
    @Column
    private String licencePlate;
    @Column
    private String model;
    @Column
    private String color;

    public Long getIdCar() {
        return idCar;
    }

    public void setIdCar(Long idCar) {
        this.idCar = idCar;
    }

    public Integer getYearCars() {
        return yearCars;
    }

    public void setYearCars(Integer yearCars) {
        this.yearCars = yearCars;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CarroModel that)) return false;
        return Objects.equals(getIdCar(), that.getIdCar());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdCar());
    }
}
