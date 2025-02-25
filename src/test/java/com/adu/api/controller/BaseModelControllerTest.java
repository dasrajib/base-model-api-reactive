package com.adu.api.controller;

import com.adu.api.model.BaseModel;
import com.adu.api.service.BaseModelService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@WebFluxTest(BaseModelController.class)
@ExtendWith(SpringExtension.class)
class BaseModelControllerTest {

    @Autowired
    private WebTestClient webClient;

    @Mock
    private BaseModelService projectService;
/* 
    @Test
    void getAllProjects_ShouldReturnProjects_WhenProjectsExist() {
        Project project = Project.builder()
                .id(1L)
                .name("Test ADU Name")
                .address("Test Address")
                .status("IN-PROGRESS")
                .build();

        when(projectService.getAllProjects()).thenReturn(Flux.just(project));

        webClient.get()
                .uri("/api/projects")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON)
                .expectBodyList(Project.class)
                .hasSize(1)
                .contains(project);
    }

    @Test
    void getAllProjects_ShouldReturnEmptyList_WhenNoProjectsExist() {
        when(projectService.getAllProjects()).thenReturn(Flux.empty());

        webClient.get()
                .uri("/api/projects")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType(MediaType.APPLICATION_JSON)
                .expectBodyList(Project.class)
                .hasSize(0);
    }

    @Test
    void createProject_ShouldReturnSavedProject_WhenValidInput() {
        Project project = Project.builder()
                .name("Test ADU Name")
                .address("Test Address")
                .status("IN-PROGRESS")
                .build();

        Project savedProject = Project.builder()
                .id(1L)
                .name("Test ADU Name")
                .address("Test Address")
                .status("IN-PROGRESS")
                .build();

        when(projectService.createProject(any(Project.class))).thenReturn(Mono.just(savedProject));

        webClient.post()
                .uri("/api/projects")
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(project)
                .exchange()
                .expectStatus().isCreated()
                .expectHeader().contentType(MediaType.APPLICATION_JSON)
                .expectBody(Project.class)
                .isEqualTo(savedProject);
    }

    @Test
    void createProject_ShouldReturnBadRequest_WhenInvalidInput() {
        Project invalidProject = Project.builder()
                .name("invalid-name")
                .build();

        webClient.post()
                .uri("/api/projects")
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(invalidProject)
                .exchange()
                .expectStatus().isBadRequest();
    }

    @Test
    void createProject_ShouldReturnServerError_WhenServiceFails() {
        Project project = Project.builder()
                .name("Test ADU Name")
                .address("Test Address")
                .status("IN-PROGRESS")
                .build();

        when(projectService.createProject(any(Project.class))).thenReturn(Mono.error(new RuntimeException("Service error")));

        webClient.post()
                .uri("/api/projects")
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(project)
                .exchange()
                .expectStatus().is5xxServerError();
    }
                */
}