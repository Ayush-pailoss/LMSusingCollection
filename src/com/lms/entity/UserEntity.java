package com.lms.entity;

import javax.management.relation.Role;

public class UserEntity {
  public enum Role{
        ADMIN,STUDENT
    }
    public  enum User {
        ADMIN("admin", "1", Role.ADMIN),
        STUDENT("student", "1", Role.STUDENT);
        String email;
        String password;
        Role role;

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Role getRole() {
            return role;
        }

        public void setRole(Role role) {
            this.role = role;
        }

        User(String email, String password, Role role) {
            this.email = email;
            this.password = password;
            this.role = role;
        }

    }
}
