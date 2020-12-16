package mn.num.edu.bagy.PHHugjuulelt.service;

import mn.num.edu.bagy.PHHugjuulelt.entity.Lesson;
import mn.num.edu.bagy.PHHugjuulelt.repository.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonService {
    @Autowired
    private LessonRepository repository;

    public Lesson saveLesson(Lesson lesson) {
        return repository.save(lesson);
    }

    public List<Lesson> saveLessons(List<Lesson> lessons) {
        return repository.saveAll(lessons);
    }

    public List<Lesson> getLessons() {
        return repository.findAll();
    }

    public Lesson getLessonById(int id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteLesson(int id) {
        repository.deleteById(id);
        return id + "хичээл устлаа.";
    }

    public Lesson updateLesson(Lesson lesson) {
        Lesson existingLesson = getLessonById(lesson.getId());
        existingLesson.setName(lesson.getName());
        existingLesson.setAuthor(lesson.getAuthor());
        existingLesson.setPhoto(lesson.getPhoto());
        existingLesson.setShortInfo(lesson.getShortInfo());
        existingLesson.setCategory(lesson.getCategory());
        existingLesson.setContent(lesson.getContent());

        return repository.save(existingLesson);
    }

}
