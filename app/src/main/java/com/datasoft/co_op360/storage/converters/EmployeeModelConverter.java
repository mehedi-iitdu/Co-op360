package com.datasoft.co_op360.storage.converters;

import com.datasoft.co_op360.network.model.RESTEmployee;
import com.datasoft.co_op360.storage.model.DBEmployee;
import com.datasoft.co_op360.domain.model.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 6/13/17.
 */

public class EmployeeModelConverter {

    public static Employee convertRestToDoaminModel(RESTEmployee restEmployee) {

        Employee employee = new Employee();
        employee.setId(restEmployee.getId());

        return employee;
    }

    public static RESTEmployee convertDomainToRestModel(Employee employee) {

        RESTEmployee restEmployee = new RESTEmployee();
        restEmployee.setId(employee.getId());

        return restEmployee;
    }

    public static DBEmployee convertDomainToStorageModel(Employee employee) {

        DBEmployee dbEmployee = new DBEmployee();
        dbEmployee.setId(employee.getId());

        return dbEmployee;
    }

    public static Employee convertStorageToDomainModel(DBEmployee dbEmployee) {

        Employee employee = new Employee();
        employee.setId(dbEmployee.getId());

        return employee;
    }


    public static List<Employee> convertRestListToDoaminModel(List<RESTEmployee> restEmployees) {

        List<Employee> employees = new ArrayList<>();

        for (RESTEmployee restEmployee : restEmployees) {
            employees.add(convertRestToDoaminModel(restEmployee));
        }

        // cleanup
        restEmployees.clear();

        return employees;
    }

    public static List<RESTEmployee> convertDomainListToRestModel(List<Employee> employees) {

        List<RESTEmployee> restEmployees = new ArrayList<>();

        for (Employee employee : employees) {
            restEmployees.add(convertDomainToRestModel(employee));
        }

        // cleanup
        employees.clear();

        return restEmployees;
    }

    public static List<DBEmployee> convertDomainListToStorageModel(List<Employee> employees) {

        List<DBEmployee> dbEmployees = new ArrayList<>();

        for (Employee employee : employees) {
            dbEmployees.add(convertDomainToStorageModel(employee));
        }

        // cleanup
        employees.clear();

        return dbEmployees;
    }


    public static List<Employee> convertStorageListToDomainModel(List<DBEmployee> dbEmployees) {

        List<Employee> employees = new ArrayList<>();

        for (DBEmployee dbEmployee : dbEmployees) {
            employees.add(convertStorageToDomainModel(dbEmployee));
        }

        // cleanup
        dbEmployees.clear();

        return employees;
    }
}
