package com.hibernate.con.jpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_consumer_points")
@org.hibernate.annotations.Table(appliesTo = "t_consumer_points",comment="客户积分")
public class ConsumerPoints {

    private Integer id;

    private Integer points; //积分值

    private String levelName;//层级名

    private Integer levelVal;//层级值


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(columnDefinition="Int(11) default 0 comment '积分值' ")
    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    @Column(columnDefinition="varchar(50) default '' comment '积分值' ")
    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    @Column(columnDefinition="Int(11)  default 0 comment '积分值' ")
    public Integer getLevelVal() {
        return levelVal;
    }

    public void setLevelVal(Integer levelVal) {
        this.levelVal = levelVal;
    }
}
