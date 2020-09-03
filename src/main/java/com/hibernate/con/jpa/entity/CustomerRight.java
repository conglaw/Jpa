package com.hibernate.con.jpa.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "t_customer_right")
@org.hibernate.annotations.Table(appliesTo = "t_customer_right",comment="客户权益")
public class CustomerRight {

    private Integer id;//主键

    private Integer rightId;//权益Id

    private String rightName;//权益名

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(columnDefinition="Int(11) default 0 comment '权益Id' ")
    public Integer getRightId() {
        return rightId;
    }

    public void setRightId(Integer rightId) {
        this.rightId = rightId;
    }

    @Column(columnDefinition="varchar(50) default '' comment '权益名字' ")
    public String getRightName() {
        return rightName;
    }

    public void setRightName(String rightName) {
        this.rightName = rightName;
    }

    private List<ThirdRight> thirdRights;

    @OneToMany(mappedBy = "customerRight",cascade = {CascadeType.ALL})
    public List<ThirdRight> getThirdRights() {
        return thirdRights;
    }

    public void setThirdRights(List<ThirdRight> thirdRights) {
        this.thirdRights = thirdRights;
    }
}
