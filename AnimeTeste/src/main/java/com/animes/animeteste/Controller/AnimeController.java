package com.animes.animeteste.Controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.animes.animeteste.DateUtil.DateUtil;
import com.animes.animeteste.Domain.Anime;

import antlr.collections.List;

@RestController
@RequestMapping("anime")
/*@Log4j2
@RequiredArgsConstructor
public class AnimeController {
	private final DateUtil dateUtil;
	
	@GetMapping(path = "List")
	public List<Anime> List()
	{ 
		log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
		return List.of(new Anime (name:""), (new Anime(name: ""));
	}

}*/
