package io.mysnippet.lazykeeper.manager.ocr.huaweicloud;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;

@Slf4j
@SuppressWarnings("all")
public class FapiaoOcrManager {

  public static final String USERNAME = "hw40873375";
  public static final String PASSWORD = "4R3i&Sn*Nk!+&NW";
  public static final String DOMAIN_NAME = "hw40873375";
  public static final String REGION_NAME = "cn-north-4";

  public static final String VAT_INVOICE_HTTPURI = "/v1.0/ocr/vat-invoice";

  /**
   * * 增资税发票识别
   *
   * @param imgPath
   * @return
   */
  private String vatInvoiceRec(String imgPath) {
    String content = null;
    try {
      JSONObject params = new JSONObject();
      HWOcrClientToken ocrClient =
          new HWOcrClientToken(DOMAIN_NAME, USERNAME, PASSWORD, REGION_NAME);
      HttpResponse response =
          ocrClient.RequestOcrServiceBase64(VAT_INVOICE_HTTPURI, imgPath, params);
      content = IOUtils.toString(response.getEntity().getContent(), "utf-8");
    } catch (Exception e) {
      log.error(e.getMessage(), e);
    }
    return content;
  }
}
