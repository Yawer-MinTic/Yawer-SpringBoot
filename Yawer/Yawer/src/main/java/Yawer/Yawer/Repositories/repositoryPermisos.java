package Yawer.Yawer.Repositories;


import Yawer.Yawer.Domains.entityPermisos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoryPermisos extends JpaRepository<entityPermisos, Long> {
}
