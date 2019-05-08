package com.jzs.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jzs.provider.service.Demoservice;
@Service(group = "dubbo-cosumer", retries = 0, timeout = 10000)
public class DemoserviceImpl implements Demoservice {
    @Override
    public String test() {
        return "sasdasdsa";
            }
            }
