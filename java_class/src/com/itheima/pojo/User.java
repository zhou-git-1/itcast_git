package com.itheima.pojo;

public class User {
    private String name;
    private Integer age;
    private String sex;

    /*
    * 吃方法
    * */
public void  eat(String eat){
    System.out.println("吃...."+eat);
}
    /*
    * 睡觉方法
    * */
    public void sleep(String sleep){
        System.out.println("睡。。。"+sleep);
    }

    public User(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
