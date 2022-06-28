package com.example.housephoto.api.service;

import com.example.housephoto.api.dto.ResultDTO;
import com.example.housephoto.api.dto.UserinfoDTO;
import com.example.housephoto.svc.data.model.Userinfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Api(value = "房屋人员管理",tags = "房屋人员管理服务")
public interface IHuserinfoService {

    String API_PREFIX = "/whl/user";

    @ApiOperation(value = "获取人员信息")
    @PostMapping(value = API_PREFIX + "/selectUserinfo")
    ResultDTO<UserinfoDTO> getUserinfo ();

    @ApiOperation(value = "登录查询人员信息")
    @PostMapping(value = API_PREFIX + "/loginUserinfo")
    ResultDTO<UserinfoDTO> loginUserinfo (@ApiParam(name = "name",value = "名称",required = true)
                                          @RequestParam("name")String name,
                                          @ApiParam(name = "pass",value = "密码",required = true)
                                          @RequestParam("pass")String pass);

}
