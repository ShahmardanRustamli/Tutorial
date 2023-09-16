package user_example;

public class User {
    public String name;
    public String surname;

    @Override
    public String toString() {    // toStringi Override edib fieldleri deyishdik..
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public User(String name, String surname) {
        this.name = "Shaki";
        this.surname = "Rustam";

        }

        public String getName () {
            return name;
        }

        public void setName () {
            this.name = name;
        }

        public String getSurname () {
            return surname;
        }

        public void setSurname () {
            this.surname = surname;
        }

    }

