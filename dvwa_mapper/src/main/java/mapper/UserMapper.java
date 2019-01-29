package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.User;

import java.util.List;

public interface UserMapper {
     List<User> queryUserList();
     User queryUserById(@Param("id") String id);
}
