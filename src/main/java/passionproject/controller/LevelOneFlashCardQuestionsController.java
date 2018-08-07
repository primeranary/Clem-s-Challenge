package passionproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import passionproject.model.LevelOneFlashCardQuestions;
import passionproject.repositories.LevelOneFlashCardRepository;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = {"http://localhost:8100","http://localhost:8080"})
@RestController
public class LevelOneFlashCardQuestionsController {

    @Autowired
    LevelOneFlashCardRepository questionsRepository;

    @RequestMapping(value = "/easy", method = RequestMethod.POST)
    public ResponseEntity<?> createQuestion(@RequestBody LevelOneFlashCardQuestions questions) {
        questions = questionsRepository.save(questions);
        return new ResponseEntity<>(questions, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/easy/{questionId}", method = RequestMethod.GET)
    public ResponseEntity<?> getQuestion(@PathVariable Long questionId) {
        Optional<LevelOneFlashCardQuestions> q = questionsRepository.findById(questionId);
        return new ResponseEntity<>(q,HttpStatus.OK);

    }

    @RequestMapping(value = "/easy/{questionId}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateQuestion(@RequestBody LevelOneFlashCardQuestions questions) {
        LevelOneFlashCardQuestions q = questionsRepository.save(questions);
        return new ResponseEntity<>(q,HttpStatus.OK);
    }

    @RequestMapping(value = "/easy/{questionId}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteQuestion(@PathVariable LevelOneFlashCardQuestions questionId) {
        questionsRepository.delete(questionId);
        return  new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/questions")
    public List<LevelOneFlashCardQuestions> getAll(){
        List<LevelOneFlashCardQuestions> q = questionsRepository.findAll();
        return q;
    }
}
