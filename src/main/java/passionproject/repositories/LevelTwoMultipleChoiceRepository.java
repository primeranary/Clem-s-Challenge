package passionproject.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import passionproject.model.LevelTwoMultiChoiceQuestions;


@Repository
public interface LevelTwoMultipleChoiceRepository extends JpaRepository<LevelTwoMultiChoiceQuestions, Long> {
}
