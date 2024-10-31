package br.com.fiap.iafuture.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/send-test")
    public String sendTestEmail() {
        emailService.sendTestEmail();
        return "E-mail de teste enviado com sucesso!";
    }

    @GetMapping("/send-recommendation")
    public ResponseEntity<String> sendRecommendationTestEndpoint() {
        emailService.sendRecommendationTest();
        return ResponseEntity.ok("E-mail de recomendação de teste enviado com sucesso!");
    }
}
