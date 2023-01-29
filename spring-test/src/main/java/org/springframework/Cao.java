package org.springframework;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Cao {
    private String id;

	private int i;

	private Set<Object> set;

	private Map<String,Object> map;

	private Person person;

	private Properties properties;

	public String getId() {
		return id;
	}

	public Cao setId(String id) {
		this.id = id;
		return this;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public Set<Object> getSet() {
		return set;
	}

	public void setSet(Set<Object> set) {
		this.set = set;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public static void main(String[] args) {
		for (int i = 100; i <= 999; i++) {
			String item = String.valueOf(i);
			char[] chars = item.toCharArray();
			int a = chars[0];
			int b = chars[1];
			int c = chars[2];
			if ((Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3))==i){
				System.out.println(i);
			}
		}
		Arrays.stream(new int[]{1, 2, 3}).max().ifPresent(System.out::println);
	}
	public Integer around() {
		System.out.println("环绕");
		return 1;
	}

	public String before(){
		System.out.println("前置");
		return "前置";
	}

	public String after(){
		System.out.println("后置");
		return "后置";
	}



	@PostConstruct
	public void init(){
		System.out.println("初始化方法");
	}

}
