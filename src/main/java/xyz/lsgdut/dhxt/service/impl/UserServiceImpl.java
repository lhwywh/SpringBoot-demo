package xyz.lsgdut.dhxt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.lsgdut.dhxt.mapper.TbUserMapper;
import xyz.lsgdut.dhxt.pojo.TbUser;
import xyz.lsgdut.dhxt.pojo.TbUserExample;
import xyz.lsgdut.dhxt.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    TbUserMapper tbUserMapper;

    @Override
    public String addOneUser(TbUser tbUser) {
        try {
            int i = tbUserMapper.insert(tbUser);
            System.out.println("addOnePart返回：" + i);
            if (i == 0) {
                return "添加失败";
            } else {
                return "添加成功";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "添加失败";
        }//

    }

    @Override
    public List<TbUser> getAllUsers() {
        TbUserExample tbUser = new TbUserExample();
        TbUserExample.Criteria criteria =tbUser.createCriteria();
        criteria.andIdIsNotNull();
        List<TbUser> users =
                tbUserMapper.selectByExample(tbUser);
        return users;
    }
}
