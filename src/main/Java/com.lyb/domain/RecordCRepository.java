package com.lyb.domain;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface RecordCRepository extends CrudRepository<Record,Long> {
}
