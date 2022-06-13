package com.example.housephoto.svc.service.impl;

import com.example.housephoto.svc.data.model.Userinfo;
import com.example.housephoto.svc.data.repository.HuserinfoRepository;
import com.example.housephoto.svc.service.HuserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HuserinfoServiceImpl implements HuserinfoService {

    @Autowired
    private HuserinfoRepository huserinfoRepository;

    @Override
    public List<Userinfo> getUserinfoAll() {
        List<Userinfo> userinfo = huserinfoRepository.findAllBy();
        return userinfo;
    }
}
