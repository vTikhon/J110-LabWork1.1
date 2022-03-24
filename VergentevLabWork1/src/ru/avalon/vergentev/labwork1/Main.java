package ru.avalon.vergentev.labwork1;

import static ru.avalon.vergentev.labwork1.CountryParameters.*;

public class Main {
    public static void main(String[] args) {
        CountryParameters [] country = new CountryParameters [5];
        country[0] = new CountryParameters("Russia", 17100, 146700000, "Moscow", 12600000);
        country[1] = new CountryParameters("Finland", 338, 5500000, "Helsinki", 655000);
        country[2] = new CountryParameters("France", 643.8, 67800000, "Paris", 2100000);
        country[3] = new CountryParameters("Andorra", 0.467, 85400, "Andorra la Vella", 22600);
        country[4] = new CountryParameters("Singapore", 0.725, 5700000);

        CountryParameters.printAll(country);
        
    }
}
