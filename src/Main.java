import java.util.*;

public class Main {
    public static int countOccurrence(List<String> someWords, String target) {
        int count = 0;

        for (String str : someWords) {
            if (str.equals(target)) {
                count++;
            }
        }
        return count;
    }

    public static List<Integer> toList(Integer[] array) {
        return Arrays.asList(array);
    }

    public static List<Integer> findUnique(List<Integer> inputtedNumbers) {
        List<Integer> uniqueNumber = new ArrayList<>();
        for (Integer num : inputtedNumbers)
            if (!uniqueNumber.contains(num)) uniqueNumber.add(num);
        return uniqueNumber;
    }

    public static void calcOccurance(List<String> differentWords) {
        Map<String, Integer> occurrences = new HashMap<>();

        for (String word : differentWords) {
            if (occurrences.containsKey(word)) {
                occurrences.put(word, occurrences.get(word) + 1);
            } else {
                occurrences.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static class WordOccurrence {
        public static class WordEntry {
            String name;
            int occurrence;

            public WordEntry(String name, int occurrence) {
                this.name = name;
                this.occurrence = occurrence;
            }
        }

        public static List<WordEntry> findOccurrence(List<String> words) {
            // Create a map to store word occurrences
            Map<String, Integer> wordCounts = new HashMap<>();

            // Count the occurrences of each word
            for (String word : words) {
                // Remove leading/trailing whitespace and convert to lowercase
                String cleanedWord = word.trim().toLowerCase();

                // Update the word count in the map
                wordCounts.put(cleanedWord, wordCounts.getOrDefault(cleanedWord, 0) + 1);
            }

            // Create a list of WordEntry objects from the map
            List<WordEntry> result = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                result.add(new WordEntry(entry.getKey(), entry.getValue()));
            }

            return result;
        }

        public static void main(String[] args) {
            List<String> stringList = List.of(
                    "apple", "banana", "cherry", "apple", "date",
                    "banana", "apple", "elderberry", "fig", "grape"
            );

            String target = "apple";
            int occurrenceCount = countOccurrence(stringList, target);
            System.out.println("The string '" + target + "' occurs " + occurrenceCount + " times in the list.");


            Integer[] value = {1, 2, 3};
            List<Integer> convertedNumbers = toList(value);
            System.out.println("It was: " + Arrays.toString(value));
            System.out.println("Now it is: " + convertedNumbers);


            List<Integer> numbers = List.of(1, 2, 2, 3, 3, 3, 4, 5);
            System.out.println("Input: " + numbers);
            List<Integer> uniques = findUnique(numbers);
            System.out.println("Unique numbers: " + uniques);


            List<String> words = List.of("hello", "world", "hello", "java", "python", "java");
            calcOccurance(words);


            List<String> wordList = new ArrayList<>();
            wordList.add("bird");
            wordList.add("fox");
            wordList.add("cat");
            wordList.add("bird");

            List<WordEntry> occurrences = findOccurrence(wordList);

            for (WordEntry entry : occurrences) {
                System.out.println("{name: \"" + entry.name + "\", occurrence: " + entry.occurrence + "}");
            }


        }
    }
}