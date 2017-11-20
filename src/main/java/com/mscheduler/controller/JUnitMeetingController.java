/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.controller;

import com.mscheduler.model.InvitationStatus;
import com.mscheduler.model.LastIndex;
import com.mscheduler.model.Meeting;
import com.mscheduler.model.MeetingStatus;

/**
 *
 * @author Rendra
 * @version 21 November 2017
 * 
 */
public class JUnitMeetingController {
    public static void main(String[] args) {
        //class MeetingController
        MeetingController meetCon = new MeetingController();
        //method createMeeting
        //nanti lihat model meeting
        Meeting meeting = new Meeting();
        System.out.println(meetCon.createMeeting(meeting));
        
        //method listMeeting
        System.out.println(meetCon.listMeeting().toString());
        
        //method detailMeeting
        //masukkan meeting_id
        System.out.println(meetCon.detailMeeting(1));
        
        //method editMeeting
        System.out.println(meetCon.editMeeting(meeting));
        
        //method updateMeeting
        //nanti cek MeetingStatus.running dan InvitationStatus.waiting
        System.out.println(meetCon.updateMeeting(meeting, MeetingStatus.running, InvitationStatus.waiting));
        
        //method updateMeetingStatus
        System.out.println(meetCon.updateMeetingStatus(meeting));
        
        //method updateLastMeetingIndex
        //nanti cek LastIndex
        LastIndex index = null;
        System.out.println(meetCon.updateLastMeetingIndex(index));
        
        //method listMeetingView
        System.out.println(meetCon.listMeetingView().toString());
        
        //method runScheduler
        System.out.println(meetCon.runScheduler(1));
        
        //method updateLastMeetingIndex
        //nguji 2 method
        System.out.println(meetCon.updateLastMeetingIndex(meetCon.getLastMeetingIndex()));
        
        //method updateLastInvitationIndex
        System.out.println(meetCon.updateLastInvitationIndex(meetCon.getLastInvitationIndex()));
        
        //method cancelMeeting
        System.out.println(meetCon.cancelMeeting(1));
    }
}