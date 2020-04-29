PRINCIPIOS SOLID
-----------------
SOLID es uno de los acrónimos más famosos en el mundo de la programación. In-
troducido por Robert C. Martin (mejor conocido como el tío Bob) a principios del 2000, se compone de 5 principios de la programación orientada a objetos.

Entre los objetivos de tener en cuenta estos 5 principios a la hora de escribir código encontramos:

- Crear un software eficaz: que cumpla con su cometido y que sea robusto y estable.
- Escribir un código limpio y flexible ante los cambios: que se pueda modificar fácilmente según necesidad, que sea reutilizable y mantenible.
- Permitir escalabilidad: que acepte ser ampliado con nuevas funcionalidades de manera ágil.

En este sentido la aplicación de los principios SOLID está muy relacionada con la comprensión y el uso de patrones de diseño, que nos permitirán mantener una alta cohesión y, por tanto, un bajo acoplamiento de software. En definitiva, desarrollar un software de calidad.

El acoplamiento se refiere al grado de interdependencia que tienen dos unidades de software entre sí, entendiendo por unidades de software: clases, subtipos, métodos, módulos, funciones, bibliotecas, etc.

Si dos unidades de software son completamente independientes la una de la otra, decimos que están desacopladas.

La cohesión de software es el grado en que elementos diferentes de un sistema permanecen unidos para alcanzar un mejor resultado que si trabajaran por separado. Se refiere a la forma en que podemos agrupar diversas unidades de software para crear una unidad mayor.

Los principios SOLID son eso: principios, es decir, buenas prácticas que pueden ayudar a escribir un mejor código: más limpio, mantenible y escalable.


S (SRP) – Principio de responsabilidad única (Single responsibility principle)
-----------------
> A class should have one, and only one, reason to change.

> Una clase debe tener una, y solo una, razón para cambiar.

Una clase debe encapsular una única funcionalidad; en caso de encapsular
más de una funcionalidad, sería necesario separar la clase en múltiples clases.
Es un principio fundamental basado en que una clase ha de hacer aquello que
debe hacer y nada más. De esta forma conseguimos que la clase sea más enten-
dible y fácil de mantener.


O (OCP) – Principio de abierto/cerrado (Open/closed principle)
-----------------
> You should be able to extend a classes behavior, without modifying it.

> Debería poder extender el comportamiento de una clase, sin modificarlo.

Debemos preparar nuestro código para que esté abierto a extensiones y ce-
rrado a modificaciones. La idea es que el código ya escrito, y que ha pasado las pruebas unitarias, esté cerrado a modificaciones, es decir, que aquello que funcione no se toque.
Por otra parte, dado que nuestro sistema evolucionará con el tiempo, debe
estar abierto a cambios, es decir, que podamos extender estas clases mediante el uso de clases abstractas, que nos permitan crear nuevos objetos que hereden de estas clases, sin alterar su funcionamiento.


L (LSP) – Principio de sustitución de Liskov (Liskov substitution principle)
-----------------
> Derived classes must be substitutable for their base classes.

> Las clases derivadas deben ser sustituibles por sus clases base.

Este principio define que los objetos de una superclase deben ser reemplazables por objetos de sus subclases sin "romper" la aplicación o sistema y sin efectos secundarios. Eso requiere que los objetos de las subclases se comporten de la misma manera que los objetos de la superclase de forma que se puedan usar de forma indistinta.

Para conseguir esto las subclases deberían seguir estas reglas:

- No implementar reglas de validación más estrictas en los parámetros de entrada que las implementadas por la clase base.
- Aplicar al menos las mismas reglas a todos los parámetros de salida aplicados por la clase base.


I (ISP) – Principio de segregación de la interfaz  (Interface segregation principle)
-----------------
> Make fine grained interfaces that are client specific.

> Haga interfaces de grano fino que sean específicas del cliente.


D (DIP) – Principio de inversión de la dependencia (Dependency inversion principle)
-----------------
> Depend on abstractions, not on concretions.

> Depende de abstracciones, no de concreciones.


