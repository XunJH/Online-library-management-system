// Pseudocode for BorrowController.java  
  
// Function to handle book borrowing  
Function handleBookBorrowing(request):  
    borrowData = extractBorrowData(request)  // Extract userID, bookID, borrowingDays  
    user = getUserByID(borrowData.userID)  
    book = getBookByID(borrowData.bookID)  
    if user and book and canUserBorrow(user, book):  
        // Insert borrowing record into database  
        insertBorrowingRecord(borrowData)  
        // Update book status to borrowed  
        updateBookStatus(book.id, "borrowed")  
        return successResponse("Book borrowed successfully")  
    else:  
        return errorResponse("Unable to borrow book")  
  
// Function to handle book return  
Function handleBookReturn(request):  
    returnData = extractReturnData(request)  // Extract userID and bookID  
    borrowingRecord = getBorrowingRecord(returnData.userID, returnData.bookID)  
    if borrowingRecord and isWithinBorrowingPeriod(borrowingRecord):  
        // Update borrowing record status to returned  
        updateBorrowingRecordStatus(borrowingRecord.id, "returned")  
        // Update book status to available  
        updateBookStatus(borrowingRecord.bookID, "available")  
        return successResponse("Book returned successfully")  
    else:  
        return errorResponse("Unable to return book")
