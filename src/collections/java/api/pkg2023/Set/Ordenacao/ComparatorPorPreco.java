/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections.java.api.pkg2023.Set.Ordenacao;

import java.util.Comparator;

/**
 *
 * @author danilo
 */
public class ComparatorPorPreco  implements Comparator<Produto>  {
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
