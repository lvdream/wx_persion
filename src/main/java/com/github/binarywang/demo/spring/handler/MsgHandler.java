package com.github.binarywang.demo.spring.handler;

import com.github.binarywang.demo.spring.builder.TextBuilder;
import com.github.binarywang.demo.spring.service.WeixinService;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.session.WxSession;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 
 * @author Binary Wang
 *
 */
@Component
public class MsgHandler extends AbstractHandler {

    @Override
    public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage,
      Map<String, Object> context, WxMpService wxMpService,
            WxSessionManager sessionManager)    {

        WeixinService weixinService = (WeixinService) wxMpService;
        logger.info(wxMessage.getContent());
        if (!wxMessage.getMsgType().equals(WxConsts.XML_MSG_EVENT)) {
            //TODO 可以选择将消息保存到本地
        }

        //当用户输入关键词如“你好”，“客服”等，并且有客服在线时，把消息转发给在线客服
        if (StringUtils.startsWithAny(wxMessage.getContent(), "你好", "客服")
            && weixinService.hasKefuOnline()) {
            return WxMpXmlOutMessage
                .TRANSFER_CUSTOMER_SERVICE().fromUser(wxMessage.getToUser())
                .toUser(wxMessage.getFromUser()).build();
        }
        WxSession session =  sessionManager.getSession(wxMessage.getFromUser());
//        session.setAttribute();
//        this.logger.info(sessionManager.getSession(wxMessage.getFromUser()));
        //TODO 组装回复消息
        String content = "欢迎来到萨乌的基地,选择你需要操作的功能\n" +
                "目前可用的应用\n" +
                "01.在哪(方便记忆自己的物品放在什么地方)";
        return new TextBuilder().build(content, wxMessage, weixinService);

    }

}
