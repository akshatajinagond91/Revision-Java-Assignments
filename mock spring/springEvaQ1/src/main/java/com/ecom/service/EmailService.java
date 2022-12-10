package com.ecom.service;

import com.ecom.execption.EmailExepction;
import com.ecom.models.Email;

public interface EmailService {
	public Email detailOfEmail(Integer userId,Integer mailId) throws EmailExepction;
	public Email createAEmailforUser(Email email,Integer userId) throws EmailExepction;

}
