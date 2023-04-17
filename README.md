# baby-track-system
##  Stack - Spring Boot 3.0, Spring Data JPA, PostgreSQL
### Add children ( POST localhost:8087/api/v1/children)
### PAYLOAD ({
    "name": "John Smith",
    "placeOfBirth": "Nairobi",
    "registrationNumber": "NAR-23456",
    "dateOfBirth": "2000-01-01",
    "gender": "MALE",
    "weight": 3.5,
    "mothersName": "Mary Smith",
    "mothersAge": 30,
    "mothersOccupation": "Engineer",
    "mothersMaritalStatus": "MARRIED"
}
)

### SAMPLE RESPONSE ({
    "message": "Child added successfully",
    "status": "Created",
    "code": 201,
    "data": {
        "id": 1,
        "name": "John Smith",
        "placeOfBirth": "Nairobi",
        "registrationNumber": "NAR-23456",
        "dateOfBirth": "2000-01-01",
        "gender": "MALE",
        "weight": 3.5,
        "mothersName": "Mary Smith",
        "mothersAge": 30,
        "mothersOccupation": "Engineer",
        "mothersMaritalStatus": "MARRIED",
        "createdAt": "2023-04-17T19:06:13.453+00:00",
        "updatedAt": "2023-04-17T19:06:13.454+00:00"
    }
})

### UPDATE child INFO ( PUT localhost:8087/api/v1/children/1)
### PAYLOAD ({
    "name": "John Mburu",
    "placeOfBirth": "Nakuru",
    "registrationNumber": "NAR-23456",
    "dateOfBirth": "2000-01-01",
    "gender": "MALE",
    "weight": 3.5,
    "mothersName": "Mary Doe",
    "mothersAge": 30,
    "mothersOccupation": "Engineer",
    "mothersMaritalStatus": "MARRIED"
}
)

### SAMPLE RESPONSE ({
    "message": "Child updated successfully",
    "status": "Created",
    "code": 201,
    "data": {
        "id": 1,
        "name": "John Mburu",
        "placeOfBirth": "Nakuru",
        "registrationNumber": "NAR-23456",
        "dateOfBirth": "2000-01-01",
        "gender": "MALE",
        "weight": 3.5,
        "mothersName": "Mary Doe",
        "mothersAge": 30,
        "mothersOccupation": "Engineer",
        "mothersMaritalStatus": "MARRIED",
        "createdAt": "2023-04-17T19:06:13.453+00:00",
        "updatedAt": "2023-04-17T19:06:13.454+00:00"
    }
})


### get all children with pagination ( GET localhost:8087/api/v1/children)
### PAYLOAD ({})

### SAMPLE RESPONSE ({
    "message": "Success",
    "status": "OK",
    "code": 200,
    "data": {
        "content": [
            {
                "id": 1,
                "name": "John Smith",
                "placeOfBirth": "Nairobi",
                "registrationNumber": "NAR-23456",
                "dateOfBirth": "2000-01-01",
                "gender": "MALE",
                "weight": 3.5,
                "mothersName": "Mary Smith",
                "mothersAge": 30,
                "mothersOccupation": "Engineer",
                "mothersMaritalStatus": "MARRIED",
                "createdAt": "2023-04-17T19:06:13.453+00:00",
                "updatedAt": "2023-04-17T19:06:13.454+00:00"
            },
            {
                "id": 2,
                "name": "Jimmy Gathu",
                "placeOfBirth": "Naivasha",
                "registrationNumber": "NAR-24256",
                "dateOfBirth": "1992-01-01",
                "gender": "MALE",
                "weight": 4.5,
                "mothersName": "Angela Mbatia",
                "mothersAge": 30,
                "mothersOccupation": "Engineer",
                "mothersMaritalStatus": "WIDOWED",
                "createdAt": "2023-04-17T19:46:58.320+00:00",
                "updatedAt": "2023-04-17T19:46:58.320+00:00"
            }
        ],
        "pageable": {
            "sort": {
                "empty": true,
                "sorted": false,
                "unsorted": true
            },
            "offset": 0,
            "pageNumber": 0,
            "pageSize": 10,
            "paged": true,
            "unpaged": false
        },
        "last": true,
        "totalPages": 1,
        "totalElements": 2,
        "size": 10,
        "number": 0,
        "sort": {
            "empty": true,
            "sorted": false,
            "unsorted": true
        },
        "first": true,
        "numberOfElements": 2,
        "empty": false
    }
})


### Search children by name (GET localhost:8087/api/v1/children/search?name=John Smith)

### Response ({
    "message": "Success",
    "status": "OK",
    "code": 200,
    "data": [
        {
            "id": 1,
            "name": "John Smith",
            "placeOfBirth": "Nairobi",
            "registrationNumber": "NAR-23456",
            "dateOfBirth": "2000-01-01",
            "gender": "MALE",
            "weight": 3.5,
            "mothersName": "Mary Smith",
            "mothersAge": 30,
            "mothersOccupation": "Engineer",
            "mothersMaritalStatus": "MARRIED",
            "createdAt": "2023-04-17T19:06:13.453+00:00",
            "updatedAt": "2023-04-17T19:06:13.454+00:00"
        }
    ]
})

### Empty search results ({
    "message": "Success",
    "status": "OK",
    "code": 200,
    "data": []
})