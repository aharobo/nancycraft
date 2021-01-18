package tech.hidouding.webone.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tech.hidouding.webone.entity.Song;

@Mapper
public interface SongMapper {
//    public boolean addASong(
//            @Param("title") String title,
//            @Param("author") String author,
//            @Param("duration") int duration);
    public int addNewSong(Song song);
}
