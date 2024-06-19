import React from "react";
import { AppRegistry } from "react-native";
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs';
import { SafeAreaProvider } from "react-native-safe-area-context";
import { NavigationContainer } from "@react-navigation/native";

import HomePage from "./HomePage"; 
import Login from "./Login";
import Signup from "./Signup";

const Tab = createBottomTabNavigator();

const App = () => {
  return (
    <SafeAreaProvider>
      {/* <NavigationContainer> */}
        <Tab.Navigator>
          <Tab.Screen name="Home" component={HomePage} />
          <Tab.Screen name="Login" component={Login} />
          <Tab.Screen name="Signup" component={Signup} />
        </Tab.Navigator>
      {/* </NavigationContainer> */}
    </SafeAreaProvider>
  );
};

AppRegistry.registerComponent("Promptly", () => App);

export default App;
