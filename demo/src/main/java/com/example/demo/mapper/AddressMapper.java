package com.example.demo.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Address;

@Mapper
public interface AddressMapper {
		public void addAddress(Address add);
		public Address selectAddressById(int id);
		public void deleteById(int id);
		public void updateById(Address address);
		public void deleteAddressByList(ArrayList<Integer> list);
}
