package com.project.bootcamp.exceptions;

import com.project.bootcamp.util.MessageUtils;
import org.aspectj.bridge.Message;

public class NotFoundException extends RuntimeException {
    public NotFoundException() {
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
