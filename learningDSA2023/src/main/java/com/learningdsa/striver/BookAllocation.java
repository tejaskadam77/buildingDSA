package com.learningdsa.striver;

public class BookAllocation {
    public static void main(String[] args) {
        int books[] = new int[]{25, 46, 28, 49, 24};
        int noOfStudents = 4;
        System.out.println(findPages(books, noOfStudents));
    }

    public static int findPages(int[] books, int noOfStudents) {
        if (noOfStudents > books.length)
            return -1;
        int low = Integer.MIN_VALUE;
        int high = 0;
        for (int i = 0; i < books.length; i++) {
            low = Math.max(low, books[i]);
            high = high + books[i];
        }
        //bruteforce
//        for (int pages = low; pages <= high; pages++) {
//            if (countStudents(pages, books) == noOfStudents)
//                return pages;
//
//        }
//        return low;
        //BINARYSEARCH

        while (low <= high) {
            int midpages = low + high / 2;
            if (countStudents(midpages, books) > noOfStudents) {
                low = midpages + 1;
            } else {
                high = midpages - 1;
            }
        }
        return low;
    }

    private static int countStudents(int pages, int[] books) {
        int student = 1;
        int lastPages = 0;
        for (int i = 0; i < books.length; i++) {
            if (lastPages + books[i] <= pages) {
                lastPages = lastPages + books[i];
            } else {
                student = student + 1;
                lastPages = books[i];
            }
        }
        return student;
    }
}
