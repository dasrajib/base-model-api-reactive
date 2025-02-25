package com.adu.api.repository;

import com.adu.api.model.BaseModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.r2dbc.DataR2dbcTest;
//import org.springframework.context.annotation.Import;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataR2dbcTest
class BaseModelRepositoryTest {
/* 
    @Autowired
    private ProjectRepository projectRepository;

    @BeforeEach
    void setUp() {
        projectRepository.deleteAll().block();
    }

    @Test
    void save_ShouldCreateNewProject_WhenValidInput() {
        Project project = Project.builder()
                .name("Test ADU Name")
                .address("Test Address")
                .status("IN-PROGRESS")
                .build();

        Mono<Project> savedProjectMono = projectRepository.save(project);

        StepVerifier.create(savedProjectMono)
                .assertNext(savedProject -> {
                    assertThat(savedProject.getId()).isNotNull();
                    assertThat(savedProject.getName()).isEqualTo("Test ADU Name");
                    assertThat(savedProject.getAddress()).isEqualTo("Test Address");
                    assertThat(savedProject.getStatus()).isEqualTo("IN-PROGRESS");
                })
                .verifyComplete();
    }

    @Test
    void findById_ShouldReturnProject_WhenProjectExists() {
        Project project = Project.builder()
                .name("Test ADU Name")
                .address("Test Address")
                .status("IN-PROGRESS")
                .build();

        Project savedProject = projectRepository.save(project).block();
        assertThat(savedProject).isNotNull();
        Long projectId = savedProject.getId();

        Mono<Project> foundProjectMono = projectRepository.findById(projectId);

        StepVerifier.create(foundProjectMono)
                .assertNext(foundUser -> {
                    assertThat(foundUser.getId()).isEqualTo(projectId);
                    assertThat(foundUser.getName()).isEqualTo("Test ADU Name");
                })
                .verifyComplete();
    }

    @Test
    void findById_ShouldReturnEmpty_WhenProjectDoesNotExist() {
        Mono<Project> foundProjectMono = projectRepository.findById(999L);

        StepVerifier.create(foundProjectMono)
                .verifyComplete();
    }

    @Test
    void findAll_ShouldReturnAllProjects_WhenProjectsExist() {
        List<Project> projects = Arrays.asList(
                Project.builder().name("Test ADU Name1").address("Test Address1").status("NEW").build(),
                Project.builder().name("Test ADU Name2").address("Test Address2").status("IN-PROGRESS").build(),
                Project.builder().name("Test ADU Name3").address("Test Address3").status("COMPLETE").build()
        );

        projectRepository.saveAll(projects).blockLast();

        Flux<Project> foundProjectsFlux = projectRepository.findAll();

        StepVerifier.create(foundProjectsFlux)
                .expectNextCount(3)
                .verifyComplete();
    }

    @Test
    void findByName_ShouldReturnProject_WhenNameExists() {
        Project project = Project.builder()
                .name("Test ADU Name")
                .address("Test Address")
                .status("IN-PROGRESS")
                .build();

                projectRepository.save(project).block();

        Flux<Project> foundProjectFlux = projectRepository.findByName("Test ADU Name");

        StepVerifier.create(foundProjectFlux)
                .assertNext(foundProject -> {
                    assertThat(foundProject.getName()).isEqualTo("Test ADU Name");
                    assertThat(foundProject.getAddress()).isEqualTo("Test Address");
                    assertThat(foundProject.getStatus()).isEqualTo("IN-PROGRESS");
                })
                .verifyComplete();
    }

    @Test
    void deleteById_ShouldRemoveProject_WhenProjectExists() {
        Project project = Project.builder()
                .name("Test ADU Name")
                .address("Test Address")
                .status("IN-PROGRESS")
                .build();

        Project savedProject = projectRepository.save(project).block();
        assertThat(savedProject).isNotNull();
        Long projectId = savedProject.getId();

        Mono<Void> deleteOperation = projectRepository.deleteById(projectId);

        StepVerifier.create(deleteOperation)
                .verifyComplete();

        // Verify project is deleted
        Mono<Project> findOperation = projectRepository.findById(projectId);
        StepVerifier.create(findOperation)
                .verifyComplete();
    }

    @Test
    void findByStatus_ShouldReturnProjects_WhenStatusExists() {
        List<Project> projects = Arrays.asList(
                Project.builder().name("Test ADU Name1").address("Test Address1").status("NEW").build(),
                Project.builder().name("Test ADU Name2").address("Test Address2").status("IN-PROGRESS").build(),
                Project.builder().name("Test ADU Name3").address("Test Address3").status("COMPLETE").build()
        );

        projectRepository.saveAll(projects).blockLast();

        Flux<Project> projectFlux = projectRepository.findByStatus("IN-PROGRESS");

        StepVerifier.create(projectFlux)
                .expectNextCount(2)
                .verifyComplete();
    }

    @Test
    void update_ShouldUpdateProject_WhenProjectExists() {
        Project project = Project.builder()
                .name("Test ADU Name")
                .address("Test Address")
                .status("IN-PROGRESS")
                .build();

        Project savedProject = projectRepository.save(project).block();
        assertThat(savedProject).isNotNull();

        savedProject.setName("Updated ADU Name");
        Mono<Project> updateOperation = projectRepository.save(savedProject);

        StepVerifier.create(updateOperation)
                .assertNext(updatedProject -> {
                    assertThat(updatedProject.getId()).isEqualTo(savedProject.getId());
                    assertThat(updatedProject.getName()).isEqualTo("Updated ADU Name");
                    assertThat(updatedProject.getAddress()).isEqualTo("Test Address");
                })
                .verifyComplete();
    }
    */
}