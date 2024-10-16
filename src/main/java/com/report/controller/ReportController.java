package com.report.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.report.model.Report;
import com.report.repository.ReportRepository;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"reports"})
public class ReportController {
	
	@Autowired
	private ReportRepository reportRepository;
	
	@GetMapping("listar")
	public List<Report> listaReports(){
		List<Report> reports = (List<Report>) reportRepository.findAll();
		return reports;
	}
	
	@PostMapping
	public Report addReport (@RequestBody Report report) {
		return reportRepository.save(report);
	}
	
	@GetMapping("/{id}")
	public Optional<Report> getReportById(@PathVariable int id){
		return reportRepository.findById(id);
	}
	
	@PutMapping("/{id}")
	public Report updateReport(@RequestBody Report report, @PathVariable int id) {
		report.setId(id);
		return reportRepository.save(report);
	}
	
	@DeleteMapping("/{id}")
	public void deleteReport(@PathVariable int id) {
		reportRepository.deleteById(id);
	}

}
