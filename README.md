# JWTSecurity
### Kep points:
#### 1. Authorization and Resource Servers
##### Resource Server stores user’s data and http services which can return user data to authenticated clients.
##### Authorization Server is responsible for authenticating user’s identity and gives an authorization token. This token is accepted by resource server and validate your identity.
##### 2. Access Token vs Refresh Token
##### An access token is a string representing an authorization issued to the client. Tokens represent specific scopes and durations of access, granted by the resource owner, and enforced by the resource server and authorization server.
##### The refresh token is issued (along with the access token) to the client by the authorization server, and it is used to obtain a new access token when the current access token becomes invalid or expires. 
##### The responsibility of access token is to access data before it gets expired.
##### The responsibility of refresh token is to request for a new access token when the existing access token is expired.
##### Source: https://howtodoinjava.com/spring-boot2/oauth2-auth-server/
![Oauth2-Flow](https://user-images.githubusercontent.com/101427135/225914103-499d9b81-e2cd-4df2-8717-d609a11e02ab.png)

#### ***PLS note that I'm using Mac***
##### 3. Generate private key:
##### cd src/main/resources/keys
##### (Under the keys directory, type in command) openssl genrsa -out keypari.pem 2048

##### 4. Extract public key from private key
##### openssl rsa -in keypair.pem -pubout -out public.pem

##### 5. openssl pkcs8 -topk8 -inform PEM -outform PEM -noncrypt -in keypair.pem -out private.pem 
