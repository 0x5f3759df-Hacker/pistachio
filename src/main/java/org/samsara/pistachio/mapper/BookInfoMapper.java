package org.samsara.pistachio.mapper;

import org.samsara.pistachio.entity.BookInfo;

import java.util.List;

/**
 * Samsara Pistachio
 * Book info interface
 * @author sczyh30
 */
public interface BookInfoMapper {

    boolean remove(String isbn);

    boolean insert(BookInfo book);

    int insertSelective(BookInfo book);

    /**
     * Get the book info object by ISBN
     * @param isbn ISBN of the book
     * @return the book info entity
     */
    BookInfo get(String isbn);

    /**
     * Get the book info object by book name
     * @param name name of the book
     * @return the book info entity
     */
    BookInfo getByName(String name);

    /**
     * Get all books by author name
     * @param author name of the author
     * @return list of books
     */
    List<BookInfo> getAllByAuthor(String author);

    /**
     * Get all book names by author name
     * @param author name of the author
     * @return list of book names
     */
    List<String> getAllNameByAuthor(String author);

    /**
     * Get the latest books
     * @return list of books
     */
    List<BookInfo> getLatest();

    /**
     * Get the latest books by limit(n, page)
     * @param num per num
     * @param page page num
     * @return list of books
     */
    List<BookInfo> getLatestLimit(int num, int page);

    int updateByPrimaryKeySelective(BookInfo record);

    boolean update(BookInfo record);

    /**
     * Get book list by book name (vague search)
     * @param vague vague name of the book
     * @return list of books
     */
    List<BookInfo> getAllByVgName(String vague);

    /**
     * Get book list by author name (vague search)
     * @param vague vague name of the author
     * @return list of books
     */
    List<BookInfo> getAllByVgAuthor(String vague);
}