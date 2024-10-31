package br.com.fiap.iafuture.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private EmailRecommendationConsumer emailRecommendationConsumer;

    @Autowired
    private JavaMailSender mailSender;

    public void sendTestEmail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("f704d5f68c-a46820@inbox.mailtrap.io");
        message.setSubject("Teste de E-mail");
        message.setText("Este é um e-mail de teste enviado pela aplicação!");

        mailSender.send(message);
        System.out.println("E-mail de teste enviado com sucesso!");
    }

    public void sendRecommendationTest() {
        EmailRecommendation emailRecommendation = new EmailRecommendation();
        emailRecommendation.setEmail("f704d5f68c-a46820@inbox.mailtrap.io");
        emailRecommendation.setRecommendation("A Revolução dos Bichos - George Orwell");

        emailRecommendationConsumer.processEmailRecommendation(emailRecommendation);
        System.out.println("E-mail de recomendação de teste enviado com sucesso!");
    }
}
