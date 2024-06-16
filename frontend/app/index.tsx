import React from "react";
import { AppRegistry } from "react-native";
import { createStackNavigator } from '@react-navigation/stack';
import { SafeAreaProvider } from "react-native-safe-area-context";

import HomePage from "./HomePage"; 
import Login from "./Login";
import Signup from "./Signup";

const App = () => {
  return (
    <SafeAreaProvider>
      
      <Signup />
    </SafeAreaProvider>
  );
};

AppRegistry.registerComponent("Promptly", () => App);

export default App;
