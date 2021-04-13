package com.yyx.pojo;

import com.yyx.pojo.Dog;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String name;
    private Integer age;
    private Boolean happy;
    private Date birthday;
    private Map<String,Object> map;
    private List<Object> list;
    private Dog dog;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getHappy() {
        return happy;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public List<Object> getList() {
        return list;
    }

    public Dog getDog() {
        return dog;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setHappy(Boolean happy) {
        this.happy = happy;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Person(String name, Integer age, Boolean happy, Date birthday, Map<String, Object> map, List<Object> list, Dog dog) {
        this.name = name;
        this.age = age;
        this.happy = happy;
        this.birthday = birthday;
        this.map = map;
        this.list = list;
        this.dog = dog;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", happy=" + happy +
                ", birthday=" + birthday +
                ", map=" + map +
                ", list=" + list +
                ", dog=" + dog +
                '}';
    }
}
