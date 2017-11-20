/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.controller;

import com.mscheduler.model.DateRange;
import com.mscheduler.model.Invitation;
import java.util.List;

/**
 *
 * @author Rendra
 * @version 21 November 2017
 * 
 */
public class JUnitInvitationController {
    public static void main(String[] args) {
        //class InvitationController
        InvitationController invite = new InvitationController();
        //method listInvitationView
        System.out.println(invite.listInvitationView().toString());
        
        //method list Invitation
        List<String> emailList = null; //aku lupa cara ngisi list cara manual
        System.out.println(invite.listInvitation(1, emailList).toString());
        
        //method unionDateRange
        List<DateRange> dateList = null;//kalo ini aku belum paham mau diisi apa
        System.out.println(invite.unionDateRange(dateList));
        
        //method acceptInvitation
        System.out.println(invite.acceptInvitation(1, dateList)); //ini perlu di cek atau engga
        
        //method rejectInvitation
        //bagian ini manggil 3 method sekaligus
        System.out.println(invite.rejectInvitation(1));
        
        //method isMeetingIdValid
        System.out.println(invite.isMeetingIdValid(1, true));
        System.out.println(invite.isMeetingIdValid(1, false));
        
        //method loadInvitations
        System.out.println(invite.loadInvitations().toString());
        
        //method saveInvitations
        List<Invitation> invitations_list = null;
        System.out.println(invite.saveInvitations(invitations_list));
    }
}