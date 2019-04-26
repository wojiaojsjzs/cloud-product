package com.jzs.admin.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jzs.admin.service.Demoservice;
@Service(group = "dubbo-provider", retries = 0, timeout = 10000)
public class DemoserviceImpl implements Demoservice {
    @Override
    public String test() {
        return "sasdasdsa";
    }
}
