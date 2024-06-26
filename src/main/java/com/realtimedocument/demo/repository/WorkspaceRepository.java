package com.realtimedocument.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.realtimedocument.demo.model.Workspace;

import java.util.List;

@Repository
public interface WorkspaceRepository extends JpaRepository<Workspace, String> {
    List<Workspace> findAllByOrderByNameAsc();
}
