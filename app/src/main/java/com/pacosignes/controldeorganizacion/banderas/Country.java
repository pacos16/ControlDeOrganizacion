package com.pacosignes.controldeorganizacion.banderas;

public class Country {
    private String countryCode;
    private String countryName;
    private long countryPopulation;
    private String countryCapital;
    private String countryIso3;

    public Country(String countryCode, String countryName,
                   long countryPopulation, String countryCapital, String countryIso3) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.countryPopulation = countryPopulation;
        this.countryCapital = countryCapital;
        this.countryIso3 = countryIso3;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public long getCountryPopulation() {
        return countryPopulation;
    }

    public String getCountryCapital() {
        return countryCapital;
    }

    public String getCountryIso3() {
        return countryIso3;
    }
}
