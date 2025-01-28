package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    //private Book currentBook;
    //private Page currentPage;
    private List<Book> bookList;
    public BookReader currentBookReader;

    public Library() {
        this.bookList = new ArrayList<>();
        this.currentBookReader = null;
    }

    public void addBook(Book book){
        bookList.add(book);
        System.out.println("Книга \"" + book.getName() + "\" добавлена в библиотеку");
    }

    public void openBookById(int id){
        boolean bookFound = false;

        for(Book book: bookList){
            if (book.getID() == id-1){
                //закрываем текущую книгу
                if(currentBookReader != null){
                    currentBookReader.savePage();//сохраняем текущую страницу
                    book.setReadingStatus(ReadingStatus.inactive); //закрываем после сохранения текущей страницы книги
                }
                //открываем новую книгу
                currentBookReader = new BookReader(book);
                book.setReadingStatus(ReadingStatus.active);
                System.out.println("Открыта книга (текущая книга): " + currentBookReader.getBook().getName() + ", автор: " + currentBookReader.getBook().getAuthor());
                currentBookReader.displayCurrentPage();
                bookFound = true;
            }
        }

        if(!bookFound){
            System.out.println("Книга с id " + id + " не найдена");
        }
    }

    public void closeCurrentBook(){
        if(currentBookReader != null){
            currentBookReader.savePage();
            currentBookReader.getBook().setReadingStatus(ReadingStatus.inactive);
            System.out.println("Закрыта книга: " + currentBookReader.getBook().getName() + ", автор: " + currentBookReader.getBook().getAuthor());
            currentBookReader = null;
        } else{
            System.out.println("Нет открытой книги");
        }
    }

    public BookReader getCurrentBookReader() {
        return currentBookReader;
    }
//
//    public Book getCurrentBook(){
//        return currentBook;
//    }


}
