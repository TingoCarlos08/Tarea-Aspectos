# Tarea-Aspectos

## Core Concern & Cross Concern

Los cambios realizados en la aplicación mejoraron su funcionalidad y usabilidad. El cross cutting "Auditoría" permite registrar eventos de la aplicación, lo que puede ser útil para fines de seguimiento y depuración. El cross cutting "Registro de Eventos" permite registrar todos los eventos de la aplicación, lo que puede ser útil para fines de auditoría. La nueva funcionalidad permite registrar el botón clickeado, lo que puede ser útil para fines de seguimiento de la interacción del usuario.

## Cambios realizados en la aplicación:
  - Se agregó un cross cutting "Auditoría" que registra cada vez que se cambia el color de fondo de la ventana.
  - Se agregó un cross cutting "Registro de Eventos" que registra todo tipo de eventos que se registran en la aplicación.
  - Se agregó una nueva funcionalidad mediante un pointcut que añade texto a un jlabel para registrar el boton clickeado.

## Pasos realizados:
  - Se implementó el aspecto "Auditoría" utilizando la anotación @AspectJ.
  - Se implementó el aspecto "Registro de Eventos" utilizando la anotación @AspectJ.
  - Se agregó un pointcut para la nueva funcionalidad.
  - Se implementó la nueva funcionalidad en el pointcut.
