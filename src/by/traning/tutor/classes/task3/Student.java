package by.traning.tutor.classes.task3;

import java.util.Random;

//Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
// из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
// номеров групп студентов, имеющих оценки, равные только 9 или 10
public class Student {

    String surname;
    String initials;
    int numberGroup;
    int[] grades;
    int nGrades;

    public Student(String surname, String initials, int numberGroup) {
        this.surname = surname;
        this.initials = initials;
        this.numberGroup = numberGroup;
        this.grades = new int[5];
        this.nGrades = 0;
    }

    boolean addGrade(int grade) {
        if (nGrades >= 5) {
            return false;
        }
        grades[nGrades] = grade;
        nGrades++;
        return true;
    }

    boolean isGood() {
        for (int i = 0; i < nGrades; ++i) {
            if (grades[i] == 9 || grades[i] == 10) {
                return true;
            }
        }
        return false;
    }

    void print() {
        System.out.print(surname + " " + initials + "," + " Номер группы  " + numberGroup + "," + " Оценки:");
        for (int i = 0; i < nGrades; ++i)
            System.out.print(grades[i] + " ");
        System.out.print("\n");
    }

    public static void main(String[] args) {
        int n = 10;
        Student student[] = new Student[n];
        student[0] = new Student("Петров", "А.В", 33);
        student[1] = new Student("Иванов", "А.Е.", 31);
        student[2] = new Student("Крылов", "Ф.П", 33);
        student[3] = new Student("Евтушенко", "Ф.Л", 36);
        student[4] = new Student("Горький", "С.В", 32);
        student[5] = new Student("Авдеев", "К.И", 34);
        student[6] = new Student("Демищик", "Ф.О", 35);
        student[7] = new Student("Гагарин", "А.И", 34);
        student[8] = new Student("Терешко", "Д.В", 36);
        student[9] = new  Student("Корнелюк", "С.Г", 31);

        Random rnd = new Random();
        for (int i = 0; i < student.length; ++i) {
            student[i].addGrade(rnd.nextInt(11));
            student[i].addGrade(rnd.nextInt(11));
        }
        System.out.println("все студенты: ");
        for (int i = 0; i < student.length; ++i) {
            student[i].print();
        }
        System.out.print("\n");
        System.out.println("хорошие студенты: ");
        System.out.print("\n");
        for (int i = 0; i < student.length; ++i) {
            if (student[i].isGood()){
                student[i].print();
            }
        }
    }
}
