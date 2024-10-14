// Pseudocode for UserController.java  
  
// Function to handle user registration  
Function handleUserRegistration(request):  
    userData = extractUserData(request)  // Extract username, password, email, etc.  
    if validateUserData(userData):  // Check if all fields are filled and valid  
        if isUsernameUnique(userData.username):  
            // Insert user into database  
            insertUser(userData)  
            // Generate session token  
            sessionToken = generateSessionToken(userData)  
            return successResponse("User registered successfully", sessionToken)  
        else:  
            return errorResponse("Username already exists")  
    else:  
        return errorResponse("Invalid user data")  
  
// Function to handle user login  
Function handleUserLogin(request):  
    loginData = extractLoginData(request)  // Extract username and password  
    user = getUserByUsername(loginData.username)  
    if user and verifyPassword(user, loginData.password):  
        // Generate session token  
        sessionToken = generateSessionToken(user)  
        return successResponse("User logged in successfully", sessionToken)  
    else:  
        return errorResponse("Invalid login credentials")
