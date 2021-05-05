package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {
	
	private ProductDao productdao;
	private LoggerService loggerService;
	

	public ProductManager(ProductDao productdao, LoggerService loggerService) {
		super();
		this.productdao = productdao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		//�� kodlar�
		if(product.getCategoryId()==1)
		{
			System.out.println("Bu kategoride �r�n kabul edilmiyor");
			return;
		}
		
		
		
		this.productdao.add(product);
		
		this.loggerService.logToSystem("�r�n eklendi " +product.getName());
		
		
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
