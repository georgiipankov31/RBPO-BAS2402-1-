package ru.mtuci.rbpo.lab1.dto;

/**
 * Информация о студенте, которую отдаёт эндпоинт {@code GET /api/student}.
 */
public record StudentInfo(
        String name,
        int age,
        String university,
        String studentId
) {
}
