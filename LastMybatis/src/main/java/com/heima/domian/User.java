package com.heima.domian;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
   private Integer id;
   private String username;
   private Date birthday;

    public static void main(String[] args) {
        System.out.println("第一个git工程项目");
        //修改第二次了
        System.out.println("修改第二次了");
    }
    public void print(){
        System.out.println("增加的数据");
    }
}
