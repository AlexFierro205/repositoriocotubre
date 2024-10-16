package com.report.repository;

import org.springframework.data.repository.CrudRepository;

import com.report.model.Report;

public interface ReportRepository extends CrudRepository<Report, Integer> {

}
