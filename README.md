# Spring Auth JWT + OAuth

Proyecto de ejemplo que muestra cómo implementar autenticación segura usando **JWT (JSON Web Tokens)** y **OAuth2** en una aplicación Spring Boot.

Este repositorio es de código abierto y está pensado como recurso educativo para quienes quieran aprender a integrar ambos mecanismos de autenticación.

---

## 🚀 Tecnologías utilizadas

- Java 21+
- Spring Boot 3
- Spring Security
- JWT (via `jjwt`)
- OAuth2 (con autenticación mediante Google, GitHub, etc.)
- Maven

---

## 🛡️ Características

- Registro y login de usuarios con JWT
- Autenticación vía OAuth2 (Google, GitHub, etc.)
- Protección de rutas según roles (`USER`, `ADMIN`, etc.)
- Refresh token para renovar sesiones JWT
- Logout seguro
- Arquitectura modular y limpia

---

## 🔐 Endpoints disponibles

| Método | Ruta                  | Descripción                        |
|--------|-----------------------|------------------------------------|
| POST   | `/auth/register`      | Registro de usuario                |
| POST   | `/auth/login`         | Login y generación de JWT          |
| POST   | `/auth/refresh-token` | Renovación de token JWT            |
| GET    | `/user/profile`       | Ruta protegida con JWT             |
| GET    | `/oauth2/authorize`   | Inicio de autenticación OAuth      |
| GET    | `/logout`             | Cierre de sesión                   |

---

## ⚙️ Configuración

Podés usar `application.yml` o `application.properties` para definir tus credenciales y parámetros de seguridad.

### 🔸 Opción 1: `application.yml`

```yaml
spring:
  security:
    oauth2:
      client:
        registration:
          google:
            client-id: TU_CLIENT_ID
            client-secret: TU_CLIENT_SECRET
          github:
            client-id: TU_CLIENT_ID
            client-secret: TU_CLIENT_SECRET

jwt:
  secret: TU_SECRETO
  expiration: 3600000 # en milisegundos (1 hora)
```

### 🔸 Opción 2: `application.properties`

```properties
# === OAuth2 (Google) ===
spring.security.oauth2.client.registration.google.client-id=TU_CLIENT_ID
spring.security.oauth2.client.registration.google.client-secret=TU_CLIENT_SECRET

# === OAuth2 (GitHub) ===
spring.security.oauth2.client.registration.github.client-id=TU_CLIENT_ID
spring.security.oauth2.client.registration.github.client-secret=TU_CLIENT_SECRET

# === Configuración JWT ===
jwt.secret=TU_SECRETO
jwt.expiration=3600000
```

---

## 📦 Instalación

Clona este repositorio y ejecuta la aplicación localmente.

### 🔽 Clonar el repositorio

```bash
git clone https://github.com/angel-sisamon/spring-auth-jwt-oauth.git
```
