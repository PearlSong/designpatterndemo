package com.roking.designpattern.factory;

import com.roking.designpattern.product.operation.OperationController;
import com.roking.designpattern.product.system.GameSystem;
import com.roking.designpattern.product.userinterface.InterfaceController;

/**
 * Title:</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/10/18.
 */
public interface GameFactory {
    GameSystem customSystem();
    InterfaceController customUI();
    OperationController customOperate();
}
