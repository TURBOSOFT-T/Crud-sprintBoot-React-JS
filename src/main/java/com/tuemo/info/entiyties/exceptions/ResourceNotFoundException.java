package com.tuemo.info.entiyties.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException {
	
	private static final long serialVersionUID = 1;

    public ResourceNotFoundException(String message) {
        super();
    }

}
