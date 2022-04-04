package net.seyfe.waalab04.service;

import net.seyfe.waalab04.domain.Exception;
import net.seyfe.waalab04.repo.ExceptionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class ExceptionServiceImpl implements ExceptionService{

    @Autowired
    ExceptionRepo exceptionRepo;

    @Override
    public void logException(LocalDate date, LocalTime time, String principle, String operation, String exceptionType) {
        Exception exception = new Exception(date, time, principle, operation, exceptionType);
        exceptionRepo.save(exception);
    }
}
