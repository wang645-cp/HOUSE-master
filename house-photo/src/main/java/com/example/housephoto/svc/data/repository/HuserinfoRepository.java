package com.example.housephoto.svc.data.repository;

import com.example.housephoto.svc.data.model.Userinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HuserinfoRepository extends JpaRepository<Userinfo,String> {

    List<Userinfo> findAllBy();

//    @Query("select * from ")
    Userinfo getByUseridAndPassword(String name,String pass);

}
