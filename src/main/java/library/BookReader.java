package library;

public class BookReader {

    private Book book;
    private int currentPageIndex;

    public BookReader(Book book) {
        this.book = book;
        this.currentPageIndex = book.getLastReadPage();
    }

    public Book getBook() {
        return book;
    }

    public int getCurrentPageIndex() {
        return currentPageIndex;
    }

    public String getCurrentPageText(){
        return  book.getPageList().get(currentPageIndex).getText();
    }


    public void displayCurrentPage(){
        Page currentPage = book.getPageList().get(currentPageIndex);
        System.out.println("Страница " + currentPage.getPageNumber() + ": " + currentPage.getText());
    }

    public void forwardPage(){
        if (currentPageIndex < book.getPageList().size()-1){
            currentPageIndex++;
            displayCurrentPage();
        } else{
            System.out.println("Вы на последней странице");
        }
    }

    public void backPage(){
        if (currentPageIndex > 0){
            currentPageIndex--;
            displayCurrentPage();
        } else{
            System.out.println("Вы на первой странице");
        }
    }

    public void choosePage(int pageNumber){
        if (pageNumber >= 0 && pageNumber < book.getPageList().size()){
            currentPageIndex = pageNumber;
            displayCurrentPage();
        } else{
            System.out.println("Указанной страницы не существует!");
        }
    }

    public void savePage(){
        book.setLastReadPage(currentPageIndex);
    }
}
