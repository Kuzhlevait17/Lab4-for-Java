package ru.kuzhleva.main;

import ru.kuzhleva.errors.ErrorChecker;

public class Main {
    public static void main(String[] args) {
        ErrorChecker errors = new ErrorChecker();

        boolean run;
        int labNumber;

        run = true;
        while (run) {
            System.out.println("""
                    Добро пожаловать!
                    Вы можете выбрать две лабораторные работы:
                    
                     | ---------------------------------------
                     | – Лабораторная работа 3.
                     |
                     | – Лабораторная работа 4.
                     |
                     | – Завершение работы программы 0.
                     | ---------------------------------------
                     
                    Для того, чтобы выбрать лаборатрную работу, напишите
                    её номер (число).
                    """);
            System.out.print("Напишите число - номер лабораторной работы: ");
            labNumber = errors.checkInteger();
            switch (labNumber) {
                case 0: {
                    System.out.println("""
                            Завершение работы....
                            *
                            * *
                            * * *
                            * * * * 
                            * * * * *
                            """);
                    run = false;
                    break;
                }
                case 3: {
                    Main3 main3 = new Main3();
                    main3.show();
                    break;
                }
                case 4: {
                    Main4 main4 = new Main4();
                    main4.show();
                    break;
                }
                default: {
                    System.out.println("Введён неверный номер лабораторной работы.\n");
                    break;
                }
            }
        }
        System.out.println("Работа программы успешно завершена.");
    }
}