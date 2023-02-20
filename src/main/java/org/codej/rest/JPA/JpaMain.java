package org.codej.rest.JPA;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        // 엔티티 매너지 팩토리생성
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");
        //엔티티 매니저 생성
        EntityManager em = emf.createEntityManager();
        //트랜잭션 기능 획득
        EntityTransaction tx = em.getTransaction();

        try {
            // JPA 를 사용하면 항상 트랜잭션 안에서 데이터를 변경해야합니다. 트랜잭션이 없을 경우에는 예외가 발생
            tx.begin(); // 트랜잭션 시작
            /** 비즈니스로직 시작*/
            String username = "LeeA0";
            Member member = new Member();
            member.setId(1L);
            member.setUsername(username);
            member.setAge(28);
            // 등록
            em.persist(member);
            // 수정
            member.setAge(26);;
            // 한건 조회
            Member findMember = em.find(Member.class, 1L);

            // 목록조회
            List<Member> members = em.createQuery("select m from Member m", Member.class).getResultList();

            // 삭제
            em.remove(member);
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        } finally {
            // 마지막으로 사용이 끝난 엔티티 매니저는 반드시 종료해야한다. 애플리케이션을 종료할떄도 종료해야함
            em.close();
        }
        emf.close();
    }
}
