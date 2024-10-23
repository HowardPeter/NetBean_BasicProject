/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nhom24_lop01_ck;

/**
 *
 * @author PC
 */
public class SampleClass {
    // Các biến thành viên (fields)
    private String name;
    private int age;
    
    public SampleClass(){}
    // Constructor có tham số và xử lý dữ liệu
    public SampleClass(String name, int age) {
        // Xử lý data: kiểm tra và gán giá trị hợp lệ
        if (age < 0) {
            this.age = 0; // Đảm bảo tuổi không âm
        } else {
            this.age = age;
        }
        this.name = name.trim(); // Loại bỏ khoảng trắng dư thừa
    }

    // Getter và setter có xử lý data
    public String getName() {
        return name.toUpperCase(); // Trả về tên dưới dạng viết hoa
    }

    public void setName(String name) {
        this.name = name.trim(); // Loại bỏ khoảng trắng khi đặt tên
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Xử lý để đảm bảo tuổi không âm
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    // Phương thức có xử lý Exception
    public int calculateYearsUntilRetirement(int retirementAge) throws IllegalArgumentException {
        // Phát biểu điều kiện với 2 toán hạng trở lên
        if (retirementAge <= 0 || retirementAge < this.age) {
            throw new IllegalArgumentException("Tuổi nghỉ hưu không hợp lệ");
        }
        return retirementAge - this.age;
    }
}
