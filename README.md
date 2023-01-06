Flight History API
This API allows you to retrieve and record flight history data.

Endpoints
GET /route/{code}
Retrieves the recorded flight history for the specified flight.

Parameters
code: The flight number of the desired flight.
Response
200 OK: The flight history was retrieved successfully.
404 Not Found: The specified flight could not be found in the database.
POST /route/{code}
Starts recording the flight history for the specified flight and returns the short term history.

Parameters
code: The flight number of the desired flight.
Response
200 OK: The flight history recording was started and the short term history was returned successfully.
404 Not Found: The specified flight could not be found in the database.
