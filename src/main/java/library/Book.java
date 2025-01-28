package library;

import java.util.List;

public class Book {
    private final String name;
    private final String author;
    //private Page currentPage; //как будто можно хранить в библиотеке (текущую книгу и ее текущую страницу)
    private final List<Page> pageList;
    private final int ID;
    private static int counter = 0;
    private ReadingStatus readingStatus;
    private int lastReadPage;

    public Book(String name, String author, List<Page> pageList) {
        this.name = name;
        this.author = author;
        this.pageList = pageList;
        //this.currentPage = pageList.get(0);
        this.ID = counter++;
        this.readingStatus = ReadingStatus.inactive;
        this.lastReadPage = 0;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

//    public Page getCurrentPage() {
//        return currentPage;
//    }

    public List<Page> getPageList() {
        return pageList;
    }

    public void setReadingStatus(ReadingStatus readingStatus) {
        this.readingStatus = readingStatus;
    }

    public int getLastReadPage() {
        return lastReadPage;
    }

    public void setLastReadPage(int lastReadPage) {
        this.lastReadPage = lastReadPage;
    }

    //    public void forwardPage(){
//        if (currentPage.getPageNumber() == pageList.size()-1){
//            System.out.println("Страницу вперед не перелистнуть, т.к. данная страница последняя в книге");
//        } else{
//            pageList.get(currentPage.getPageNumber() + 1);
//        }
//    }
//
//    public void backPage(){
//        if (currentPage.getPageNumber() == 1){
//            System.out.println("Данная страница первая в книге");
//        } else{
//            pageList.get(currentPage.getPageNumber() - 1);
//        }
//    }
//
//    public void choosePage(int pageNumber){
//        if (pageNumber >= 1 && pageNumber <= pageList.size()){
//            currentPage.setPageNumber(pageNumber);
//        } else{
//            System.out.println("Указанной страницы не существует!");
//        }
//    }

//    @Override
//    public String toString() {
//        return "Book{" +
//                "name='" + name + '\'' +
//                ", author='" + author + '\'' +
//                '}';
//    }
}
