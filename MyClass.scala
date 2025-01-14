```scala
class MyClass(val value: Int) {
  def this() = this(0) 
}
```

This code snippet defines a class `MyClass` with an auxiliary constructor. It is trying to initialize the `value` field to 0 if no argument is provided. However, this approach can lead to unexpected behavior if the main constructor has side effects or complex initialization logic.