# Gestion-de-eventos
![image](https://github.com/user-attachments/assets/437571b4-d4c0-45f6-abb7-9950805ab9ba)
# Sistema de Gestión de Eventos

Este proyecto es una implementación en Java de un sistema de gestión de eventos, que permite crear, registrar participantes, asignar lugares y modificar eventos. El sistema está basado en una estructura de clases, enumeraciones e interfaces para modelar las relaciones entre los diferentes elementos involucrados en la organización de un evento.

## Descripción del Proyecto

El sistema tiene las siguientes funcionalidades principales:

- **Gestión de eventos**: Crear eventos con información como el nombre, fecha, capacidad y tipo de evento (conferencia, educativo, deportivo, cultural).
- **Gestión de participantes**: Registrar participantes, que pueden ser invitados o presentadores, en el evento.
- **Gestión de organizadores**: Los organizadores (con roles de administrador o coordinador) pueden crear, modificar y gestionar los eventos.
- **Asignación de lugares**: Los eventos se pueden asignar a un salón disponible.
  
### Estructura del Proyecto

El proyecto está compuesto por varias clases, enumeraciones e interfaces:

- **Clases**:
  - `Evento`: Representa un evento con atributos como nombre, fecha, capacidad y participantes.
  - `Participante`: Representa a un participante, que puede ser un invitado o un presentador.
  - `Organizador`: Representa a los organizadores que gestionan los eventos.
  - `Lugar` y `SalonDeEvento`: Representan los lugares y salones donde se realizan los eventos.

- **Enumeraciones**:
  - `TipoEvento`: Define los diferentes tipos de eventos (Conferencia, Educativo, Deportivo, Cultural).
  - `Rol`: Define los roles de los organizadores (Administrador, Coordinador).
  - `TipoParticipante`: Define los tipos de participantes (Invitado, Presentador).

- **Interfaces**:
  - `iOrganizador`: Interfaz para los métodos que los organizadores deben implementar para crear, invitar participantes y asignar lugares a los eventos.

## Requisitos

- Un editor de texto como IntelliJ IDEA, Eclipse o cualquier editor compatible con Java.
- Consola o terminal para compilar y ejecutar el proyecto.

## Instrucciones de Uso

### 1. Clonar el Repositorio

Para clonar este repositorio en tu máquina local, abre una terminal y ejecuta el siguiente comando:

```bash
git clone JuaaanCalopino/Gestion-de-eventos
