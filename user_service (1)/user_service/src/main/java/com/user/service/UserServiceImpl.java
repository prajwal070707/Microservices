package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;


@Service
public class UserServiceImpl implements UserService{

	@Override
	public User getUser(Long id) {
		List<User> list = List.of(new User(1311L, "Durgesh Tiwari", "23423334"),
				new User(1312L, "Sriram Tiwari", "53423334"),
				new User(1313L, "jairam Tiwari", "73423334"));
		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
