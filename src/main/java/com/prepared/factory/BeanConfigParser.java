package com.prepared.factory;

import java.io.InputStream;
import java.util.List;

/**
 * @Author: zhongshibo
 * @Date: 2021/4/12 16:17
 */
public interface BeanConfigParser {

    List parse(InputStream inputStream);

    List parse(String configContent);
}
