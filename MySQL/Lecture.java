package MySQL;
import lecture.jdbc.fetch.UserWithDepartmentFetcher;
import lecture.MySQL.DatabaseCreationFacade;
import lecture.jdbc.model.Department;
import lecture.jdbc.model.User;
import lecture.jdbc.service.DepartmentService;
import lecture.jdbc.service.UserService;

import java.sql.SQLException;
import java.util.List;

public class Lecture{
        public static void main(String[] args) {
            DatabaseCreationFacade databaseCreationFacade = new DatabaseCreationFacade();
            //after first run -> make it false, to create database -> true
            databaseCreationFacade.createAndInsertDatabase(true);

            UserWithDepartmentFetcher userWithDepartmentFetcher = new UserWithDepartmentFetcher();
            try {
                List<User> userList = userWithDepartmentFetcher.fetchUsersWithDepartments();
                System.out.println(userList);
                UserService userService = new UserService();
                User user = userService.getUserById(1);
                System.out.println(user);
                DepartmentService departmentService = new DepartmentService();
                Department department = departmentService.getDepartmentById(1);
                System.out.println(department);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

