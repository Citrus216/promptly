import React from "react";
import { AppRegistry } from "react-native";
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs';
import { SafeAreaProvider } from "react-native-safe-area-context";
import { NavigationContainer } from "@react-navigation/native";

import HomePage from "./HomePage"; 
import Login from "./Login";
import Signup from "./Signup";
import { Colors } from "../constants/Colors";

const Tab = createBottomTabNavigator();

const App = () => {
  return (
    <SafeAreaProvider>
      {/* <NavigationContainer> */}
        <Tab.Navigator 
          screenOptions={{ headerShown: false, tabBarActiveTintColor: Colors.light.secondary, tabBarInactiveTintColor: Colors.light.text }}>
          <Tab.Screen name="Home" component={HomePage} />
          <Tab.Screen name="Login" component={Login} />
          <Tab.Screen name="Sign Up" component={Signup} />
        </Tab.Navigator>
      {/* </NavigationContainer> */}
    </SafeAreaProvider>
  );
};

AppRegistry.registerComponent("Promptly", () => App);

export default App;
