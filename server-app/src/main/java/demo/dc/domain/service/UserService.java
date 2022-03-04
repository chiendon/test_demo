package demo.dc.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import demo.dc.domain.entity.Users;

@Service
public interface UserService {
	public List<Users> getUsers();
}
