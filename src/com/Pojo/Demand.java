package com.Pojo;

import org.springframework.stereotype.Component;

@Component
public class Demand {
    private Integer demandid;

    private String demandsex;

    private String demandmaritalstate;

    private String demandeducation;

    private Integer addressid;

    private String usremail;

    private Integer demandminage;

    private Integer demandmaxage;

    private Float demandheight;

    public Integer getDemandid() {
        return demandid;
    }

    public void setDemandid(Integer demandid) {
        this.demandid = demandid;
    }

    public String getDemandsex() {
        return demandsex;
    }

    public void setDemandsex(String demandsex) {
        this.demandsex = demandsex == null ? null : demandsex.trim();
    }

    public String getDemandmaritalstate() {
        return demandmaritalstate;
    }

    public void setDemandmaritalstate(String demandmaritalstate) {
        this.demandmaritalstate = demandmaritalstate == null ? null : demandmaritalstate.trim();
    }

    public String getDemandeducation() {
        return demandeducation;
    }

    public void setDemandeducation(String demandeducation) {
        this.demandeducation = demandeducation == null ? null : demandeducation.trim();
    }

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public String getUsremail() {
        return usremail;
    }

    public void setUsremail(String usremail) {
        this.usremail = usremail == null ? null : usremail.trim();
    }

    public Integer getDemandminage() {
        return demandminage;
    }

    public void setDemandminage(Integer demandminage) {
        this.demandminage = demandminage;
    }

    public Integer getDemandmaxage() {
        return demandmaxage;
    }

    public void setDemandmaxage(Integer demandmaxage) {
        this.demandmaxage = demandmaxage;
    }

    public Float getDemandheight() {
        return demandheight;
    }

    public void setDemandheight(Float demandheight) {
        this.demandheight = demandheight;
    }
}