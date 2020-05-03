package com.tx.service;

import com.tx.common.benas.vo.UserVO;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    public List<UserVO> getList(){
        List<UserVO> data=new ArrayList<UserVO>();
        data.add(new UserVO(1, "冰冰1"));
        data.add(new UserVO(2, "冰冰2"));
        data.add(new UserVO(3, "冰冰3"));
        data.add(new UserVO(4, "冰冰4"));
        data.add(new UserVO(5, "冰冰5"));
        data.add(new UserVO(6, "冰冰6"));

        return data;
    }
}
