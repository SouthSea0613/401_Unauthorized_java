package project;

	public class PhoneInfo {
	    private String name;
	    private String phoneNumber;
	    private String group; // 일반, 대학, 회사 그룹

	    public PhoneInfo(String name, String phoneNumber, String group) {
	        this.name = name;
	        this.phoneNumber = phoneNumber;
	        this.group = group;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public String getGroup() {
	        return group;
	    }

	    public String toString() {
	        return "이름: " + name + ", 전화번호: " + phoneNumber + ", 그룹: " + group;
	    }
	}


