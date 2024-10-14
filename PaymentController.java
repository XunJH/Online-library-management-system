// Pseudocode for PaymentController.java  
  
// Function to initiate payment  
Function handlePaymentInitiation(request):  
    paymentData = extractPaymentData(request)  // Extract userID, amount, description  
    if validatePaymentData(paymentData):  
        paymentResponse = initiatePayment(paymentData)  
        if paymentResponse.isSuccess:  
            // Insert payment record into database  
            insertPaymentRecord(paymentData, paymentResponse)  
            return successResponse("Payment initiated successfully")  
        else:  
            return errorResponse("Payment failed")  
    else:  
        return errorResponse("Invalid payment data")  
  
// Function to query payment status  
Function handlePaymentStatusQuery(request):  
    paymentRecordID = extractPaymentRecordID(request)  
    paymentRecord = getPaymentRecord(paymentRecordID)  
    return successResponse(paymentRecord.status)
