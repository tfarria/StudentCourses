package com.company;

public class Institution {
    public Institution() {
    }

    public Institution(String institutionName) {
        this.institutionName = institutionName;
    }

    private String institutionName;

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }
}
