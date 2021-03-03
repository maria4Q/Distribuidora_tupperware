# Distribuidora_tupperware
Este es mi Proyecto de java realizado en eclipse nuestro proyecto se llama Distribuidora tupperware en la que la empresa de distribución tupperware desea adquirir un software que permita mostrar un resultado inmediato de la ganancia y con relación al costo final del producto los impuestos y el precio de venta para poder realizado aplicamos variables en el primer caso utilizamos la variable de tipo String para poder colocar el nombre de la empresa, la segunda variable es de tipo double porque se usan para guardar números en memoria que tienen parte entera y parte decimal, el resto de nuestras variables también van en double estas variables vamos a colocar todos los datos solicitados como costo unitario, la cantidad del producto, total de pago, precio de la venta, IVA y total de IVA  por unidad, para seguir en nuestra programación continuamos imprimiendo en la consola los datos anteriores y para poder hacerlo se utiliza System.out.println, después colocamos dentro del System.out.println todos nuestros datos que queramos que aparezcan en nuestra consola, después vamos a colocar una variable de tipo int porque almacena un valor entero como 1, 2, 0, -1, en y dentro de esta variable vamos a coloca cantidad del producto vendido, después agregamos dos variables de tipo double y dentro de cada una de ellas vamos a colocar la información que nos dieron que nos indica que la empresa quiere ofrecer a sus clientes un descuento del 5% en la comparación de 50 unidades del producto, un 15% de descuento por la adquisición de más de 100 unidades y un 25% en la adquisición de más de 1000 unidades del producto. Entonces en nuestra programación quedaría double TotalCobradoSinDescuento = cantidaDelProductoVendido*precioDeLaVenta; y en la segundq seria double TotalCobradoConDescuento = TotalCobradoSinDescuento - 0.05;, ahora vamos a colocar un if porque es la declaración de toma de decisiones más simple. Se usa para decidir si una determinada declaración o bloque de enunciados se ejecutará o no; es decir, si una determinada condición es verdadera (true), se ejecutará un bloque de enunciado y, de ser falsa (false), no, la información que el usuario desea ver en la consol final de esta propuesta es la siguiente:System.out.println("");
• Cantidad de unidades al vendedor
• Total a cobrar sin descuento
• Total a cobrar con el descuento
• Total del IVA sobre el cobro final
• Indicar el tipo de descuento que se realizó (ninguno, 10%, 15% o 25%)
• Ganancias obtenidas por la venta 
entonces nuestra programcaion que daría de la siguiente manera y como dice anteriormente para que el usuario pueda ver el resultado fina la programcion debemos colocar System.out.println, para poder colocar unn salto de linea en cada una de nuestro datos agregamos un  
    System.out.println("-Cantidad Vendida: "+cantidaDelProductoVendido);
		System.out.println("-Total sin descuento "+TotalCobradoSinDescuento);
		System.out.println("-Total con descuento "+TotalCobradoConDescuento);
		System.out.println("-IVA a declarar: Q"+ImpuestoDeclarado);
		System.out.println("-Tipo de descuento "+ tipoDeDescuentoAplicado);
		System.out.println("-Ganacia: Q"+ ganancias);
		
		
