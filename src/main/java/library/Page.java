package library;

public class Page {
    private String text;
    private int pageNumber;

    public Page(String text, int pageNumber) {
        this.text = text;
        this.pageNumber = pageNumber;
    }

    public String getText() {
        return text;
    }

    public int getPageNumber() {
        return pageNumber;
    }

//    public void setPageNumber(int pageNumber) {
//        this.pageNumber = pageNumber;
//    }
//
//    @Override
//    public String toString() {
//        return "Page{" +
//                "pageNumber=" + pageNumber +
//                ", text='" + text + '\'' +
//                '}';
//    }
}
