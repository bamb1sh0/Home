package com.company.Nested;

public class Nested {
    public static void main(String[] args) {
        Person person = new Person("Alexey");
        person.setAccount("pass");


    }
}

class Person{
    private String name;

    Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    class Account{
        private String password;

        Account(String password){
            this.password = password;
        }
        void display(){
            System.out.println("Account "+name+" "+"password "+password);
        }
    }
    public void setAccount(String password){
        class Account{
            private String password;

            Account(String password){
                this.password = password;
            }
            void display(){
                System.out.println("Account: "+name+" "+"password: "+password);
            }
        }
        Account account = new Account(password);
        account.display();

    }
}

