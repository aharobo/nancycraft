package tech.hidouding.webone.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.hidouding.webone.dao.SongMapper;
import tech.hidouding.webone.entity.Song;

@Service
public class SongService {

    @Autowired
    SongMapper songMapper;
    public  int addSong( Song song)
    {
        int id=songMapper.addNewSong(song);
        return id;
    }



}
