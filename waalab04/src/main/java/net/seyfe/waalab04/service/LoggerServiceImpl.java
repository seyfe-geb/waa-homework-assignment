package net.seyfe.waalab04.service;

import net.seyfe.waalab04.domain.Logger;
import net.seyfe.waalab04.repo.LoggerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoggerServiceImpl implements LoggerService{
    @Autowired
    LoggerRepo loggerRepo;

    @Override
    public void saveLog(Logger logger) {
        loggerRepo.save(logger);
    }
}
