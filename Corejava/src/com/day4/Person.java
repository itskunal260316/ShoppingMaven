package com.day4;

public class Person /*extends Object*/ implements Cloneable{
		private String name;
		private int age;
		private Address addr;
		
		public Address getAddr() {
			return addr;
		}
		public Person(String name, int age, Address addr) {
			super();
			this.name = name;
			this.age = age;
			this.addr = addr;
		}
		public void setAddr(Address addr) {
			this.addr = addr;
		}
		public Person() 
		{
			
		}
	public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


	public Person(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
	


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";       ///Overridden method of toString from Object class
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException 
	    {

	Person p=(Person)super.clone();
	if(addr !=null)
	{
		Address a=(Address) addr.clone();
		p.setAddr(a);
	}
		return p;
	}
	@Override
	protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
		System.out.println("finalize called");
	
	}
	
	public static void main(String[] args) {
			

	}

}
