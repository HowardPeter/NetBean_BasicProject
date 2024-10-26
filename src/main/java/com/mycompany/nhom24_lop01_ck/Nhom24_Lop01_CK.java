/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nhom24_lop01_ck;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Nhom24_Lop01_CK {

    public static void main(String[] args) {
        RunClass();
    }
    static void RunClass()
    {
        Nhom24_ProductManager productManager = new Nhom24_ProductManager();
        productManager.addProducts();
        System.out.println("Before update price");
        productManager.displayProducts();
        productManager.updatePrice(1, 50);
        System.out.println("After update price");
        productManager.displayProducts();
//        try {
//            productManager.findProduct(1);
//        } catch (Exception ex) {
//            Logger.getLogger(Nhom24_Lop01_CK.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}
