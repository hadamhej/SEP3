package com.SEP3.CarRentalAPI.Model;

import javax.persistence.*;

@Entity
@Table(name = "vehicle")
public class Vehicle
{
    private long id;
    private String name;
    private String type;
    private int pricePerDay;
    private int seatsCount;
    private boolean isAutomatic;
    private int powerKw;
    private String fuelType;
    private int deposit;

    public Vehicle()
    {
    }

    public Vehicle(String name, String type, int pricePerDay, int seatsCount,
                   boolean isAutomatic, int powerKw, String fuelType, int deposit)
    {
        this.name = name;
        this.type = type;
        this.pricePerDay = pricePerDay;
        this.seatsCount = seatsCount;
        this.isAutomatic = isAutomatic;
        this.powerKw = powerKw;
        this.fuelType = fuelType;
        this.deposit = deposit;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId()
    {
        return id;
    }
    public void setId(long id)
    {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    @Column(name = "type", nullable = false)
    public String getType()
    {
        return type;
    }
    public void setType(String type)
    {
        this.name = type;
    }

    @Column(name = "price_per_day", nullable = false)
    public int getPricePerDay()
    {
        return pricePerDay;
    }
    public void setPricePerDay(int pricePerDay)
    {
        this.pricePerDay = pricePerDay;
    }

    @Column(name = "seats_count", nullable = false)
    public int getSeatsCount()
    {
        return seatsCount;
    }
    public void setSeatsCount(int seatsCount)
    {
        this.seatsCount = seatsCount;
    }

    @Column(name = "is_automatic", nullable = true)
    public boolean isAutomatic()
    {
        return isAutomatic;
    }
    public void setAutomatic(boolean isAutomatic)
    {
        this.isAutomatic = isAutomatic;
    }

    @Column(name = "power_kw", nullable = true)
    public int getPowerKw()
    {
        return powerKw;
    }
    public void setPowerKw(int powerKw)
    {
        this.powerKw = powerKw;
    }

    @Column(name = "fuel_type", nullable = false)
    public String getFuelType()
    {
        return fuelType;
    }
    public void setFuelType(String fuelType)
    {
        this.name = fuelType;
    }

    @Column(name = "deposit", nullable = true)
    public int getDeposit()
    {
        return deposit;
    }
    public void setDeposit(int deposit)
    {
        this.deposit = deposit;
    }
}
