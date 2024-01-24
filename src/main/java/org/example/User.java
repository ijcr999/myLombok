package org.example;

//@NoArgsConstructor

public class User {


    //    @NonNull
    private int age2;
    private int age1;
    private int age4;
    private int age3;
    private int age5;
    private int age8;
    private int age0;
    private int age9;
    private int age6;
    private String name;
    private String lastName;

    public User(int age2, int age1, int age4, int age3, int age5, int age8, int age0, int age9, int age6, String name, String lastName) {
        this.age2 = age2;
        this.age1 = age1;
        this.age4 = age4;
        this.age3 = age3;
        this.age5 = age5;
        this.age8 = age8;
        this.age0 = age0;
        this.age9 = age9;
        this.age6 = age6;
        this.name = name;
        this.lastName = lastName;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public static class UserBuilder {
        private int age2;
        private int age1;
        private int age4;
        private int age3;
        private int age5;
        private int age8;
        private int age0;
        private int age9;
        private int age6;
        private String name;
        private String lastName;

        UserBuilder() {
        }

        public UserBuilder age2(int age2) {
            this.age2 = age2;
            return this;
        }

        public UserBuilder age1(int age1) {
            this.age1 = age1;
            return this;
        }

        public UserBuilder age4(int age4) {
            this.age4 = age4;
            return this;
        }

        public UserBuilder age3(int age3) {
            this.age3 = age3;
            return this;
        }

        public UserBuilder age5(int age5) {
            this.age5 = age5;
            return this;
        }

        public UserBuilder age8(int age8) {
            this.age8 = age8;
            return this;
        }

        public UserBuilder age0(int age0) {
            this.age0 = age0;
            return this;
        }

        public UserBuilder age9(int age9) {
            this.age9 = age9;
            return this;
        }

        public UserBuilder age6(int age6) {
            this.age6 = age6;
            return this;
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public User build() {
            return new User(this.age2, this.age1, this.age4, this.age3, this.age5, this.age8, this.age0, this.age9, this.age6, this.name, this.lastName);
        }

        public String toString() {
            return "User.UserBuilder(age2=" + this.age2 + ", age1=" + this.age1 + ", age4=" + this.age4 + ", age3=" + this.age3 + ", age5=" + this.age5 + ", age8=" + this.age8 + ", age0=" + this.age0 + ", age9=" + this.age9 + ", age6=" + this.age6 + ", name=" + this.name + ", lastName=" + this.lastName + ")";
        }
    }
}
