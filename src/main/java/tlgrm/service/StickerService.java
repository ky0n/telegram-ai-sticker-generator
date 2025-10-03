package tlgrm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tlgrm.model.Sticker;

@Service
public class StickerService {

   ChatGPTService chatGPTService;

   public StickerService(ChatGPTService chatGPTService) {
      this.chatGPTService = chatGPTService;
   }

   public List<Sticker> generateStickers(String prompt) {
      var sticker = chatGPTService.generateStickers(prompt);
      return List.of(sticker);
   }

}
