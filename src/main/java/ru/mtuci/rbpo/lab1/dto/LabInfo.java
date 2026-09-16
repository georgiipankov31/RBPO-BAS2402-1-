package ru.mtuci.rbpo.lab1.dto;

/**
 * Информация о лабораторной работе, которую отдаёт эндпоинт {@code GET /api/lab}.
 */
public record LabInfo(
        int number,
        String title,
        String subject,
        String applicationName
) {
}
