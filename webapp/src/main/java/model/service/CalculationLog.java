package model.service;

import java.sql.Timestamp;

/**
 * Created by vladimir on 09.02.2018.
 */
public class CalculationLog {
    private long id;
    private double param1;
    private double param2;
    private String operation;
    private double result;
    private Timestamp creationDate;

    public CalculationLog(long id, double param1, double param2, String operation, double result, Timestamp creationDate) {
        this.id = id;
        this.param1 = param1;
        this.param2 = param2;
        this.operation = operation;
        this.result = result;
        this.creationDate = creationDate;
    }

    public CalculationLog(double param1, double param2, String operation, double result) {
        this.param1 = param1;
        this.param2 = param2;
        this.operation = operation;
        this.result = result;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getParam1() {
        return param1;
    }

    public double getParam2() {
        return param2;
    }

    public String getOperation() {
        return operation;
    }

    public double getResult() {
        return result;
    }

    public void setParam1(double param1) {
        this.param1 = param1;
    }

    public void setParam2(double param2) {
        this.param2 = param2;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }
}
