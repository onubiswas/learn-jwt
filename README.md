### Using JSON Web Tokens(JWT)  

This is a learning project on implementation of JWT with Spring Boot.

How do JSON Web Tokens work?

When the user successfully logged in using the credentials, a JSON Web Token is generated and will be returned. The token must be saved locally.
The user should send the JWT in the Authorization header using the Bearer schema to access any protected route or resources.

`Authorization: Bearer <token>
`

