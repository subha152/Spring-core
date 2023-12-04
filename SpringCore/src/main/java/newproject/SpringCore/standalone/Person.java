package newproject.SpringCore.standalone;

import java.util.List;
import java.util.Map;

public class Person {

	private List<String> friend;
	private Map<String,Integer> coursesfess;
	

	public Map<String, Integer> getCoursesfess() {
		return coursesfess;
	}

	public void setCoursesfess(Map<String, Integer> coursesfess) {
		this.coursesfess = coursesfess;
	}

	public List<String> getFriend() {
		return friend;
	}

	public void setFriend(List<String> friend) {
		this.friend = friend;
	}

	@Override
	public String toString() {
		return "Person [friend=" + friend + ", coursesfess=" + coursesfess + "]";
	}

	
}
