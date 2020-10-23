package com.revature.models;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="time_model")
public class TimeModel {

    @Column(name ="time")
    private String time;

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "event")
    private String event;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return "TimeModel{" +
                "time='" + time + '\'' +
                ", id=" + id +
                ", event='" + event + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeModel timeModel = (TimeModel) o;
        return Objects.equals(getTime(), timeModel.getTime()) &&
                Objects.equals(getId(), timeModel.getId()) &&
                Objects.equals(getEvent(), timeModel.getEvent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTime(), getId(), getEvent());
    }
}
