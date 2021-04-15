package com.company;

public class WorkingOvertime extends Employee{
    protected float overtime_hours;
    protected int per_hour;

    public WorkingOvertime(String name, String surname, int age, float salary, float overtime_hours, int per_hour) {
        super(name, surname, age, salary);
        this.overtime_hours = overtime_hours;
        this.per_hour = per_hour;
    }

    public float getOvertime_hours() {
        return overtime_hours;
    }

    public int getPer_hour() {
        return per_hour;
    }

    public void setOvertime_hours(float overtime_hours) {
        this.overtime_hours = overtime_hours;
    }

    public void setPer_hour(int per_hour) {
        this.per_hour = per_hour;
    }

    @Override
    public String toString() {
        return "WorkerOvertime{" +
                "overtime_hours=" + overtime_hours +
                ", per_hour=" + per_hour +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public void IncreaseHours(float over){
        overtime_hours += over;
    }

    public void nextHour(){
        overtime_hours++;
    }

    public void resetHours(){
        overtime_hours = 0;
    }

    public float paymentOvertime(){
        return overtime_hours * per_hour;
    }

    public float SalaryAndOvertime(){
        return salary + overtime_hours * per_hour;
    }
}
