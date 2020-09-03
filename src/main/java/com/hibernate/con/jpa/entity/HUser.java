package com.hibernate.con.jpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_huser")
public class HUser {

    private Long id;

    private String userName;

    private String passwd;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(columnDefinition="varchar(100) default '' comment '用户名' ")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(columnDefinition="varchar(50) default '' comment '密码' ")
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "entity.HUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }
}
