package com.spring.restful.custom.service;

import com.spring.restful.custom.pojo.Message;

import java.util.List;

public interface MessageService {
    List<Message> findAll();

    Message findOne(Long id);

    Message save(Message message);

    void delete(Long id);

    Message update(Message message);

    Message updateText(Message message);
}
