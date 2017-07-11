package zgprova.dao;

import java.util.HashMap;
import java.util.Map;
import zgprova.entity.Promocao;
import zgprova.entity.PromocaoLeveXPorY;
import zgprova.entity.PromocaoLeveXpagueY;

/**
 *
 * @author pedro
 */
public class PromocaoDao {

    private final Map<Integer, Promocao> promocoes;

    public PromocaoDao() {
        Promocao promocaoA = new PromocaoLeveXPorY(1, 3, 50, 130);
        Promocao promocaoB = new PromocaoLeveXPorY(2, 2, 30, 45);
        Promocao promocaoC = new PromocaoLeveXpagueY(3, 3, 20, 2);
        Promocao promocaoA2 = new PromocaoLeveXPorY(4, 7, 50, 300);

        promocoes = new HashMap<>();

        promocoes.put(1,promocaoA);
        promocoes.put(2,promocaoB);
        promocoes.put(3,promocaoC);
        promocoes.put(4,promocaoA2);
    }

    public Promocao get(int id) {
        return promocoes.get(id);
    }
}
