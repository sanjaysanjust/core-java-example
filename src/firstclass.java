import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Books {
	String name;
	int id;
	int section;
	
	public Books(String name, int id, int section) {
		this.name = name;
		this.id= id;
		this.section= section;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

	@Override
	public String toString() {
		return "Name: " + getName() + "   Id: " + getId() + "   Section:" + getSection();
	}

}

class BookDao{
	
	public List<Books> getBooks(){
		List<Books> bookList =  new ArrayList<>();
		bookList.add(new Books("abc",1,200));
		bookList.add(new Books("def",2,300));
		bookList.add(new Books("jkl",1,400));
		return bookList;
	}
	
}

class MyComparator implements Comparator<Books> {
	
	/*
	 * public List<Books> getBooks() { List<Books> BookListnew= new
	 * BookDao().getBooks(); return BookListnew; }
	 */

	@Override
	public int compare(Books o1, Books o2) {
		// TODO Auto-generated method stub
		return o2.getName().compareTo(o1.getName());
	}

}


class BookService{
	public List<Books> getBooksInSort() {
		List<Books> bookList= new BookDao().getBooks();
		Collections.sort(bookList,new MyComparator());
		return bookList;
	} 
	
	public List<Books> getBooksInSortUsingLambda() {
		List<Books> bookList= new BookDao().getBooks();
		Collections.sort(bookList,(o1,o2)->  o2.getName().compareTo(o1.getName()));
		return bookList;
	} 
}

class firstclass {

	public static void main(String[] args) {
		short val = 129;
		char val1 = 120;
		char val2 = 5;
		System.out.println("Hello Heman, Welcome");

		System.out.println("Books In Shelv");
		System.out.println(new BookService().getBooksInSort());
		
		System.out.println(new BookService().getBooksInSortUsingLambda());
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val1+val2);

	}

}
