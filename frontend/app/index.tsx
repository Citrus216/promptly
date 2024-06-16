import React from "react";
import { AppRegistry } from "react-native";
import { createStackNavigator } from '@react-navigation/stack';
import { SafeAreaProvider } from "react-native-safe-area-context";

import HomePage from "./HomePage"; 
import Login from "./Login";

const App = () => {
  return (
    <SafeAreaProvider>
      
      <Login />
    </SafeAreaProvider>
  );
};

AppRegistry.registerComponent("Promptly", () => App);

export default App;
