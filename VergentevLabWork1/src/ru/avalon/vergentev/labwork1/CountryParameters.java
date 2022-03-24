package ru.avalon.vergentev.labwork1.VergentevLabWork1.src.ru.avalon.vergentev.labwork1;

public class CountryParameters {
    private String nameOfCountry;
    private double square;
    private long populationOfCountry;
    private String nameOfCity;
    private long populationOfCity;


    //Constructors block
    public CountryParameters(String nameOfCountry, double square, long populationOfCountry) {
        setNameOfCountry(nameOfCountry);
        setSquare(square);
        setPopulationOfCountry(populationOfCountry);
    }

    public CountryParameters(String nameOfCountry, double square, long populationOfCountry, String nameOfCity, long populationOfCity) {
        this(nameOfCountry, square, populationOfCountry);
        setNameOfCity(nameOfCity);
        setPopulationOfCity(populationOfCity);
    }




    //Methods block
    public void print() {
        System.out.println("Name of country: " + getNameOfCountry());
        System.out.println("Square of country: " + getSquare() + " thousand sq. km.");
        System.out.println("Population of country: " + getPopulationOfCountry() + " thousand people");
        if (getNameOfCity() != null) {
            System.out.println("Name of the capital: " + getNameOfCity());
        }
        else if (getPopulationOfCity() != 0) {
            System.out.println("Population of the capital: " + getPopulationOfCity() + " people");
        }
        System.out.print('\n');
    }

    public static void printAll(CountryParameters [] country) {
        for (CountryParameters i : country) {
            i.print();
        }
    }







    //Getters and Setters block
    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public void setNameOfCountry(String nameOfCountry) {
        if (nameOfCountry == null) {
            throw new IllegalArgumentException("Name of countries must have the name");
        }
        this.nameOfCountry = nameOfCountry;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        if (square < 0) {
            throw new IllegalArgumentException("The square of countries can't be less than zero");
        }
        this.square = square;
    }

    public long getPopulationOfCountry() {
        return populationOfCountry;
    }

    public void setPopulationOfCountry(long populationOfCountry) {
        if (populationOfCountry < 0) {
            throw new IllegalArgumentException("The population of countries can't be less than zero");
        }
        this.populationOfCountry = populationOfCountry;
    }

    public String getNameOfCity() {
        return nameOfCity;
    }

    public void setNameOfCity(String nameOfCity) {
        if (nameOfCountry == null) {
            throw new IllegalArgumentException("Name of cities must have the name");
        }
        this.nameOfCity = nameOfCity;
    }

    public long getPopulationOfCity() {
        return populationOfCity;
    }

    public void setPopulationOfCity(long populationOfCity) {
        if (populationOfCity < 0) {
            throw new IllegalArgumentException("The population of cities can't be less than zero");
        }
        this.populationOfCity = populationOfCity;
    }
}
