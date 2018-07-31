package org.saga.designpatten.prototype.monkey;

import java.io.Serializable;


public class GoldRingedStaff implements Serializable {
	private static final long serialVersionUID = -1023825227537742148L;
	
	private float height = 100.0f;
    private float diameter = 10.0f;
    /**
     * 增长行为，每次调用长度和半径增加一倍
     */
    public void grow(){
        this.diameter *= 2;
        this.height *= 2;
    }
    /**
     * 缩小行为，每次调用长度和半径减少一半
     */
    public void shrink(){
        this.diameter /= 2;
        this.height /= 2;
    }
}
