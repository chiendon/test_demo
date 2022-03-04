package demo.dc.domain.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.dc.domain.entity.Users;
import demo.dc.domain.entity.UsersExample;
import demo.dc.domain.repository.UsersMapper;
import demo.dc.domain.service.UserService;

@Service
public class UsersServiceImpl implements UserService{
	@Autowired
	UsersMapper usersMapper;
	@Autowired
	UsersExample usersExample;
	
	public List<Users> getUsers(){
		usersExample.clear();
		List<Users> UsersList = usersMapper.selectByExample(usersExample);
		return UsersList;
	}

}
