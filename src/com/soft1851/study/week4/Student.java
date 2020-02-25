package com.soft1851.study.week4;

/**
 * @ClassName Student
 * @Description TODO
 * @Author 田震
 * @Date 2020/2/25
 **/
public class Student {
    private String name;
    private  Integer age;
    private  String gender;
    public  Student(){

    }
    public  Student(String name,Integer age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
    public  static  StudentBuilder builder(){
        return new StudentBuilder();
    }
    static class  StudentBuilder{
        private  String name;
        private  Integer age;
        private  String gender;
        public  StudentBuilder name(String name){
            this.name=name;
            return  this;
        }
        public  StudentBuilder age(Integer age){
            this.age=age;
            return  this;
        }
        public  StudentBuilder gender(String gender){
            this.gender=gender;
            return  this;
        }
        public  Student build(){
            return  new Student(this.name,this.age,this.gender);
        }
        public  StudentBuilder(){

        }
    }
}