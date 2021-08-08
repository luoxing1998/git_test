package com.eustc.git;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.util.ArrayList;

/**
 * @author luoxing
 * @create 2021-08-01 11:29
 */
public class GitTest {
    public static void main(String[] args) {
        System.out.println("测试git");
        testLog();
        System.out.println("第三次提交");
        System.out.println("hot-fix第一次提交");
        System.out.println("hot-fix");
        System.out.println("master");
        System.out.println("test pull");
        System.out.println("test push");
        System.out.println("test pull");
        System.out.println("再次测试test pull");
        System.out.println("两个分支的测试");
        System.out.println("测试新分支：lx_testGit");
        System.out.println("cool分支");
        testJSONObject();
    }

    public static void testLog(){
        System.out.println("第二次提交");
    }

    public static void testJSONObject(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("姓名","罗星");
        jsonObject.put("年龄",23);
        System.out.println(jsonObject);
        System.out.println(jsonObject.toJSONString());

        String studentString = "{\"id\":1,\"age\":2,\"name\":\"zhang\"}";
        JSONObject jsonObject1 = JSONObject.parseObject(studentString);
        System.out.println(jsonObject1);
        Student student1 = new Student();
        student1.setId(1);
        student1.setAge("20");
        student1.setName("asdasdasd");

        ArrayList<Student> studentLsit = new ArrayList<>();
        studentLsit.add(student1);

        Student student2 = new Student();
        student2.setId(2);
        student2.setAge("20");
        student2.setName("aaaa:;aaa");

        studentLsit.add(student2);

        //list转json字符串
        String string = JSON.toJSON(studentLsit).toString();
        System.out.println(string);
        //json字符串转listJson格式
        JSONArray jsonArray = JSONObject.parseArray(string);
        System.out.println(jsonArray);

    }

    @Data
    static class Student{
        Integer id;
        String age;
        String name;
    }
}
