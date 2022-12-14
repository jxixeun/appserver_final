package com.appserver.member;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@RequiredArgsConstructor
class UserServiceTest {
    private final MemberService memberservice;
    private final MemberRepository memberRepository;

    @BeforeEach
    public void beforeEach() {
       // userRepository = new MemoryMemberRepository();
    }

    //given, when, then 문법
    @Test
    void 회원가입() {
        //given
//        Member user = new Member();
//        user.setUsername("user1");
//        user.setEmail("user1@gmail.com");
//        user.setPassword("123456");
//
//        //when
//        memberservice.join(user);
//
//        //then
//        Member findUser = memberservice.findOne(user.getId()).get();
//        assertThat(user.getEmail()).isEqualTo(findUser.getEmail());
    }

    @Test
    public void 중복_회원_예외(){
        //give
//        Member user1 = new Member();
//        user1.setUsername("user1");
//        user1.setEmail("user1@gmail.com");
//        user1.setPassword("123456");
//
//        Member user2 = new Member();
//        user2.setUsername("user1");
//        user2.setEmail("user1@gmail.com");
//        user2.setPassword("123456");
//
//        //when
//        memberservice.join(user1);
//        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberservice.join(user2));
//        assertThat(e.getMessage()).isEqualTo("이미 존재하는 이메일입니다.");
    }
    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}