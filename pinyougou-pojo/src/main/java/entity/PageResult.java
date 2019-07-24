package entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangmeng
 * @date 2019/7/24
 * @desciption
 */
public class PageResult implements Serializable {
    private static final long serialVersionUID = 2740111006651432734L;


    private long total; // 总记录数
    private List rows;// 当前页记录

    public PageResult(long total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
