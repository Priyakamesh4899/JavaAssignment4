package Assignment4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArraylistMainClass {
public static void main(String[] args) {
	ArrayList ob=new ArrayList();
	ArraylistExample a1=new ArraylistExample("Lakshmi",21,"Thiyagaraja",9.4);
	ArraylistExample a2=new ArraylistExample("Abhi",23,"MEPCO",9.6);
	ArraylistExample a3=new ArraylistExample("Praveena",22,"SRM",7.4);
	ArraylistExample a4=new ArraylistExample("Varsha",21,"MEPCO",8.4);
	ob.add(a1);
	ob.add(a2);
	ob.add(a3);
	ob.add(a4);
	Iterator i=ob.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	HashSet h=new HashSet();
	ArraylistExample b1=new ArraylistExample("Lakshmi",21,"Thiyagaraja",9.4);
	ArraylistExample b2=new ArraylistExample("Abhi",23,"MEPCO",9.6);
	ArraylistExample b3=new ArraylistExample("Praveena",22,"SRM",7.4);
	ArraylistExample b4=new ArraylistExample("Varsha",21,"MEPCO",8.4);
	h.add(b1);
	h.add(b2);
	h.add(b3);
	h.add(b4);
	h.add(b1);//To check that set doesnt accept dublicate values
	Iterator j=h.iterator();
	while(j.hasNext()) {
		System.out.println(j.next());
	}
	
}
public class ArraylistExample {
String name;
int age;
String clg;
double cgpa;
ArraylistExample(){}

public ArraylistExample(String name, int age, String clg, double cgpa) {
	super();
	this.name = name;
	this.age = age;
	this.clg = clg;
	this.cgpa = cgpa;
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

public String getClg() {
	return clg;
}

public void setClg(String clg) {
	this.clg = clg;
}

public double getCgpa() {
	return cgpa;
}

public void setCgpa(double cgpa) {
	this.cgpa = cgpa;
}

@Override
public String toString() {
	return "ArraylistExample [name=" + name + ", age=" + age + ", clg=" + clg + ", cgpa=" + cgpa + "]";
}

}
