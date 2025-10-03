package tlgrm.service;

import org.springframework.stereotype.Service;

import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.core.JsonSchemaLocalValidation;
import com.openai.models.ChatModel;
import com.openai.models.images.ImageCreateVariationParams;
import com.openai.models.responses.Response;
import com.openai.models.responses.ResponseCreateParams;
import com.openai.models.responses.ResponseItem;
import com.openai.models.responses.Tool;

import net.fellbaum.jemoji.Emoji;
import net.fellbaum.jemoji.Emojis;
import tlgrm.config.OpenAIConfig;
import tlgrm.model.Sticker;

@Service
public class ChatGPTService {

   OpenAIConfig openAPIConfig;
   OpenAIClient client;

   public ChatGPTService(OpenAIConfig openAPIConfig) {
      this.openAPIConfig = openAPIConfig;
      this.client = OpenAIOkHttpClient.builder().apiKey(openAPIConfig.getOpenapi_secret()).build();
   }

   public Sticker generateStickers(String prompt) {
      Emoji emoji = Emojis.THUMBS_UP;
      String emojiName = emoji.getEmoji();
      System.out.println(emojiName);
      var params = ResponseCreateParams.builder()
            .input("Generate a telegram sticker for topic '%s' according to sticker '%s'".formatted(prompt, emojiName))
            .model(ChatModel.GPT_5)
            .addTool(Tool.ImageGeneration.class, JsonSchemaLocalValidation.NO)
            .build();

      Response response = client.responses().create(params);

      System.out.println(response);
      System.out.println(response._additionalProperties());
      System.out.println(response.output());
      return null;
   }
}
