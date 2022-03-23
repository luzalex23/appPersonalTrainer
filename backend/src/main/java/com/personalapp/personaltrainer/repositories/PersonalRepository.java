package com.personalapp.personaltrainer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personalapp.personaltrainer.entities.Personal;

public interface PersonalRepository extends JpaRepository <Personal, Long> {

}
