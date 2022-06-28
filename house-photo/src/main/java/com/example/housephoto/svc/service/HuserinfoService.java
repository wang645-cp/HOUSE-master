package com.example.housephoto.svc.service;

import com.example.housephoto.svc.data.model.Userinfo;

import java.util.List;

public interface HuserinfoService {

    List<Userinfo> getUserinfoAll();

    Userinfo getUserinfoOne(String name,String pass);
}
