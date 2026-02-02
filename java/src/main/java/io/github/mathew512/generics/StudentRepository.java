package io.github.mathew512.generics;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements Repository<Student, Long> {
    private List<Student> students = new ArrayList<>();

    @Override
    public Student findById(Long id) {
        return students.stream()
                       .filter(s -> s.getId() == id)
                       .findFirst()
                       .orElse(null);
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(students);
    }

    @Override
    public void save(Student student) {
        students.add(student);
    }

    @Override
    public void delete(Long id) {
        students.removeIf(s -> s.getId() == id);
    }
}
