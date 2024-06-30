import React, { useState } from "react";
import { useWindowDimensions } from "react-native";
import { Colors } from "../constants/Colors";
import {
  View,
  Text,
  TouchableOpacity,
  StyleSheet,
} from "react-native";

const HomePage = () => {
  const [selectedPrompt, setSelectedPrompt] = useState<string | null>(null);
  const { width, height } = useWindowDimensions();

  const handlePromptClick = (prompt: string) => {
    setSelectedPrompt(selectedPrompt === prompt ? null : prompt);
    console.log(`Prompt clicked: ${prompt}`);
  };

  const prompts = [
    "If you could spend a day in the life of any historical figure, who would it be and what would you hope to learn from their experiences?",
    "Imagine a world where everyone has a superpower based on their personality. What would your superpower be, and how would it shape your daily life?",
    "Describe a place from your past that holds significant meaning for you. How has it influenced who you are today?",
    "Write about a time when you faced a difficult decision. What did you choose, and how did that choice impact your life?",
    "If you could travel to any fictional world from a book or movie, where would you go and what adventures would you have there?",
  ];

  const promptBoxWidth = width > height ? "50%" : "80%";

  return (
    <View style={styles.container}>
      {prompts.map((prompt, index) => (
        <TouchableOpacity
          key={index}
          style={[
            styles.promptBox,
            { width: promptBoxWidth },
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
  container: {
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
    padding: "2%",
    backgroundColor: Colors.light.background,
  },
  promptBox: {
    padding: "2%",
    marginVertical: "0.6%",
    backgroundColor: Colors.light.white,
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
    color: Colors.light.text,
  },
  selectedPromptBox: {
    backgroundColor: Colors.light.primary, // Highlight color for selected prompt
  },
});

export default HomePage;
