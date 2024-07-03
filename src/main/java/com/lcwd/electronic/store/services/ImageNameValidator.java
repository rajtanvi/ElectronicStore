package com.lcwd.electronic.store.services;

import jakarta.validation.Constraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class ImageNameValidator  implements ConstraintValidator<ImageNameValid,String>
{
   private Logger logger = LoggerFactory.getLogger(ImageNameValidator.class);
    @Override
    public boolean isValid(String value, ConstraintValidatorContext Context) {

        logger.info("Message from isValid : {} ", value);
        //logic
        if (value.isBlank()){
            return  false;
        }else {
            return true;
        }

    }
}
