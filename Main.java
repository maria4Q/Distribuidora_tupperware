
public class Main {

	public static void main(String[] args) {
		
     
		final String nombreEmpresa = "Distribuidora TupperWare";
		

		double costoUnitario = 50;
		int cantidaDelProducto = 150;
		double totalDePago = costoUnitario*cantidaDelProducto;
		double precioDeLaVenta = 65;
		double IVA = 0.12; 
		double TotalIVAPorUnidad = precioDeLaVenta*IVA;
		
		
		
		System.out.println("-Costo por unidad: Q"+costoUnitario);
		System.out.println("-Cantidad del producto: Q"+cantidaDelProducto);
		System.out.println("******************************");
		System.out.println("-Total: Q"+totalDePago);
		System.out.println("-Venderse: Q"+precioDeLaVenta);
		System.out.println("-Impuesto establecido: Q"+ IVA );
		System.out.println("-Impuesgto por unidad: Q"+TotalIVAPorUnidad);
		System.out.println("***************************************");
		
		int cantidaDelProductoVendido = 60;
		double TotalCobradoSinDescuento = cantidaDelProductoVendido*precioDeLaVenta;
		double TotalCobradoConDescuento = TotalCobradoSinDescuento - 0.05;
		
		if(cantidaDelProductoVendido>=50) {
			TotalCobradoConDescuento = TotalCobradoSinDescuento - (TotalCobradoSinDescuento*0.05);
		}
		if(cantidaDelProductoVendido>=100) {
			TotalCobradoConDescuento = TotalCobradoSinDescuento -(TotalCobradoSinDescuento*0.15);
		}
		if(cantidaDelProductoVendido>=1000) {
			TotalCobradoConDescuento = TotalCobradoSinDescuento -(TotalCobradoSinDescuento*0.25);
		}
		
		double ImpuestoDeclarado = TotalCobradoConDescuento *IVA;
		double tipoDeDescuentoAplicado = 0.5;
		double ganancias = (TotalCobradoSinDescuento - (cantidaDelProductoVendido*costoUnitario))-ImpuestoDeclarado;
		
		System.out.println("-Cantidad Vendida: "+cantidaDelProductoVendido);
		System.out.println("-Total sin descuento "+TotalCobradoSinDescuento);
		System.out.println("-Total con descuento "+TotalCobradoConDescuento);
		System.out.println("-IVA a declarar: Q"+ImpuestoDeclarado);
		System.out.println("-Tipo de descuento "+ tipoDeDescuentoAplicado);
		System.out.println("-Ganacia: Q"+ ganancias);
		
		
		
		
		
	}

	
		
	}


