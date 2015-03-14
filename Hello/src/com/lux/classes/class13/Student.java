package com.lux.classes.class13;

//import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.math.BigDecimal;

/**
 * Created by dima on 7/21/2014.
 */
public class Student {
    private Integer id; //зачетка
    private String firstN;
    private String lastN;
    private BigDecimal rate; //particular Student rating

    /**
     * Constructor
     * @param id
     * @param firstN
     * @param lastN
     * @param rate
     */
    public Student(Integer id, String firstN, String lastN, BigDecimal rate) {
        this.id = id;
        this.firstN = firstN;
        this.lastN = lastN;
        this.rate = rate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstN() {
        return firstN;
    }

    public void setFirstN(String firstN) {
        this.firstN = firstN;
    }

    public String getLastN() {
        return lastN;
    }

    public void setLastN(String lastN) {
        this.lastN = lastN;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstN='" + firstN + '\'' +
                ", lastN='" + lastN + '\'' +
                ", rate=" + rate +
                '}';
    }
}
