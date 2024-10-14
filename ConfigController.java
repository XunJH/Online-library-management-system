// Pseudocode for ConfigController.java  
  
// Function to retrieve configuration  
Function handleConfigRetrieval(request):  
    configKey = extractConfigKey(request)  
    configValue = getConfigValue(configKey)  
    return successResponse(configValue)  
  
// Function to update configuration  
Function handleConfigUpdate(request):  
    updateData = extractUpdateData(request)  // Extract configKey and newValue  
    if validateConfigValue(updateData.newValue):  
        updateConfigValue(updateData.configKey, updateData.newValue)  
        return successResponse("Configuration updated successfully")  
    else:  
        return errorResponse("Invalid configuration value")
