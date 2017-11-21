/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.controller;

import com.mscheduler.model.DateRange;
import com.mscheduler.model.Invitation;
import com.mscheduler.model.InvitationStatus;
import com.mscheduler.model.LastIndex;
import com.mscheduler.model.Meeting;
import com.mscheduler.model.MeetingStatus;
import com.mscheduler.model.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Rendra
 * @version 21 November 2017
 * 
 */
public class Tester {
    public static void main(String[] args) {        
        //class UserController
        UserController userCon = new UserController();
        //method addUser
        //nanti lihat model user
        User usr = new User();
        User admin = new User();
        admin.setIsAdmin(true);
        System.out.println(userCon.addUser(usr));
        
        //method checkLogin
        //email dan pass aku kosongkan dulu
        String email, pass;
        email = usr.getEmail();
        pass = usr.getPassword();
        System.out.println(userCon.checkLogin(email, pass));
//        
        //method login
        System.out.println(userCon.login(email, pass).getName());
        
        //method intEditUser
        //untuk ngecek apakah ada user atau tidak yang mau diedit
        //System.out.println(userCon.intEditUser(email));
        
        //method editUser
        //System.out.println(userCon.editUser(email, usr));
        
        //method userEditAll
        //System.out.println(userCon.userEditAll(email, usr));
        
        //method userEditOne
        //nanti ditelurusi lebih lanjut
        String condition = email;
        System.out.println(userCon.userEditOne(email, condition, usr));
        
        //method getUserByEmail
        System.out.println(userCon.getUserByEmail(email));
        
        //method loadUser
        System.out.println(userCon.loadUser().toString());
        
        //method listUser
        System.out.println(userCon.listUser().toString());
        
        //method listUserAll
        System.out.println(userCon.listUsersAll());
        
        //method listUserAll dengan masukkan paramater integer
        System.out.println(userCon.listUserAll(1));
        
        //method delUser
        //System.out.println(userCon.delUser(usr.getEmail()));
        
        
        
        //class InvitationController
        InvitationController invite = new InvitationController();
        //method listInvitationView
        //System.out.println(invite.listInvitationView().toString());
        
        //method list Invitation
        List<String> emailList = new ArrayList<String>();
        emailList.add("ihsan@email.com");
        System.out.println(invite.listInvitation(1, emailList).toString());
        
        //method unionDateRange
        List<DateRange> dateList = new ArrayList<DateRange>();
        System.out.println(invite.unionDateRange(dateList));
        
        //method saveInvitations
        List<Invitation> invitations_list = new ArrayList<Invitation>();
        invitations_list.add(new Invitation(1, "Kampus"));
        System.out.println(invite.saveInvitations(invitations_list));
        
        //method rejectInvitation
        //bagian ini manggil 3 method sekaligus
        System.out.println(invite.rejectInvitation(1));
        
        //method isMeetingIdValid
        System.out.println(invite.isMeetingIdValid(1, true));
        System.out.println(invite.isMeetingIdValid(1, false));
        
        //method loadInvitations
        System.out.println(invite.loadInvitations().toString());
        
        
        
        //class MeetingController
        MeetingController meetCon = new MeetingController();
        //method createMeeting
        //nanti lihat model meeting
        int id = 1;
        String title = "Kuliah";
        String agenda = "Kebebasan Mahasiswa dari Tugas";
        String location = "UNPAR";
        int duration = 24;
        DateRange proposed_date_range = null;
        Date negotiation_deadline = null;
        List<String> participants = new ArrayList<String>();
        participants.add("Rendra");
        List<String> important_participants = new ArrayList<String>();
        important_participants.add("Rendra");
        MeetingStatus status = MeetingStatus.running;
        DateRange agreed_time = null;
        boolean pastDeadline = true;
        Meeting meeting = new Meeting(id, title, agenda, location, duration, proposed_date_range, negotiation_deadline, participants, important_participants, status, agreed_time, pastDeadline);
        //System.out.println(meetCon.createMeeting(meeting));
        
        //method listMeeting
        System.out.println(meetCon.listMeeting().toString());
        
        //method detailMeeting
        //masukkan meeting_id
        System.out.println(meetCon.detailMeeting(1));
        
        //method editMeeting
        //System.out.println(meetCon.editMeeting(meeting));
        
        //method updateMeeting
        //nanti cek MeetingStatus.running dan InvitationStatus.waiting
        //System.out.println(meetCon.updateMeeting(meeting, MeetingStatus.running, InvitationStatus.waiting));
        
        //method updateMeetingStatus
        //System.out.println(meetCon.updateMeetingStatus(meeting));
        
        //method updateLastMeetingIndex
        //nanti cek LastIndex
        LastIndex index = new LastIndex(1);
        System.out.println(meetCon.updateLastMeetingIndex(index));
        
        //method listMeetingView
        System.out.println(meetCon.listMeetingView().toString());
        
        //method runScheduler
        //System.out.println(meetCon.runScheduler(1));
        
        //method updateLastMeetingIndex
        //nguji 2 method
        System.out.println(meetCon.updateLastMeetingIndex(meetCon.getLastMeetingIndex()));
        
        //method updateLastInvitationIndex
        //ystem.out.println(meetCon.updateLastInvitationIndex(meetCon.getLastInvitationIndex()));
        
        //method cancelMeeting
        System.out.println(meetCon.cancelMeeting(1));
        
        
        
        //class SchedulerController
        //SchedulerController schedule = new SchedulerController();
        
        //method runSchedule
        //hanya menjalankan schedule yang sudah dibuat
        //System.out.println(schedule.runSchedule(1).toString());
    }
}
