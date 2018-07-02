package com.jskim216.blog.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jskim216.blog.domain.model.entity.Hello;

public interface HelloDao extends JpaRepository <Hello, Integer> {

}