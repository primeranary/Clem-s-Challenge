package passionproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import passionproject.model.LevelTwoMultipleChoiceAnswers;

public interface LevelTwoMultipleChoiceAnsRepository extends JpaRepository<LevelTwoMultipleChoiceAnswers, Long> {
}
