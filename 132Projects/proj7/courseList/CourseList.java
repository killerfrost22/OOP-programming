package courseList;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CourseList {

	private Map<String, Collection<String>> courses;

	public boolean dropCourse(String student, String course) throws IllegalArgumentException {
		if ((student == null) || (course == null)) {
			throw new IllegalArgumentException();
		} else {
			// valid input
			if (courses.containsKey(student)) {
				// valid student name
				Collection<String> courseList = courses.get(student);
				if (courseList.contains(course)) {
					courseList.remove(course);
					return true;
				} else {
					// invalid course name
					return false;
				}
			}
		}
		return false;
	}

	public boolean isTakingCourse(String student, String course) throws IllegalArgumentException {
		if ((student == null) || (course == null)) {
			throw new IllegalArgumentException();
		} else {
			// valid input

			// check if Map courses is null
			if (courses == null) {
				return false;
			}

			if (courses.containsKey(student)) {
				// valid student name
				// check the course
				Collection<String> courseList = courses.get(student);
				if (courseList.contains(course)) {
					// valid course name
					return true;
				}
			}
		}
		return false;
	}

	public String mostPopularCourse() {
		if (courses == null) {
			return null;
		} else {
			Map<String, Integer> courseList = new HashMap<>();
			// iterator through the courses to fill in the courseList
			Iterator<String> iter1 = courses.keySet().iterator();
			while (iter1.hasNext()) {
				Iterator<String> iter2 = courses.get(iter1.next()).iterator();
				// create a iterator for the collection of courses
				while (iter2.hasNext()) {
					// check for occurrence
					String course = iter2.next();
					if (courseList.containsKey(course)) {
						// this course exist
						int count = courseList.get(course);
						// No of Student inc by 1
						courseList.put(course, count + 1);
					} else {
						// new course to the map
						courseList.put(course, 1);
					}
				}
			}
			String mostPopular = null;
			int student = 0;
			Iterator<String> iter3 = courseList.keySet().iterator();
			while (iter3.hasNext()) {
				String temp = iter3.next();
				// compare to the current Most Popular
				if (student < courseList.get(temp)) {
					// Update the Most Popular
					student = courseList.get(temp);
					mostPopular = temp;
				}
			}

			return mostPopular;
		}
	}

	public int numCoursesTaking(String student) throws IllegalArgumentException {
		if (student == null) {
			throw new IllegalArgumentException();
		} else {
			// valid input

			// check if Map courses is null
			if (courses == null) {
				return 0;
			}

			if (courses.containsKey(student)) {
				// valid student name
				// check the course
				Collection<String> courseList = courses.get(student);
				return courseList.size();
			} else {
				// invalid student name
				return 0;
			}
		}
	}

	public int numEnrolled(String course) throws IllegalArgumentException {
		if (course == null) {
			throw new IllegalArgumentException();
		} else {
			// valid input

			// check if Map courses is null
			if (courses == null) {
				return 0;
			}

			int num = 0;
			Set<String> studentList = courses.keySet();
			Iterator<String> iter = studentList.iterator();

			while (iter.hasNext()) {
				// iterate through the studentList
				Collection<String> courseList = courses.get(iter.next());
				// check for occurrence
				if (courseList.contains(course)) {
					// yes
					// increase the No of student of this course
					num++;
				}
			}

			return num;
		}
	}

	public void takeCourse(String student, String course) throws IllegalArgumentException {
		if ((student == null) || (course == null)) {
			throw new IllegalArgumentException();
		} else {
			// valid
			if (courses == null) {
				courses = new HashMap<String, Collection<String>>();
			}
			if (!courses.containsKey(student)) {
				// new student
				Collection<String> CoursesList = new HashSet<String>();
				CoursesList.add(course);
				courses.put(student, CoursesList);
			} else {
				if (courses.get(student).contains(course) == false) {
					courses.get(student).add(course);
				}
			}
		}
	}

}
