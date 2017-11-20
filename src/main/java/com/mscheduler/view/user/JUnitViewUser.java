/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.view.user;

import java.util.Scanner;

/**
 *
 * @author Rendra
 * @version 18 November 2017
 * 
 */
public class JUnitViewUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Test for UserAddViewer.java
        UserAddViewer addViewer = new UserAddViewer();
        System.out.println(addViewer.getText());
        addViewer.handleInput(sc);
        
        //Test for UserDeleteViewer.java
        UserDeleteViewer deleteViewer = new UserDeleteViewer();
        System.out.println(deleteViewer.getText());
        System.out.println(deleteViewer.getText("rendra@email.com"));
        deleteViewer.handleInput(sc, "rendra@email.com");
        
        //Test for UserEditViewer.java
        UserEditViewer editViewer = new UserEditViewer();
        System.out.println(editViewer.getText());
        System.out.println(editViewer.getText("rendra@email.com"));
        editViewer.handleInput(sc, "rendra@email.com");
        
        //Test for UserListViewer.java
        UserListViewer listViewer = new UserListViewer();
        System.out.println(listViewer.getText());
        System.out.println(listViewer.getText(1));
        listViewer.handleInput(sc);
        
        //Test for UserMenuViewer.java
        UserMenuViewer menuViewer = new UserMenuViewer();
        System.out.println(menuViewer.handleInputLogin(sc));
        menuViewer.success("a");
        menuViewer.success("i");
        menuViewer.success("rendra");
        menuViewer.handleInput(sc);
    }
}