package com.datasoft.co_op360.domain.repository;

import com.datasoft.co_op360.domain.model.Employee;

/**
 * Created by mehedi on 6/14/17.
 */

public interface EmployeeRepository {

    void insert(Employee employee);

    void update(Employee employee);

    Employee getEmployeeById(int id);
}
