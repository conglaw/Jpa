package com.hibernate.con.jpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_third_right")
@org.hibernate.annotations.Table(appliesTo = "t_third_right",comment="第三方权益")
public class ThirdRight {
    private Integer id;

    private Integer rightId;

    private String rightName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(columnDefinition="Int(11) default 0 comment '第三方权益Id' ")
    public Integer getRightId() {
        return rightId;
    }

    public void setRightId(Integer rightId) {
        this.rightId = rightId;
    }

    @Column(columnDefinition="varchar(50) default '' comment '第三方权益名字' ")
    public String getRightName() {
        return rightName;
    }

    public void setRightName(String rightName) {
        this.rightName = rightName;
    }


    private CustomerRight customerRight;

    @ManyToOne
    @JoinColumn(name = "consumer_right_id")
    public CustomerRight getCustomerRight() {
        return customerRight;
    }

    public void setCustomerRight(CustomerRight customerRight) {
        this.customerRight = customerRight;
    }
}
