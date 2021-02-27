package store.collections;

import java.util.ArrayList;

import store.entities.Member;

public class MembersList {

	private ArrayList<Member> membersList = new ArrayList<Member>();

	/**
	 * This method takes member parameters, creates a new member object, and adds
	 * that member object to the Member array
	 * 
	 * @param name        the name of the member
	 * @param address     the address of the member
	 * @param phoneNumber the phone number of the member
	 * @param dateJoined  the date the member joined
	 * @param feePaid     amount paid by the member to the grocery store
	 */
	public void addMemember(String name, String address, String phoneNumber, String dateJoined, double feePaid) {

		membersList.add(new Member(name, address, phoneNumber, dateJoined, feePaid));

	}

	/**
	 * This method removes a single member from the members list array
	 * 
	 * @param id the unique id of the member to be removed
	 * @return true of the member was removed, false if the member was not removed
	 */
	public boolean removeMember(String id) {
		for (Member member : membersList) {
			if (member.getId().equalsIgnoreCase(id)) {
				membersList.remove(member);
				return true;
			}
		}
		return false;
	}

}