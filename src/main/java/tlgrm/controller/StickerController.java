package tlgrm.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tlgrm.model.Sticker;
import tlgrm.service.StickerService;

@RestController("/sticker")
public class StickerController {

   StickerService stickerService;

   public StickerController(StickerService stickerService) {
      this.stickerService = stickerService;
   }

   @GetMapping
   List<Sticker> generateStickers(String prompt) {
      List<Sticker> stickers = this.stickerService.generateStickers(prompt);
      System.out.println(stickers);
      return stickers;
   }

}
