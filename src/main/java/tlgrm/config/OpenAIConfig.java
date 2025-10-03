package tlgrm.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAIConfig {

   @Value("${custom.OPENAI_API_KEY}")
   private String openapi_secret;

   public String getOpenapi_secret() {
      System.out.println(openapi_secret);
      return openapi_secret;
   }
}
