package org.easyeat.service;

import java.util.List;

import javax.annotation.Resource;

import org.easyeat.entity.User;
import org.easyeat.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Resource
	private UserMapper userMapper;
	public List<User> querryUsers()
	{
		return userMapper.selectAllUser();
	}
	public User querryCustomersbyID(String id)
	{
		return userMapper.selectUserbyID(id);
	}
	public void deleteCustomerbyID(String id){
		userMapper.deleteUserbyID(id);
	}

}
