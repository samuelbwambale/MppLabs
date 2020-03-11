package lab9_streams.prob1.dataaccess;

import java.util.HashMap;

import lab9_streams.prob1.business.Book;
import lab9_streams.prob1.business.LibraryMember;


public interface DataAccess { 
	public HashMap<String,Book> readBooksMap();
	public HashMap<String,User> readUserMap();
	public HashMap<String, LibraryMember> readMemberMap();
}
