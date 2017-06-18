package com.datasoft.co_op360.domain.repository;

import com.datasoft.co_op360.domain.model.Member;

import java.util.List;

/**
 * Created by mehedi on 6/12/17.
 */

public interface MemberRepository {

    void insert(Member member);

    void update(Member member);

    Member getMemberById(int id);

    List<Member> getAllMembers();

    List<Member> getAllUnsyncedMembers();

    void markSynced(List<Member> members);

    void delete(Member member);
}
