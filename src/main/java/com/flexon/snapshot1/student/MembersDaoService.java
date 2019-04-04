package com.flexon.snapshot1.student;

import java.util.ArrayList;
import java.util.Iterator;



import org.springframework.stereotype.Component;

@Component
public class MembersDaoService {
	private static ArrayList<Member> MobileClass = new ArrayList<Member>();
	
	public MembersDaoService() {
		Member member1 = new Member("Harkirat","Singh",913458450,"harkirat.unplugged@gmail.com");
		Member member2 = new Member("fang","lee",98228838,"harkirat123@gmail.com");
		Member member3 = new Member("karthik","kumar",91008450,"karthik.kumar@gmail.com");
		Member member4 = new Member("Karan","Dhillon",991165450,"karan.dhillon@gmail.com");
		Member member5 = new Member("makan","siddh",9158999,"makan.sidhh@gmail.com");
		
		MobileClass.add(member1);
		MobileClass.add(member2);
		MobileClass.add(member3);
		MobileClass.add(member4);
		MobileClass.add(member5);
		
		
	}

	public ArrayList<Member> displayStudent(){
		return MobileClass;
	}
	
	public String addMember(Member std) {
		MobileClass.add(std);
		return "Add Success";
	}
	
	public Member searchMember(String firstName) {
		
		for(Member Member:MobileClass) {
			if(Member.getFirstName().equals(firstName)) {
				return Member;
			}
			
		}
	return null;
	}
	 public String deleteMember(String firstName){
	    	Iterator<Member> iterator = MobileClass.iterator();
	    	while(iterator.hasNext())
	    	{
	    		Member DeleteMember = iterator.next();
	    		if (DeleteMember.getFirstName().equals(firstName))
	    		{
	    			iterator.remove();
	    	    	return "Delete Successful";
	    		}
	    	}
	    	return "Delete not successful";
	
}
	 public String updateMember(String firstName,Member newFriend) {
		 int index = -1;
		 for(int i=0;i<MobileClass.size();i++) {
			 if(MobileClass.get(i).getFirstName().equals(firstName)) {
				 index = i;
				 break;
			 }
		 }
				 
		if(index!=-1) {	 
			 MobileClass.set(index, newFriend); 
			return "UPdated";
		 }
		 
		
		return "Failed";
		 
		 
		 
		 
	 }
}
