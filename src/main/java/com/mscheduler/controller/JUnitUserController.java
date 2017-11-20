/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.controller;

import com.mscheduler.model.User;

/**
 *
 * @author Rendra
 * @version 21 November 2017
 * 
 */
public class JUnitUserController {
    public static void main(String[] args) {        
        //class UserController
        UserController userCon = new UserController();
        //method addUser
        //nanti lihat model user
        User usr = new User();
        System.out.println(userCon.addUser(usr));
        
        //method checkLogin
        //email dan pass aku kosongkan dulu
        String email, pass;
        email = "";
        pass = "";
        System.out.println(userCon.checkLogin(email, pass));
        
        //method login
        System.out.println(userCon.login(email, pass).getName());
        
        //method intEditUser
        //untuk ngecek apakah ada user atau tidak yang mau diedit
        System.out.println(userCon.intEditUser(email));
        
        //method editUser
        System.out.println(userCon.editUser(email, usr));
        
        //method userEditAll
        System.out.println(userCon.userEditAll(email, usr));
        
        //method userEditOne
        //nanti ditelurusi lebih lanjut
        String condition = "";
        System.out.println(userCon.userEditOne(email, condition, usr));
        
        //method getUserByEmail
        System.out.println(userCon.getUserByEmail(email).getName());
        
        //method loadUser
        System.out.println(userCon.loadUser().toString());
        
        //method listUser
        System.out.println(userCon.listUser().toString());
        
        //method listUserAll
        System.out.println(userCon.listUsersAll());
        
        //method listUserAll dengan masukkan paramater integer
        System.out.println(userCon.listUserAll(1));
        
        //method delUser
        System.out.println(userCon.delUser(email));
    }
}