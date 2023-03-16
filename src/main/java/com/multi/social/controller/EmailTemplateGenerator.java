package com.multi.social.controller;

import com.multi.social.enums.ApprovalStatus;
import com.multi.social.model.Conditions;
import com.multi.social.model.EmailTemplate;
import com.multi.social.model.Request;
import com.multi.social.model.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/")
public class EmailTemplateGenerator {
    @GetMapping
    public String getEmailTemplate(Model model) {

        UserForm userForm = new UserForm("John");
        Request request = new Request();
        request.setId(3214568L);
        request.setDescription("This is a demo description to test the email template");
        request.setApprovalDate(new Date());
        request.setApprovalStatus(ApprovalStatus.APPROVED);
        request.setApprovalComments("Approved");

        Conditions condition1 = new Conditions("Read condition 2");
        Conditions condition2 = new Conditions("Read condition 7");
        Conditions condition3 = new Conditions("Oops there is no condition 7");
        request.setConditions(List.of(condition1,condition2,condition3));
        EmailTemplate emailTemplate = new EmailTemplate(userForm, request);
        model.addAttribute("email", emailTemplate);
        return "email";
    }
}
