// Pseudocode for NotificationController.java  
  
// Function to send notification  
Function handleNotificationSending(request):  
    notificationData = extractNotificationData(request)  // Extract userID and message  
    // Create notification record in database  
    notificationID = createNotificationRecord(notificationData)  
    // Send notification to user  
    sendNotification(notificationData.userID, notificationData.message)  
    return successResponse("Notification sent successfully", notificationID)  
  
// Function to retrieve user's notifications  
Function handleNotificationListRetrieval(request):  
    userID = extractUserID(request)  
    notifications = getUserNotifications(userID)  
    return successResponse(notifications)
