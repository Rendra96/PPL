/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.controller;

/**
 *
 * @author Rendra
 * @version 21 November 2017
 * 
 */
public class JUnitSchedulerController {
    public static void main(String[] args) {
        //class SchedulerController
        SchedulerController schedule = new SchedulerController();
        
        //method runSchedule
        //hanya menjalankan schedule yang sudah dibuat
        System.out.println(schedule.runSchedule(1).toString());
    }
}