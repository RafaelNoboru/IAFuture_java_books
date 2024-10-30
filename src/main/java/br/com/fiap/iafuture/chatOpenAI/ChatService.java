package br.com.fiap.iafuture.chatOpenAI;

import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ChatService {

    private final RestTemplate restTemplate = new RestTemplate();

    public ChatService(Environment env) {
        this.API_KEY = env.getProperty("spring.ai.openai.api-key");
    }

    private final String API_KEY;

    public String getCompletion(String prompt) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(API_KEY);

        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("model", "gpt-3.5-turbo");
        requestBody.put("messages", new Object[]{
                Map.of("role", "user", "content", prompt)
        });

        HttpEntity<Map<String, Object>> request = new HttpEntity<>(requestBody, headers);

        try {
            ResponseEntity<Map> response = restTemplate.exchange(
                    "https://api.openai.com/v1/chat/completions",
                    HttpMethod.POST,
                    request,
                    Map.class
            );

            Map<String, Object> responseBody = response.getBody();
            if (responseBody != null && responseBody.containsKey("choices")) {
                Map<String, Object> firstChoice = ((Map<String, Object>) ((List<Object>) responseBody.get("choices")).get(0));
                Map<String, String> message = (Map<String, String>) firstChoice.get("message");
                return message.get("content");
            } else {
                return "Erro: resposta inválida da API.";
            }

        } catch (Exception e) {
            return "Erro ao chamar a API OpenAI: " + e.getMessage();
        }
    }
}
