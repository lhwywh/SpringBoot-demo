package xyz.lsgdut.dhxt.service;

import org.apache.ibatis.annotations.Param;
import xyz.lsgdut.dhxt.pojo.TbUser;

import java.util.List;

public interface UserService {
      String addOneUser(@Param("partInfo") TbUser partInfo);

      List<TbUser> getAllUsers();

}
