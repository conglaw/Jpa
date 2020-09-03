package com.hibernate.con.jpa.dao;

import com.hibernate.con.jpa.entity.CustomerRight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepositry extends JpaRepository<CustomerRight,Integer>{

}
