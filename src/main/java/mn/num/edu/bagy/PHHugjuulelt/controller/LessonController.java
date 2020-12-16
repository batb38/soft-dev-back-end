package mn.num.edu.bagy.PHHugjuulelt.controller;

import mn.num.edu.bagy.PHHugjuulelt.entity.Lesson;
import mn.num.edu.bagy.PHHugjuulelt.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class LessonController {

    @Autowired
    private LessonService service;

    @PostMapping("/addLesson")
    public Lesson addLesson(@RequestBody Lesson lesson) {
        System.out.println("Hicheel nemjiin");
        return service.saveLesson(lesson);
    }

    @PostMapping("/addLessons")
    public List<Lesson> addLessons(@RequestBody List<Lesson> lessons) {
        return service.saveLessons(lessons);
    }

    @GetMapping("/lessons")
    public List<Lesson> findAllLessons() {
        return service.getLessons();
    }

    @GetMapping("/lesson/{id}")
    public Lesson findLessonById(@PathVariable int id) {
        return service.getLessonById(id);
    }

    @PutMapping("/update")
    public Lesson updateLesson(@RequestBody Lesson lesson) {
        return service.updateLesson(lesson);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteLesson(id);
    }

}
