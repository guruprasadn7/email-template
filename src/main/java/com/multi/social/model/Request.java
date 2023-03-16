package com.multi.social.model;

import com.multi.social.enums.ApprovalStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Request {
    Long id;
    String description;
    Date approvalDate;
    ApprovalStatus approvalStatus;
    String approvalComments;
    List<Conditions> conditions;
}
