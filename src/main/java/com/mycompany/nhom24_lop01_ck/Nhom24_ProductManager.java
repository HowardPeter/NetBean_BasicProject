/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nhom24_lop01_ck;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author PC
 */
public class Nhom24_ProductManager {
    private int productID;
    private String productName;
    private String productCategory;
    private float productPrice;
    private static ArrayList<Nhom24_ProductManager> productList = new ArrayList<>(); // Danh sách sản phẩm

    // Constructor có tham số: có xử lý data
    public Nhom24_ProductManager(int productID, String productName, String productCategory, float productPrice) {
        this.productID = productID;
        this.productName = validateName(productName); // Xử lý tên sản phẩm
        this.productCategory = validateName(productCategory); // Xử lý danh mục sản phẩm
        this.productPrice = validatePrice(productPrice); // Xử lý giá sản phẩm
    }
    
    public Nhom24_ProductManager(){}

    // Getters/Setters có xử lý data
    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = validateName(productName); // Xử lý tên sản phẩm
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = validateName(productCategory); // Xử lý danh mục sản phẩm
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = validatePrice(productPrice); // Xử lý giá sản phẩm
    }
    
    // Phương thức có kiểu trả về: Kiểm tra ký tự đặc biệt trong tên sản phẩm
    private String validateName(String name) {
        String cleanedName = name.trim();
        if (!cleanedName.isEmpty() && Pattern.matches("^[a-zA-Z0-9]", cleanedName)) {
            throw new IllegalArgumentException("Invalid product/category name!");
        }
        return cleanedName.toUpperCase();
    }

    // Phương thức kiểm tra giá sản phẩm
    private float validatePrice(float price) {
        if (price < 0) {
            return 0;
        }
        return price;
    }

    // Phương thức void: Cập nhật giá sản phẩm với % tăng giá
    public void updatePrice(int id, float percentage) {
        boolean found = false;
        for (Nhom24_ProductManager product : productList) 
        {
            if(product.getProductID() == id)
            {
                found = true;
                if (percentage < -100 || percentage > 100) // Phát biểu điều kiện với 2 toán hạng trở lên
                {
                    System.out.println("Invalid percentage!");
                }
                float oldPrice = product.getProductPrice();
                float newPrice = oldPrice + oldPrice * (percentage / 100);
                product.setProductPrice(newPrice);
                System.out.println("Product id: " + id + "\nUpdated price: $" + newPrice);
                break;
            }
        }
        if(!found)
        {
            System.out.println("Product with id " + id + " does not exists!");
        }
    }

    // Phương thức có xử lý Exception: Tìm kiếm sản phẩm theo id
    public void findProduct(int id) throws Exception
    {        
        boolean found = false;
        for (Nhom24_ProductManager product : productList) 
        {
            if(product.getProductID() == id){
                found = true;
                System.out.println("Product found:");
                System.out.println("ID: " + product.getProductID() + ", Name: " + product.getProductName() + ", Category: " + product.getProductCategory() + ", Price: $" + product.getProductPrice());
                break;
            }
        }
        if(!found)
        {
            throw new Exception("Product with id " + id + " does not exists!");
        }
    }
    
    // Nhập sản phẩm
    public void add1Product(int productID, String productName, String productCategory, float productPrice) {
        try {
            // Kiểm tra xem sản phẩm đã tồn tại chưa (theo productID)
            for (Nhom24_ProductManager product : productList) {
                if (product.getProductID() == productID) {
                    throw new IllegalArgumentException("Product with this ID already exists!");
                }
            }

            // Tạo sản phẩm mới và thêm vào danh sách
            Nhom24_ProductManager newProduct = new Nhom24_ProductManager(productID, productName, productCategory, productPrice);
            productList.add(newProduct);
            System.out.println("Product added successfully: " + productName);
        } catch (IllegalArgumentException e) {
            System.out.println("Error adding product: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
    
    // Thêm 1 chuỗi sản phẩm
    public void addProducts()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of added product: ");
        int addNum = scanner.nextInt();
        
        for(int i = 0; i < addNum; i++)
        {
            System.out.println("Product no." + (i + 1));
            
            System.out.println("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter name: ");
            String name = scanner.nextLine();

            System.out.println("Enter category: ");
            String category = scanner.nextLine();

            System.out.println("Enter price: ");
            float price = scanner.nextFloat();
            scanner.nextLine();
            
            add1Product(id, name, category, price);
        }
    }
    
    // Hiển thị danh sách sản phẩm
    public void displayProducts() {
        if (productList.isEmpty()) {
            System.out.println("No products available.");
        } else {
            System.out.println("Product List:");
            for (Nhom24_ProductManager product : productList) {
                System.out.println("ID: " + product.getProductID() + ", Name: " + product.getProductName() + ", Category: " + product.getProductCategory() + ", Price: $" + product.getProductPrice());
            }
        }
    }
}