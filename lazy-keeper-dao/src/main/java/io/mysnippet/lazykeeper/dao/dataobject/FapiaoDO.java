package io.mysnippet.lazykeeper.dao.dataobject;

import lombok.Data;

/**
 * @author wangyongtao
 * @date 2020/10/12
 */
@Data
@SuppressWarnings("all")
public class FapiaoDO {

    private long id;

    /**
     * 发票编码
     */
    private int fapiaoCode;

    /**
     * 发票号码
     */
    private int fapiaoNum;

    /**
     * 开票日期
     */
    private String dateIssued;

    /**
     * 金额(不含税)
     */
    private String amount;

}
