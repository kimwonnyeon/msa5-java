package org.example.e14record;

// record 사용
public record EduRecord(
        String name,
        int age
) {}

// public class EduRecord {
//     // 기존 방식
//     private final String name;
//     private final int age;
//
//     public  EduRecord(String name, int age){
//         this.name = name;
//         this.age = age;
//     }
//
//     //Getter
//     public String getName() {
//         return name;
//     }
//
//     public int getAge() {
//         return age;
//     }
// }

