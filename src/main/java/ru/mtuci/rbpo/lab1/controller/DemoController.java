package ru.mtuci.rbpo.lab1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mtuci.rbpo.lab1.dto.LabInfo;
import ru.mtuci.rbpo.lab1.dto.StudentInfo;

@RestController
@RequestMapping("/api")
public class DemoController {

    private final String applicationName;

    public DemoController(@Value("${spring.application.name}") String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * Первый эндпоинт: возвращает JSON с информацией о студенте.
     */
    @GetMapping("/student")
    public StudentInfo student() {
        return new StudentInfo("Георгий", 20, "МТУСИ", applicationName);
    }

    /**
     * Второй эндпоинт: возвращает JSON с информацией о лабораторной работе.
     */
    @GetMapping("/lab")
    public LabInfo lab() {
        return new LabInfo(1, "Подготовка репозитория", "РБПО", applicationName);
    }

}
