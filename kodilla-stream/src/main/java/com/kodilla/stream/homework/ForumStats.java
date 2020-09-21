package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgOfPosts1 = UsersRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .mapToInt(u -> u.getNumberOfPosts())
                .average()
                .orElse(0);
        System.out.println("Average number of posts by users who are 40 or older: " + avgOfPosts1);

        double avgOfPosts2 = UsersRepository.getUserList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .mapToInt(u -> u.getNumberOfPosts())
                .average()
                .orElse(0);
        System.out.println("Average number of posts by users under 40: " + avgOfPosts2);

    }
}
