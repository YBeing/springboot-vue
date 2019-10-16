/**
 * className:ZsBillinfoService
 * author:liuyibing
 * date:2019/10/14
 */
package com.lying.test.service;

import com.lying.test.pojo.ZsBillinfo;
import com.lying.test.pojo.ZsBillinfoDetail;

public interface ZsBillinfoService {
    int insert(ZsBillinfo record, ZsBillinfoDetail record2);

}
