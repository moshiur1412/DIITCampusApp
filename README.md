# DIIT Campus Android App

DIIT Campus Android App is the subsystem which is developed for the NCC Education students. The main aim of the project is to provide utility to maintain student activities and institute
service. This project is developed for my institute and it’s a pioneer IT education and IT training institute in Bangladesh. This application helps to maintain current student activities, student admission, and program and course details information with institute another service. They can easily check institute update notices remotely. It also helps new student and their parents to take institute information.

**Version**: 1.0 Release of the DIIT Campus Android App.

- Screenshot of the android application looks like:
  ![arc](final_interface.jpg?raw=true 'DIITCampusApp')

---

## Table of Contents

- [Overview](#overview)
- [Problem Domain Area](#problem-Domain-Area)
- [The Advantages of Information Systems](#The-Advantages-of-Information-Systems)
- [The Limitations of Information Systems](#The-Limitations-of-Information-Systems)
- [Requirements Analysis and Specification](#Requirements-Analysis-and-Specification)
- [The System Features List](#system-features-list)
- [Technologies and Libraries](#technologies-and-libraries)
- [Further Development](#further-development)
- [How to run the System](#how-to-run-the-system)
- [Summary](#summary)
- [References](#references)

---

## Overview

This is identified that the project developed as calling name DIITCampusApp. The system handles any NCC students for reading and manages their previous assignment without bringing their hard copy. The main aim of the project is to provide utility to maintain student activities and institute service. This project is developed for my institute and it’s a pioneer IT education and IT training institute in Bangladesh. This application helps to maintain current student activities, student admission, and program and course details information with institute another service. They can easily check institute update notices remotely. It also helps new student and their parents to take institute information.

## Problem Domain Area

- Students can't want to bring their books on the campus but they must bring their phone.
- DIIT Institute has some problems with their current system, there has no students accessibility of their websites.
- Student and Teacher schedule is not a very easiest way in these situations.
- New student and the current student can't take the information into the of-line version.
- The website is modern, so we need to think about how to manage current institute full work.
- The only website is not good feedback for IT Institute.

## The Advantages of Information Systems

- The application is fully responsive.
- Authenticated by the security route such as campus own user_id and generated password.
- Validation and verification with relevant error and success message.
- Only NCC student can access the whole system.
- Custom error messaging with custom error pages.

## The Limitations of Information Systems

- The system is not used highly graphics and best UX design.
- Any information can't modify within the single click.

## Requirements Analysis and Specification

### Use Case Diagram

![arc](diagrams/use_case_diagram.jpg?raw=true 'DIITApps Use Case Diagram ')

### System Architecture

![arc](diagrams/system_architecture_diagram.jpg?raw=true 'DIITApps System Architecture Diagram ')

### Initial Class Diagram

![arc](diagrams/initial_class_diagram.jpg?raw=true 'DIITApps Initial Class Diagram ')

### High level Class Diagram

![arc](diagrams/high_level_class_diagram.jpg?raw=true 'DIITApps High level Diagram ')

### Sequence Class Diagram

![arc](diagrams/sequence_diagram.jpg?raw=true 'DIITApps Sequence Class Diagram ')

### Normalized Table Structure

![arc](diagrams/data_model.jpg?raw=true 'DIITApps Data Model ')

### Entity Relationship Diagram

![arc](diagrams/erd_diagram.jpg?raw=true 'DIITApps ERD Diagram ')

### System Unit Testing

![arc](diagrams/unit_testing.jpg?raw=true 'DIITApps ERD Diagram ')

## The System Features List

- Admin can create the students name NCC ID and NCC Password with update, delete and search from the database.
- Only student can access the system class module slide with their NCC ID and NCC Password.
- Student can check their daily routine, exam date, venue and their institute event details into these apps.
- Everyone can check institute location and student current time class schedule.
- New student and the current student can take the information into the of-line version.

## Technologies and libraries

- JAVA, MVC, UX-Design, SQLite
- Used Android Studio and SDK tools buindling first v-4.
- SQLite Helper for database ORM modeling.

## Further Development

- Highly UX design with graphical and visual chart reports.
- Personal email processing within the mail notification system.

## How to run the System

```sh
$ git clone https://github.com/vorsurm/DIITCampusApp.git

$ cd DIITCampusApp
$ create an Android Virtual Device (AVD)
$ run Android Virtual Device (AVD)
$ you can also made your own apk file from your IDE.

```

---

## Summary

DIITCampusApp is successfully developed and implemented now as a first version 1.0. After the hardworking and self-studying period, I would like to say, The DIIT Institute Android Application has to successfully implement and the system is work properly. The system have been able to provide a Google apps store which will be live and running for every users
device and they can found this application easily. This system has been successful in our attempt to take care of the needs of both the students as well as the administrator. Finally, it hopes that this will go a long way in popularizing the organization and making its work of enrollment, keeping track of Artist’s Arts, problem-solving, etc much more efficient.

## References

- https://developer.android.com/jetpack/docs/guide
- https://android.jlelse.eu/architecture-patterns-in-android-abf99f2b6f70
- https://www.androiddesignpatterns.com/
- https://github.com/futurice/android-best-practices
- https://medium.com/mindorks/best-coding-practices-tips-and-more-for-android-4ec03c7eeb2c
