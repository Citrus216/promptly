import React, { useState } from "react";
import {
  View,
  Text,
  TouchableOpacity,
  StyleSheet,
  ScrollView,
} from "react-native";

const HomePage = () => {
  const [selectedPrompt, setSelectedPrompt] = useState<string | null>(null);

  const handlePromptClick = (prompt: string) => {
    if (selectedPrompt === prompt) {
      setSelectedPrompt(null);
    } else {
      setSelectedPrompt(prompt);
    }
    console.log(`Prompt clicked: ${prompt}`);
  };

  const prompts = [
    "If you could spend a day in the life of any historical figure, who would it be and what would you hope to learn from their experiences?",
    "Imagine a world where everyone has a superpower based on their personality. What would your superpower be, and how would it shape your daily life?",
    "Describe a place from your past that holds significant meaning for you. How has it influenced who you are today?",
    "Write about a time when you faced a difficult decision. What did you choose, and how did that choice impact your life?",
    "If you could travel to any fictional world from a book or movie, where would you go and what adventures would you have there?",
  ];

  return (
    <View style={styles.container}>
      {prompts.map((prompt, index) => (
        <TouchableOpacity
          key={index}
          style={[
            styles.promptBox,
            selectedPrompt === prompt && styles.selectedPromptBox,
          ]}
          onPress={() => handlePromptClick(prompt)}
        >
          <Text style={styles.promptText}>{prompt}</Text>
        </TouchableOpacity>
      ))}
    </View>
  );
};
const styles = StyleSheet.create({
  scrollContainer: {
    flexGrow: 1,
    justifyContent: "center",
    alignItems: "center",
    padding: "2%",
  },
  container: {
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
    padding: "2%",
    backgroundColor: "#f0f0f0",
  },
  promptBox: {
    width: "60%",
    padding: "2%",
    marginVertical: "0.6%",
    backgroundColor: "#ffffff",
    borderRadius: 10,
    shadowColor: "#000",
    shadowOffset: { width: 0, height: 2 },
    shadowOpacity: 0.1,
    shadowRadius: 4,
    elevation: 3,
    alignItems: "center",
  },
  promptText: {
    textAlign: "center",
    fontSize: 18,
    color: "#333",
  },
  selectedPromptBox: {
    backgroundColor: "#cceeff", // Highlight color for selected prompt
  },
});

export default HomePage;
