package tech.hidouding.webone.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import tech.hidouding.webone.entity.Song;
import tech.hidouding.webone.service.SongService;
import tech.hidouding.webone.service.TestService;

@Controller
public class SongController {

    @Autowired
    SongService songService;

    @RequestMapping("/addsong")
    @ResponseBody
    public String addsong(Model model,
                          @RequestParam(value = "title") String title,
                          @RequestParam(value = "author") String author,
                          @RequestParam(value = "duration") int duration
                          )
    {
        Song song = new Song();

        song.title=title;
        song.author=author;
        song.duration=duration;

        int id = songService.addSong(song);
        return "done:"+id;
    }

}
