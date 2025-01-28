package library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Нужно спроектировать приложение для чтения книг.
Сущности
1. Библиотека
2. Книги

Взаимодействия
1. Библиотека (отражает только 1 активную книгу + отражает последнюю страницу)
2. Книга помнит последнюю страницу книги

содержание сущностей

Книга:
Поля:
- автор - строка - неизм
- название - строка - неизменно
- Текущая страница (номер) - неизменяем
- Страницы (список страниц) - неизм
- ID (генерируется со Счётчиком) - инт - неизменно
- Счётчик (статик инт) - хранит последнее значение Айди книги - ИЗМЕНЯЕМОЕ или нет??

Методы
- конструктора (автор, название, страницы), при инициализации конструктора Текущая страница = 1
- получить автора, название, текущая страница
- перелистывание страниц вперед (Страница страница)
- перелистывание страниц назад (Страница страница)
- перейти к странице по номеру страницы

Страница:
Поля:
- Текст - строка - неизм
- Номер страницы - Инт - неизменно

Методы:
- конструктор (текст, номер страницы)
- получить текст
- получить номер страницы

Библиотека:
Поля:
- Книги (ArrayList)
- Текущая книга (Книга)

Методы
- Конструктор()
- добавить книгу в библиотеку
- Открыть книгу из списка по названию и автору
- получить активную книгу (активность через ЕНАМ сделать?) bookStatus ACTIVE, INACTIVE?
- Закрыть активную книгу*/

        List<Page> pageList = new ArrayList<>(Arrays.asList(
                new Page("Первая страница книги 1", 1),
                new Page("Вторая страница книги 1", 2),
                new Page("Третья страница книги 1", 3)
        ));

        List<Page> pageList2 = new ArrayList<>(Arrays.asList(
                new Page("Первая страница книги 2", 1),
                new Page("Вторая страница книги 2", 2)
        ));

//        List<Page> pageList = new ArrayList<>();
//        pageList.add(new Page("Hello", 1));
//        pageList.add(new Page("Tommy", 2));
//        pageList.add(new Page("How are you?", 3));

//        List<Page> pageList2 = new ArrayList<>();
//        pageList.add(new Page("Good mo", 1));
//        pageList.add(new Page("Sasha", 2));

//        List<Page> pageList3 = new ArrayList<>();
//        pageList.add(new Page("Good night", 1));
//        pageList.add(new Page("Liza", 2));
//
//        List<Page> pageList4 = new ArrayList<>();
//        pageList.add(new Page("Hi", 1));
//        pageList.add(new Page("Ann", 2));

        Book book1 = new Book("Книга1", "Автор1", pageList);
        Book book2 = new Book("Книга2", "Автор2", pageList2);
//        Book book3 = new Book("Книга3", "Автор3", pageList3);
//        Book book4 = new Book("Книга4", "Автор4", pageList4);

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        //library.addBook(book3);
        //library.addBook(book4);

        library.openBookById(1);
        library.currentBookReader.forwardPage();
        library.currentBookReader.forwardPage();
//        BookReader bookReader = library.getCurrentBookReader();
//        bookReader.forwardPage();
        library.closeCurrentBook();

        library.openBookById(2);
        library.currentBookReader.forwardPage();
        library.closeCurrentBook();

        library.openBookById(1);
        library.currentBookReader.forwardPage();
        //bookReader.forwardPage();


    }
}
