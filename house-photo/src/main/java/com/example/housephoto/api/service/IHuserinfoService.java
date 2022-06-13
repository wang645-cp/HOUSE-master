package com.example.housephoto.api.service;

import com.example.housephoto.api.dto.ResultDTO;
import com.example.housephoto.api.dto.UserinfoDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;

@Api(value = "房屋人员管理",tags = "房屋人员管理服务")
public interface IHuserinfoService {

    String API_PREFIX = "/whl/user";

    @ApiOperation(value = "获取人员信息")
    @PostMapping(value = API_PREFIX + "selectUserinfo")
    ResultDTO<UserinfoDTO> getUserinfo ();

}
