package com.lyb.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface RecordCRepository extends JpaRepository<Record,Long> {
}
