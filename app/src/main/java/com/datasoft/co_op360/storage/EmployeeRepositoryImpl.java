package com.datasoft.co_op360.storage;

import com.datasoft.co_op360.domain.repository.EmployeeRepository;
import com.datasoft.co_op360.storage.model.DBEmployee;
import com.datasoft.co_op360.domain.model.Employee;
import com.datasoft.co_op360.storage.converters.EmployeeModelConverter;
import com.datasoft.co_op360.storage.model.DBEmployee_Table;
import com.raizlabs.android.dbflow.sql.language.SQLite;

/**
 * Created by mehedi on 6/14/17.
 */

public class EmployeeRepositoryImpl implements EmployeeRepository {
    @Override
    public void insert(Employee employee) {
        DBEmployee dbEmployee = EmployeeModelConverter.convertDomainToStorageModel(employee);
        dbEmployee.save();
    }

    @Override
    public void update(Employee employee) {
        DBEmployee dbEmployee = EmployeeModelConverter.convertDomainToStorageModel(employee);
        dbEmployee.update();
    }

    @Override
    public Employee getEmployeeById(int id) {
        DBEmployee dbEmployee = SQLite
                .select()
                .from(DBEmployee.class)
                .where(DBEmployee_Table.id.eq(String.valueOf(id)))
                .querySingle();

        return EmployeeModelConverter.convertStorageToDomainModel(dbEmployee);
    }
}
