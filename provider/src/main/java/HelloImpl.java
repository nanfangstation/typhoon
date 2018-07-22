/*
 * Copyright (c) 2001-2018 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */

import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.fastjson.JSONObject;

/**
 * TODO
 *
 * @author Lydia
 * @version V1.0
 * @since 2018-07-20 19:14
 */
public class HelloImpl implements Hello {

    public String sayHello(String q) {
        System.out.println(
            "版本: " + JSONObject.toJSONString(RpcContext.getContext().getInvocation().getAttachment("version")));
        System.out.println("上下文: " + JSONObject.toJSONString(RpcContext.getContext().getInvocation()));
        System.out.println("url: " + JSONObject.toJSONString(RpcContext.getContext().getUrl()));
        return "Hello " + q;
    }
}
