package org.samsara.pistachio.mapper;

import org.samsara.pistachio.entity.BookInfo;

import java.util.List;

/**
 * Samsara Pistachio
 * Book info interface
 * @author sczyh30
 */
public interface BookInfoMapper {

    int remove(String isbn);

    int insert(BookInfo book);

    int insertSelective(BookInfo book);

    BookInfo get(String isbn);

    BookInfo getByName(String name);

    List<BookInfo> getAllByAuthor(String author);

    int updateByPrimaryKeySelective(BookInfo record);

    int update(BookInfo record);
}