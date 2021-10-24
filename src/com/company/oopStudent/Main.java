package com.company.oopStudent;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/*
Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон,
Факультет, Курс, Группа.
Создать массив объектов. Вывести:
a) список студентов заданного факультета;
b) списки студентов для каждого факультета и курса;
c) список студентов, родившихся после заданного года;
d) список учебной группы.
 */

public class Main {

    public static void main(String[] args) throws ParseException {
        List<Student> students = new ArrayList<Student>();
        Student student = new Student("Иван", "Иванов", "ФЭБУ", "Э-62", 1);
        students.add(student);
        String sBirthDate = "02.01.2000";
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date birthDate = dateFormat.parse(sBirthDate);
        student = new Student("Петр", "Петров", "Петрович", birthDate,
                "Московский пр., 72", "+375331111111", "ФЭБУ", "Э-62", 2);
        students.add(student);
        student = new Student("Александр", "Иванов", "ФИТР", "KM-5", 1);
        students.add(student);
        student = new Student("Борис", "Петров", "ФИТР", "И-10", 2);
        students.add(student);
        student = new Student("Владимир", "Соловьев", "ЭФ", "Э-30", 3);
        students.add(student);

        System.out.println("Факультет ФЭБУ");
        for (Student studentTemp : students) {
            if (studentTemp.getFaculty().equals("ФЭБУ"))
                //if ("ФЭБУ".equals(studentTemp.getFaculty())
                System.out.println(studentTemp.toString());
        }

        //Факультеты
        List<String> faculties = new ArrayList<>();
        for (Student studentTemp : students) {
            if (faculties.isEmpty())
                faculties.add(studentTemp.getFaculty());
            else {
                String faculty = studentTemp.getFaculty();
                if (!faculties.contains(faculty))
                    faculties.add(faculty);


            }
        }
        //списки студентов для каждого факультета и курса;
        for (String faculty : faculties) {
            System.out.println(faculty);
            for (int i = 1; i < 6; i++) {
                System.out.println("course:" + i);
                for (Student studentTemp : students)
                    if (studentTemp.getCourse() == i && studentTemp.getFaculty().equals(faculty))
                        System.out.println(studentTemp.toString());
            }


        }
        //Родившиеся после заданного года
        String sDate = "01.01.2000";
        Date date = dateFormat.parse(sDate);
        for (Student studentTemp : students){
            if (studentTemp.getBirthDate()!=null&&studentTemp.getBirthDate().after(date))
                System.out.println("Posle 2000: "+studentTemp.toString());
        }

        //список учебной группы
        for (Student studentTemp : students) {
            if (studentTemp.getGroup().equals("Э-62"))
                //if ("ФЭБУ".equals(studentTemp.getFaculty())
                System.out.println("Group 62: " + studentTemp.toString());
        }



    }
}

class Student {
    private String name;
    private String surname;
    private String patronymic = "";
    private Date birthDate;
    private String address = "";
    private String phone = "";
    private String faculty = "";
    private String group = "";
    private int course;

    public Student(String name, String surname, String patronymic, Date birthDate, String address,
                   String phone, String faculty, String group, int course) {

        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.group = group;
        this.course = course;
    }

    public Student(String name, String surname, String faculty, String group, int course) {

        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.group = group;
        this.course = course;
    }

    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String sBirthDate;

        if (birthDate!=null)
            sBirthDate = dateFormat.format(birthDate);
        else sBirthDate = "";

        String result = String.format("name: %s, surname: %s, patronymic: %s, date of birth: %s, faculty:%s",
                name, surname, patronymic, sBirthDate, faculty);
        return result;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }
}





