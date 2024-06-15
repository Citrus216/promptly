import React from "react";
import { AppRegistry } from "react-native";
import { createStackNavigator } from '@react-navigation/stack';
import { SafeAreaProvider } from "react-native-safe-area-context";

import HomePage from "./HomePage"; // Adjust the import path as necessary

const App = () => {
  return (
    <SafeAreaProvider>
      <HomePage />
    </SafeAreaProvider>
  );
};

AppRegistry.registerComponent("Promptly", () => App);

export default App;
