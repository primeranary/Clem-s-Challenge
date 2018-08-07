package passionproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import passionproject.model.LevelTwoMultiChoiceQuestions;
import passionproject.repositories.LevelTwoMultipleChoiceRepository;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = {"http://localhost:8100","http://localhost:8080"})
@RestController
public class LevelTwoMultipleChoiceQuestionsController {

    @Autowired
    LevelTwoMultipleChoiceRepository questionsRepository;

    @RequestMapping(value = "/quesans", method = RequestMethod.POST)
    public ResponseEntity<?> createQuestion(@RequestBody LevelTwoMultiChoiceQuestions quesAnswer) {
        quesAnswer = questionsRepository.save(quesAnswer);
        return new ResponseEntity<>(quesAnswer, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/quesans/{answerId}", method = RequestMethod.GET)
    public ResponseEntity<?> getQuestion(@PathVariable Long answerId) {
        Optional<LevelTwoMultiChoiceQuestions> q = questionsRepository.findById(answerId);
        return new ResponseEntity<>(q,HttpStatus.OK);

    }

    @RequestMapping(value = "/quesans/{answerId}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateQuestion(@RequestBody LevelTwoMultiChoiceQuestions easyAnswer) {
        LevelTwoMultiChoiceQuestions q = questionsRepository.save(easyAnswer);
        return new ResponseEntity<>(q,HttpStatus.OK);
    }

    @RequestMapping(value = "/quesans/{answerId}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteQuestion(@PathVariable LevelTwoMultiChoiceQuestions answerId) {
        questionsRepository.delete(answerId);
        return  new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/allquesans")
    public List<LevelTwoMultiChoiceQuestions> getAll(){
        List<LevelTwoMultiChoiceQuestions> q = questionsRepository.findAll();
        return q;
    }

}