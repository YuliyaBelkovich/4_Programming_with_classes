package by.epam.javaIntro.simpleClass;

public class Student {

    /*Создайте класс с именем Student,
     * содержащий поля: фамилия и инициалы, номер группы,
     * успеваемость (массив из пяти элементов).
     * Создайте массив из десяти элементов такого типа.
     * Добавьте возможность вывода фамилий и номеров
     * групп студентов,
     * имеющих оценки, равные только 9 или 10.
     */


    private String surname;
    private String name;
    private String numGroup;
    private int [] academicPerformance;


    public Student(String surname, String name, String numGroup, int[] academicPerformance) {
        super();
        this.surname = surname;
        this.name = name;
        this.numGroup = numGroup;
        this.academicPerformance = academicPerformance;
    }

    public static void excellentStudent(Student [] student) {

        System.out.println("Students with excellent grades: ");

        for(Student element: student) {

            boolean isGreat= false;
            for (int grade: element.academicPerformance) {
                if(grade>=9) {
                    isGreat = true;
                } else {
                    isGreat = false;
                    break;
                }
            }

            if(isGreat) {
                System.out.println("Surname: "+element.surname+" Name: "+element.name+" Group: "+element.numGroup);
            }
        }
    }


    public static void main(String[]args) {

        Student [] student = new Student[10];
        int [] grades = {9,9,9,10,10};
        student [0] = new Student("Белькович","Юлия","7510",grades);
        int [] grades1 = {9,8,9,8,7};
        student [1] = new Student("Книга","Александра","7510",grades1);
        int [] grades2 = {8,8,9,8,10};
        student [2] = new Student("Костюкович","Елена","7510",grades2);
        int [] grades3 = {9,10,9,10,10};
        student [3] = new Student("Реут","Ксения","7510",grades3);
        int [] grades4 = {7,6,8,8,8};
        student [4] = new Student("Левченко","Татьяна","7510",grades4);
        int [] grades5 = {5,4,4,5,6};
        student [5] = new Student("Русинович","Глеб","7510",grades5);
        int [] grades6 = {4,4,4,5,4};
        student [6] = new Student("Хассек","Нора","7510",grades6);
        int [] grades7 = {4,4,4,5,4};
        student [7] = new Student("Эль-Абдалла","Омар","7510",grades7);
        int [] grades8 = {4,4,4,5,4};
        student [8] = new Student("Мохаммади","Мортеза","7510",grades8);
        int [] grades9 = {4,4,4,5,4};
        student [9] = new Student("Альдар","Мехди","7510",grades9);

        Student.excellentStudent(student);
    }
}

