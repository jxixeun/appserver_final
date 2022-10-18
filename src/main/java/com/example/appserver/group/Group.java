package com.example.appserver.group;

import com.example.appserver.member.Member;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private Long id;

    private String name;
    private List<Member> members = new ArrayList<Member>();

    public Group(){

    }
    public Group(Long id, String name,List<Member> members) {
        this.id = id;
        this.name = name;
        this.members=members;
    }

}
