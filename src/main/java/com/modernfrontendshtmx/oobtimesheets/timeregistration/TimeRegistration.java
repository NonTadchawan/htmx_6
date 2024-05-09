package com.modernfrontendshtmx.oobtimesheets.timeregistration;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Objects;

public class TimeRegistration {
    private int projectId;
    private LocalDate date;
    private Duration duration;

    public TimeRegistration(int projectId, LocalDate date, Duration duration) {
        this.projectId = projectId;
        this.date = date;
        this.duration = duration;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeRegistration that = (TimeRegistration) o;
        return projectId == that.projectId && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, date);
    }
}
