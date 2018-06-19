package com.upoint.jni;

public class User implements Cloneable
{
    public static final int num = 1;
    static {
        System.out.println("num");
    }
	private int id;
	
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public User() {
	    super();
	    System.out.println("User loadclass is" + User.class.getClassLoader());
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}


    protected User clone() throws CloneNotSupportedException {
        return (User)super.clone();
    }
    
    private void test01() {
        System.out.println("User private way");
    }
}
