package com.xzit.homework2;

public class Monkey implements Convert{
    private Woman woman;
    @Override
    public void convert() {
        find();
        if(woman==null){
            woman=new Woman();
        }
        woman.convert();
        fight();
    }
    public void find (){
        System.out.println("发现高翠兰样貌");
    }
    public void fight(){
        System.out.println("与猪八戒搏斗");
    }
}
