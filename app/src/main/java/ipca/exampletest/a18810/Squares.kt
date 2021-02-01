package ipca.exampletest.a18810


import java.util.*

class Squares  {

    //ecrã
    var x = 0
    var y = 0

    //objeto em si
    var maxY = 0
    var minY = 0
    var maxX = 0
    var minX = 0

    private var _isGoingDown = false

    var isGoingDown : Boolean
        get() = _isGoingDown
        set(value) {

            //Só atribui o valor bool quando o y = 0 ou seja quando toca na parte de cima
            if (y == minY) {
                _isGoingDown = value
            }
        }

    constructor(width: Int, height: Int){

        //ecrã
        maxX = width
        minX = 0
        maxY = height
        minY = 0




        val generator =  Random()
        //Se for quadrado é o canto superior esquerdo se for circulo é o centro
        x = generator.nextInt(maxX)
        y = generator.nextInt(maxY)

    }

    fun update(){
        if (_isGoingDown) {
            y += 5
        }else {
            y -= 5
            if (y <= minY)  {
                y = minY
            }

            //Se quisermos que ele passe para o outro lado tipo portal 2
            // if x <= miny {x = max x}
            // else if x >= maxx {x = min x}
        }

        //rnd = generatpr.nextInt(1)
        //Se o professor quiser que os circulos andem para o lado esquerdo e direito aleatoriamente
        //if rnd == 0 x -= 5
        //if rnd == 1 x += 5
    }


}