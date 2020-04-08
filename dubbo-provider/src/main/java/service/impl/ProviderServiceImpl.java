package service.impl;

import service.ProviderService;

/**
 * @Description:
 * @Author: MJ
 * @Date: Created in 2020/4/8
 */
public class ProviderServiceImpl implements ProviderService {
    public String SayHello(String word) {
        return "provider :" + word;
    }
}
