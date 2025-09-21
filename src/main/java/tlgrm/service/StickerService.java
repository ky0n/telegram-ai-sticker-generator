package tlgrm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tlgrm.config.OpenAPIConfig;
import tlgrm.model.Sticker;

@Service
public class StickerService {

   OpenAPIConfig openAPIConfig;

   public StickerService(OpenAPIConfig openAPIConfig) {
      this.openAPIConfig = openAPIConfig;
   }

   public List<Sticker> generateStickers() {
      System.out.println(openAPIConfig.getOpenapi_secret());
      return null;
   }

}
