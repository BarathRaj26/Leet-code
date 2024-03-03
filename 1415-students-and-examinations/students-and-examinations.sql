SELECT S.student_id, S.student_name, Sub.subject_name, COUNT(E.subject_name) as attended_exams
FROM Students as S INNER JOIN Subjects as Sub LEFT OUTER JOIN Examinations as E
ON S.student_id = E.student_id AND E.subject_name = Sub.subject_name 
GROUP BY S.student_id, Sub.subject_name
ORDER BY S.student_id, Sub.subject_name;