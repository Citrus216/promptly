import React, { useState } from 'react';
import { View, Text, TextInput, Button, StyleSheet, TouchableOpacity, Alert, useWindowDimensions } from 'react-native';
import { Colors } from '../constants/Colors';

const Signup = () => {
  const [email, setEmail] = useState('');
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const [verifyPassword, setVerifyPassword] = useState('');
  const [firstName, setFirstName] = useState('');
  const [lastName, setLastName] = useState('');
  const { width, height } = useWindowDimensions();

  const handleSignup = () => {
    if (password !== verifyPassword) {
      Alert.alert("Error", "Passwords do not match");
      return;
    }

    console.log(`Email: ${email}, Username: ${username}, Password: ${password}, First Name: ${firstName}, Last Name: ${lastName}`);
    // Add your signup logic here
  };

  const inputWidth = width > height ? '40%' : '80%';

  return (
    <View style={styles.container}>
      <Text style={styles.title}>Sign Up</Text>
      <TextInput
        style={[styles.input, { width: inputWidth }]}
        value={email}
        onChangeText={setEmail}
        placeholder="Enter your email"
        placeholderTextColor="#888"
        keyboardType="email-address"
        autoCapitalize="none"
      />
      <TextInput
        style={[styles.input, { width: inputWidth }]}
        value={username}
        onChangeText={setUsername}
        placeholder="Enter your username"
        placeholderTextColor="#888"
        autoCapitalize="none"
      />
      <TextInput
        style={[styles.input, { width: inputWidth }]}
        value={firstName}
        onChangeText={setFirstName}
        placeholder="Enter your first name"
        placeholderTextColor="#888"
      />
      <TextInput
        style={[styles.input, { width: inputWidth }]}
        value={lastName}
        onChangeText={setLastName}
        placeholder="Enter your last name"
        placeholderTextColor="#888"
      />
      <TextInput
        style={[styles.input, { width: inputWidth }]}
        value={password}
        onChangeText={setPassword}
        placeholder="Enter your password"
        placeholderTextColor="#888"
        secureTextEntry
      />
      <TextInput
        style={[styles.input, { width: inputWidth }]}
        value={verifyPassword}
        onChangeText={setVerifyPassword}
        placeholder="Verify your password"
        placeholderTextColor="#888"
        secureTextEntry
      />
      <TouchableOpacity style={[styles.button, { width: inputWidth }]} onPress={handleSignup}>
        <Text style={styles.buttonText}>Sign Up</Text>
      </TouchableOpacity>
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    padding: 20,
    backgroundColor: Colors.light.background,
  },
  title: {
    fontSize: 24,
    marginBottom: 20,
    fontWeight: 'bold',
    color: Colors.light.text,
  },
  input: {
    padding: 15,
    marginVertical: 10,
    borderWidth: 1,
    borderColor: '#ccc',
    borderRadius: 10,
    backgroundColor: Colors.light.white,
  },
  button: {
    padding: 15,
    marginVertical: 10,
    backgroundColor: Colors.light.secondary,
    borderRadius: 10,
    alignItems: 'center',
  },
  buttonText: {
    color: Colors.light.text,
    fontSize: 16,
    fontWeight: 'bold',
  },
});

export default Signup;
