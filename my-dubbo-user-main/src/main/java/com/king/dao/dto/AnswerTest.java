package com.king.dao.dto;

import java.io.Serializable;


public class AnswerTest implements Serializable {
    private static final long serialVersionUID = -1264351353350663628L;

    private long id;
    private int exerciseSource;
    private int year;
    private long orgId;

    public int getExerciseSource() {
        return exerciseSource;
    }

    public void setExerciseSource(int exerciseSource) {
        this.exerciseSource = exerciseSource;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOrgId() {
        return orgId;
    }

    public void setOrgId(long orgId) {
        this.orgId = orgId;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "AnswerTest{" +
                "exerciseSource=" + exerciseSource +
                ", id=" + id +
                ", year=" + year +
                ", orgId=" + orgId +
                '}';
    }
}
   
