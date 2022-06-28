package com.example.housephoto.svc.service.impl;

import com.example.housephoto.svc.data.model.Userinfo;
import com.example.housephoto.svc.data.repository.HuserinfoRepository;
import com.example.housephoto.svc.service.HuserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

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

    @Override
    public Userinfo getUserinfoOne(String name, String pass) {
        Userinfo userinfo = huserinfoRepository.getByUseridAndPassword(name,pass);
        if (StringUtils.isEmpty(userinfo)){
            return null;
        }
        return userinfo;
    }
}
