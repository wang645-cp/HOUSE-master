package com.example.housephoto.svc.controller;

import com.example.housephoto.api.dto.ResultDTO;
import com.example.housephoto.api.dto.UserinfoDTO;
import com.example.housephoto.api.service.IHuserinfoService;
import com.example.housephoto.svc.data.model.Userinfo;
import com.example.housephoto.svc.service.HuserinfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HuserinfoController implements IHuserinfoService {

    @Autowired
    private HuserinfoService huserinfoService;

    /*
    * 获取所有人员信息
    * */
    @Override
    public ResultDTO<UserinfoDTO> getUserinfo() {

        List<Userinfo> userinfoList = huserinfoService.getUserinfoAll();

        List<UserinfoDTO> userinfoDTOList = new ArrayList();
        for (Userinfo user : userinfoList){
            UserinfoDTO userinfoDTO = new UserinfoDTO();
            BeanUtils.copyProperties(user,userinfoDTO);
            userinfoDTOList.add(userinfoDTO);
        }
        return ResultDTO.success(userinfoDTOList);
    }
}
