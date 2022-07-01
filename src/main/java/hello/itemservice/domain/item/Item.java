package hello.itemservice.domain.item;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    void initId(Long id) {
        this.id = id;
    }

    void updateItemName(String itemName) {
        this.itemName = itemName;
    }

    void updatePrice(Integer price) {
        this.price = price;
    }

    void updateQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}