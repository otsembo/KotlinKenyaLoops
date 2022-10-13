fun main(args: Array<String>) {
    val grades = arrayOf(1,2,3,4,5,6,7,8)
}

// FOR-LOOP
fun regularForLoop(){
    // List of domestic animals
    val animals = arrayOf("Cow", "Goat", "Sheep", "Chicken", "Turkey")
    // SYNTAX: for(variable in collection*){block}
    for(animal in animals){
       println(animal)
    }
    // OUTPUT => Cow Goat Sheep Chicken Turkey
}

// WHILE-LOOP
fun regularWhenLoop(){
    val cars = arrayOf("Chevrolet", "Mitsubishi", "Hyundai", "Nissan", "Kia")
    // SYNTAX: while(condition){block}
    var i = 0
    while (i < cars.size){
        println("${i+1}: ${cars[i]}")
        i++
    }
    // OUTPUT => 1: Chevrolet 2: Mitsubishi 3: Hyundai 4: Nissan 5: Kia
}

// ALTERNATIVE WHILE-LOOP
fun alternativeWhileLoop(){
    var x = 20
    do {
        print("$x ")
        x--
    }while (x > 0)
}

// FOR-LOOP WITH INDEX USING RANGE OPERATOR (..)
fun forLoopWithIndex(){
    // List of domestic animals
    val animals = arrayOf("Cow", "Goat", "Sheep", "Chicken", "Turkey")
    for (index in 0 .. animals.size - 1){
       printAnimal(index = index, animal= animals[index])
    }
}

// FOR-LOOP WITH INDEX USING 'until' EXTENSION FUNCTION
fun forLoopWithIndexAlt1(){
    // List of domestic animals
    val animals = arrayOf("Cow", "Goat", "Sheep", "Chicken", "Turkey")
    for (index in 0 until animals.size){
        printAnimal(index = index, animal= animals[index])
    }
}

// FOR LOOP WITH INDEX USING RANGE OPERATOR AND COLLECTION PROPERTY (lastIndex)
fun forLoopWithIndexAlt2(){
    // List of domestic animals
    val animals = arrayOf("Cow", "Goat", "Sheep", "Chicken", "Turkey")
    for (index in 0 .. animals.lastIndex){
        printAnimal(index = index, animal= animals[index])
    }
}

// FOR LOOP WITH INDEX USING 'indices' PROPERTY IN THE COLLECTION
fun forLoopWithIndexAlt3(){
    // List of domestic animals
    val animals = arrayOf("Cow", "Goat", "Sheep", "Chicken", "Turkey")
    for (index in animals.indices){
        printAnimal(index = index, animal= animals[index])
    }
}

// FOR LOOP WITH INDEX USING A COLLECTION PROPERTY (withIndex)
fun forLoopWithIndexAlt4(){
    // List of domestic animals
    val animals = arrayOf("Cow", "Goat", "Sheep", "Chicken", "Turkey")
    for ((index, animal) in animals.withIndex()){
        printAnimal(index = index, animal = animal)
    }
}

// FOR-EACH LOOP WITH INDEX
fun forLoopWithIndexAlt5(){
    // List of domestic animals
    val animals = arrayOf("Cow", "Goat", "Sheep", "Chicken", "Turkey")
    animals.forEachIndexed { index, animal ->
        printAnimal(index = index, animal = animal)
    }
}

// REPEAT A FUNCTIONALITY n-times
fun repeatLoop(){
    repeat(10){ i ->
        println("Hello $i time(S)")
    }
}

// utility function
fun printAnimal(index: Int = 0, animal: String = ""){
    print("${index + 1}: $animal ")
}