/**
 * className:ZsBillinfoService
 * author:liuyibing
 * date:2019/10/14
 */
package com.lying.test.service;

import com.lying.test.pojo.ZsBillinfo;
import com.lying.test.pojo.ZsBillinfoDetail;

import java.util.List;

public interface ZsBillinfoService {
    void insert(ZsBillinfo record, List<ZsBillinfoDetail> record2);

}
