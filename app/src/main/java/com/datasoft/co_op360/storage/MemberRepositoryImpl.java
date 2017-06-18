package com.datasoft.co_op360.storage;

import com.datasoft.co_op360.domain.model.Member;
import com.datasoft.co_op360.storage.model.DBMember;
import com.datasoft.co_op360.domain.repository.MemberRepository;
import com.datasoft.co_op360.storage.converters.MemberModelConverter;
import com.datasoft.co_op360.storage.model.DBMember_Table;
import com.raizlabs.android.dbflow.sql.language.SQLite;

import java.util.List;

/**
 * Created by mehedi on 6/12/17.
 */

public class MemberRepositoryImpl implements MemberRepository {
    @Override
    public void insert(Member member) {
        DBMember dbMember = MemberModelConverter.convertDomainToStorageModel(member);
        dbMember.save();
    }

    @Override
    public void update(Member member) {
        DBMember dbMember = MemberModelConverter.convertDomainToStorageModel(member);
        dbMember.update();
    }

    @Override
    public Member getMemberById(int id) {
        DBMember dbMember = SQLite
                .select()
                .from(DBMember.class)
                .where(DBMember_Table.id.eq(id))
                .querySingle();

        return MemberModelConverter.convertStorageToDomainModel(dbMember);
    }

    @Override
    public List<Member> getAllMembers() {
        List<DBMember> dbMembers = SQLite
                .select()
                .from(DBMember.class)
                .queryList();

        return MemberModelConverter.convertStorageListToDomainModel(dbMembers);
    }

    @Override
    public List<Member> getAllUnsyncedMembers() {
        return null;
    }

    @Override
    public void markSynced(List<Member> members) {

    }

    @Override
    public void delete(Member member) {
        DBMember dbMember = MemberModelConverter.convertDomainToStorageModel(member);
        dbMember.delete();
    }
}
