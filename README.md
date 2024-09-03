# Clases de Java

![Descripción de la imagen](https://miro.medium.com/v2/resize:fit:2560/format:webp/1*2XrX0fP0htyTCah7AglTig.jpeg)
Por supuesto, aquí tienes un ejemplo más sencillo para entender el uso de interfaces y clases abstractas en un CRUD, esta vez con una entidad simple llamada `Product`.

### **1. Definir la Interfaz**

Primero, definimos una interfaz que contenga las operaciones básicas de un CRUD.

```java
public interface CrudOperations<T> {
    void create(T item);
    T read(int id);
    void update(int id, T item);
    void delete(int id);
}
```

### **2. Crear una Clase Abstracta**

Luego, creamos una clase abstracta que implemente esta interfaz y proporcione una implementación común para algunas operaciones.

```java
public abstract class AbstractCrud<T> implements CrudOperations<T> {
    
    @Override
    public void create(T item) {
        System.out.println("Creating: " + item.toString());
    }

    @Override
    public T read(int id) {
        System.out.println("Reading item with id: " + id);
        return null; // Aquí simplemente retornamos null para simplificar
    }

    @Override
    public void update(int id, T item) {
        System.out.println("Updating item with id: " + id);
    }

    @Override
    public void delete(int id) {
        System.out.println("Deleting item with id: " + id);
    }
}
```

### **3. Crear una Clase Concreta**

Ahora, creamos una clase concreta para manejar una entidad `Product`.

```java
public class Product {
    private int id;
    private String name;

    // Constructor
    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "'}";
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

Luego, la clase concreta que maneja las operaciones CRUD para `Product`:

```java
import java.util.HashMap;
import java.util.Map;

public class ProductCrud extends AbstractCrud<Product> {
    
    private Map<Integer, Product> productDatabase = new HashMap<>();

    @Override
    public void create(Product product) {
        productDatabase.put(product.getId(), product);
        super.create(product); // Llama a la implementación común
    }

    @Override
    public Product read(int id) {
        return productDatabase.get(id);
    }

    @Override
    public void update(int id, Product product) {
        if (productDatabase.containsKey(id)) {
            productDatabase.put(id, product);
            super.update(id, product); // Llama a la implementación común
        } else {
            System.out.println("Product not found with id: " + id);
        }
    }

    @Override
    public void delete(int id) {
        if (productDatabase.containsKey(id)) {
            productDatabase.remove(id);
            super.delete(id); // Llama a la implementación común
        } else {
            System.out.println("Product not found with id: " + id);
        }
    }
}
```

### **4. Uso de la Clase Concreta**

Finalmente, un ejemplo de cómo usar esta clase concreta:

```java
public class Main {
    public static void main(String[] args) {
        ProductCrud productCrud = new ProductCrud();

        Product product1 = new Product(1, "Laptop");
        Product product2 = new Product(2, "Smartphone");

        productCrud.create(product1);
        productCrud.create(product2);

        System.out.println(productCrud.read(1));

        product1.setName("Gaming Laptop");
        productCrud.update(1, product1);

        productCrud.delete(2);
    }
}
```

### **Explicación**

1. **Interfaz (`CrudOperations`)**: Define los métodos del CRUD, que son obligatorios para cualquier clase que implemente esta interfaz.
2. **Clase abstracta (`AbstractCrud`)**: Proporciona una implementación general de algunos métodos CRUD que todas las clases concretas pueden usar.
3. **Clase concreta (`ProductCrud`)**: Implementa los métodos CRUD específicos para `Product`, utilizando la implementación común cuando es posible, y maneja un almacenamiento sencillo con un `HashMap`.

Este ejemplo es más simple, con una estructura básica que te muestra cómo interfaces y clases abstractas pueden ser usadas para un CRUD sencillo en Java.