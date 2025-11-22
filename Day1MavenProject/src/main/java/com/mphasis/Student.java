package com.mphasis;

import java.util.Objects;

public class Student {

		private int id;
		private String name;
		private int marks;
		private int age;
		
		static String clgname="KSR College";
		
		
		@Override
		public int hashCode() {
			return Objects.hash(age, id, marks, name);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			return age == other.age && id == other.id && marks == other.marks && Objects.equals(name, other.name);
		}
		public Student() {
			super();
		}
		public Student(int id, String name, int marks, int age) {
			super();
			this.id = id;
			this.name = name;
			this.marks = marks;
			this.age = age;
		}
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
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", age=" + age + "]";
		}
		
	class clg{
		 private String clgName;
		 private String location;
		 private long clgcode;
		public clg() {
			super();
		}
		public clg(String clgName, String location, long clgcode) {
			super();
			this.clgName = clgName;
			this.location = location;
			this.clgcode = clgcode;
		}
		public String getClgName() {
			return clgName;
		}
		public void setClgName(String clgName) {
			this.clgName = clgName;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public long getClgcode() {
			return clgcode;
		}
		public void setClgcode(long clgcode) {
			this.clgcode = clgcode;
		}
		@Override
		public String toString() {
			return "clg [clgName=" + clgName + ", location=" + location + ", clgcode=" + clgcode + "]";
		}
		 
		 
	 }
		
		
}
