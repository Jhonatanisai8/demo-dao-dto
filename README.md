# Demo DAO-DTO Spring Boot Application

Aplicación de demostración que implementa el patrón DAO (Data Access Object) y DTO (Data Transfer Object) en una aplicación Spring Boot.

## 🚀 Características

- Arquitectura en capas siguiendo el patrón DAO
- Uso de DTOs para transferencia de datos
- API RESTful para gestión de usuarios
- Mapeo automático con ModelMapper
- Documentación de API con Swagger/OpenAPI

## 🛠️ Requisitos Previos

- Java 21 o superior
- Maven 3.8.6 o superior
- Spring Boot 3.4.8

## 📦 Estructura del Proyecto

```
src/
├── main/
│   ├── java/com/isai/demo_dao_dto/
│   │   ├── DemoDaoDtoApplication.java     # Clase principal
│   │   ├── persistence/                   
│   │   │   ├── dao/                      # Interfaces DAO
│   │   │   │   ├── interfaces/           
│   │   │   │   └── impl/                 # Implementaciones DAO
│   │   │   └── entity/                   # Entidades JPA
│   │   ├── presentacion/                 
│   │   │   ├── controller/               # Controladores REST
│   │   │   └── dto/                      # Objetos de Transferencia de Datos
│   │   └── service/
│   │       ├── interfaces/               # Interfaces de servicio
│   │       └── impl/                     # Implementaciones de servicios
│   └── resources/
│       └── application.properties        # Configuración de la aplicación
└── test/                                 # Pruebas unitarias y de integración
```

## 🚀 Instalación

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/demo-dao-dto.git
   cd demo-dao-dto
   ```

2. Compilar el proyecto:
   ```bash
   mvn clean install
   ```

3. Ejecutar la aplicación:
   ```bash
   mvn spring-boot:run
   ```

La aplicación estará disponible en: `http://localhost:8080`

## 🛠️ Endpoints Disponibles

### Usuarios

- `GET /api/users` - Obtener todos los usuarios
- `GET /api/users/{id}` - Obtener un usuario por ID
- `POST /api/users` - Crear un nuevo usuario
- `PUT /api/users/{id}` - Actualizar un usuario existente
- `DELETE /api/users/{id}` - Eliminar un usuario

## 🧪 Pruebas

Para ejecutar las pruebas unitarias:

```bash
mvn test
```

## 🛠️ Tecnologías Utilizadas

- **Spring Boot 3.4.8** - Framework de aplicaciones Java
- **Spring Data JPA** - Para el acceso a datos
- **ModelMapper** - Para el mapeo entre entidades y DTOs
- **Lombok** - Para reducir el código boilerplate
- **Springdoc OpenAPI** - Documentación de la API

