package com.flexon.snapshot1.student;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class memberResource {
	
	@Autowired
	private MembersDaoService service;
	
	@GetMapping("/getAllMembers")
	public ArrayList<Member> displayStudent(){
		return service.displayStudent();
		
	}
	@PostMapping("/addMember")
	public String addMember(@RequestBody Member std) {
		return service.addMember(std);
		
	}
	@GetMapping("/getAllMembers/{firstName}")
	public Member searchMember(@PathVariable String firstName){
		return service.searchMember(firstName);
	}
	
	@DeleteMapping("/removeMember/{firstName}")
	public String deleteMember(@PathVariable String firstName) {
		
		
		return service.deleteMember(firstName);
		
	}
		
	@PutMapping("/updateMember/{firstName}")
	public String updateMember(@PathVariable String firstName,@RequestBody Member newFriend)
	{
		return service.updateMember(firstName, newFriend);
	}
		
}
