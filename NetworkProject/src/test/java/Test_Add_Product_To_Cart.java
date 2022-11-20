import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Add_Product_To_Cart {

    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @Test
    public void search_ceket(){
        homePage.searchBox().search("ceket");
        Assertions.assertTrue(productsPage.isOnProductPage() ,"Not on products page!" );
    }

    @Test
    public void select_ceket(){
        productsPage.selectProduct(1);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(), "Not on product detail page !" );
    }

    @Test
    public void add_ceket_to_cart(){
        productDetailPage.addToCart();
        Assertions.assertTrue(homePage.isProductCountUp(), "Product count did increase!");

    }

    @Test
    public void go_to_cart(){
        homePage.goToCart();
        // Ceketin sepete eklenmesi kontrolü
        Assertions.assertTrue(cartPage.checkIfProductAdded(),"Product was not added to cart");

    }
}
