package passionproject.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import passionproject.model.LevelOneFlashCardQuestions;

@Repository
public interface LevelOneFlashCardRepository extends JpaRepository<LevelOneFlashCardQuestions, Long> {
}
