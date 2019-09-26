READ  * cerner_2^5_2019
      * Example of reading a file and displaying the records

       IDENTIFICATION DIVISION.
       PROGRAM-ID.  SeqRead.

       ENVIRONMENT DIVISION.
       INPUT-OUTPUT SECTION.
       FILE-CONTROL.
           SELECT StudentFile ASSIGN TO "STUDENTS.DAT"
       	               ORGANIZATION IS LINE SEQUENTIAL.

       DATA DIVISION.
       FILE SECTION.
       FD StudentFile.
       01 StudentDetails.
          88  EndOfStudentFile  VALUE HIGH-VALUES.
          02  StudentId       PIC 9(7).
          02  StudentName.
              03 Surname      PIC X(8).
              03 Initials     PIC XX.
          02  CourseCode      PIC X(4).
          02  Gender          PIC X.

       PROCEDURE DIVISION.
       Begin.
          OPEN INPUT StudentFile
          READ StudentFile
             AT END SET EndOfStudentFile TO TRUE
          END-READ
          PERFORM UNTIL EndOfStudentFile
             DISPLAY StudentId SPACE StudentName SPACE CourseCode
             READ StudentFile
                AT END SET EndOfStudentFile TO TRUE
             END-READ
          END-PERFORM
          CLOSE StudentFile
          STOP RUN.
