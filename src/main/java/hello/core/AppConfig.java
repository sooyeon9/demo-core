package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class AppConfig {

    // member 정보 저장 방법: 메모리
    private MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    // member service 에 필요한 기능: member 조회/저장
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    // order service 에 필요한 기능: member 조회/저장, discount
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    // discount 정책: 고정 할인
    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }
}
